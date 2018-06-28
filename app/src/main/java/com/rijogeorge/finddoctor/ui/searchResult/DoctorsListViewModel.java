package com.rijogeorge.finddoctor.ui.searchResult;

import android.arch.lifecycle.ViewModel;

import com.rijogeorge.finddoctor.FindDoctorApplication;
import com.rijogeorge.finddoctor.di.components.DaggerApplicationComponent;
import com.rijogeorge.network.DataManager;
import com.rijogeorge.network.DatamanagerImpl;
import com.rijogeorge.network.model.Data;
import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;
import com.rijogeorge.network.model.Doctors;
import com.rijogeorge.network.model.Practices;
import com.rijogeorge.network.model.Profile;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class DoctorsListViewModel extends ViewModel {
    private DataManager dataManager;
    List<Profile> doctorsList;
    public DoctorsListViewModel(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void loadDoctors(DoctorSearchQuery doctorSearchQuery) {

         dataManager.getDoctors(doctorSearchQuery)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccessDoctorLoading, this::OnFailureDoctorLoading);
    }

    private void onSuccessDoctorLoading(DoctorSearchResponse doctorSearchResponse) {
        doctorsList=new ArrayList<>();
        for(Data data : doctorSearchResponse.getData()){
            doctorsList.add(data.getProfile());
        }
    }


    private void OnFailureDoctorLoading(Throwable e) {
        int i=0;
    }
    // TODO: Implement the ViewModel
}
