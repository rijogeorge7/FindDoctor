package com.rijogeorge.finddoctor.ui.searchResult;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.rijogeorge.network.DataManager;

public class DoctorsListViewModelFactory implements ViewModelProvider.Factory {
    private DataManager dataManager;
    private String doctorType;
    private String location;
    private String insurence;

    public DoctorsListViewModelFactory(DataManager dataManager, String doctorType, String location, String insurence) {
        this.dataManager = dataManager;
        this.doctorType = doctorType;
        this.location = location;
        this.insurence = insurence;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(DoctorsListViewModel.class)) {
            return (T) new DoctorsListViewModel(dataManager, doctorType, location, insurence);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
