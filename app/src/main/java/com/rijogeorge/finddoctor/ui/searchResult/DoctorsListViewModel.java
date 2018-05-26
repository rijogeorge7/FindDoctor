package com.rijogeorge.finddoctor.ui.searchResult;

import android.arch.lifecycle.ViewModel;

import com.rijogeorge.finddoctor.FindDoctorApplication;
import com.rijogeorge.finddoctor.di.components.DaggerApplicationComponent;
import com.rijogeorge.network.DataManager;
import com.rijogeorge.network.DatamanagerImpl;
import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;
import com.rijogeorge.network.model.Doctors;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class DoctorsListViewModel extends ViewModel {
    private DataManager dataManager;;
    public DoctorsListViewModel(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void loadDoctors() {

        Disposable docterSearchSubsciption = dataManager.getDoctors(new DoctorSearchQuery.Builder("37.773,-122.413,1")
                .Limit(10)
                .build())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccessDoctorLoading, this::OnFailureDoctorLoading);
    }

    private void onSuccessDoctorLoading(DoctorSearchResponse doctorSearchResponse) {
        int k=0;
    }
    private void OnFailureDoctorLoading(Throwable e) {
        int i=0;
    }
    // TODO: Implement the ViewModel
}
