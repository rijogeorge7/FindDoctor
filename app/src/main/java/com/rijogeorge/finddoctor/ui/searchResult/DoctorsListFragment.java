package com.rijogeorge.finddoctor.ui.searchResult;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rijogeorge.finddoctor.FindDoctorApplication;
import com.rijogeorge.finddoctor.R;
import com.rijogeorge.finddoctor.di.components.DaggerApplicationComponent;
import com.rijogeorge.network.DataManager;

public class DoctorsListFragment extends Fragment {

    private DoctorsListViewModel mViewModel;

    public static DoctorsListFragment newInstance() {
        return new DoctorsListFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        DataManager dataManager = ((FindDoctorApplication) getActivity().getApplicationContext()).getApplicationComponent().getDataManager();
        DoctorsListViewModelFactory factory = new DoctorsListViewModelFactory(dataManager);
        mViewModel = ViewModelProviders.of(this, factory).get(DoctorsListViewModel.class);
        mViewModel.loadDoctors();
        return inflater.inflate(R.layout.doctors_list_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //mViewModel = ViewModelProviders.of(this).get(DoctersListViewModel.class);
        // TODO: Use the ViewModel
    }

}
