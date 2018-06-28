package com.rijogeorge.finddoctor.ui.searchResult;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.rijogeorge.network.DataManager;
import com.rijogeorge.network.model.Data;
import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;
import com.rijogeorge.network.model.Profile;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class DoctorsListViewModel extends ViewModel {
    private DataManager dataManager;
    private String doctorType;
    private String location;
    private String insurence;
    private MutableLiveData<List<Profile>> doctorsList;
    private final CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    public LiveData<List<Profile>> getDoctorsList() {
        if(doctorsList==null){
            doctorsList = new MutableLiveData<>();
            loadDoctors(buildDoctorSearchQuery());
        }
        return doctorsList;
    }

    public DoctorsListViewModel(DataManager dataManager, String doctorType, String location, String insurence) {
        this.dataManager = dataManager;
        this.doctorType = doctorType;
        this.location = location;
        this.insurence = insurence;
        //loadDoctors(buildDoctorSearchQuery());
    }

    private DoctorSearchQuery buildDoctorSearchQuery() {
        return new DoctorSearchQuery.Builder("37.773,-122.413,1")
                .Limit(10)
                .build();
    }

    public void loadDoctors(DoctorSearchQuery doctorSearchQuery) {

        Disposable docterSearchSubsciption = dataManager.getDoctors(doctorSearchQuery)
                                                    .subscribeOn(Schedulers.io())
                                                    .observeOn(AndroidSchedulers.mainThread())
                                                    .subscribe(this::onSuccessDoctorLoading, this::OnFailureDoctorLoading);
        mCompositeDisposable.add(docterSearchSubsciption);
    }

    private void onSuccessDoctorLoading(DoctorSearchResponse doctorSearchResponse) {
        List<Profile> mDoctorsList=new ArrayList<>();
        for(Data data : doctorSearchResponse.getData()){
            mDoctorsList.add(data.getProfile());
        }
        doctorsList.setValue(mDoctorsList);
    }


    private void OnFailureDoctorLoading(Throwable e) {
        int i=0;
    }

    @Override
    protected void onCleared() {
        mCompositeDisposable.dispose();
        super.onCleared();
    }
}
