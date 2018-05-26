package com.rijogeorge.finddoctor.ui.searchResult;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.rijogeorge.network.DataManager;

public class DoctorsListViewModelFactory implements ViewModelProvider.Factory {
    private DataManager dataManager;

    public DoctorsListViewModelFactory(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(DoctorsListViewModel.class)) {
            return (T) new DoctorsListViewModel(dataManager);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
