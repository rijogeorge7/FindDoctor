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
import com.rijogeorge.network.DataManager;
import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.Profile;

import java.util.List;

public class DoctorsListFragment extends Fragment {

    private DoctorsListViewModel mViewModel;
    public static final String DOCTOR_TYPE = "com.rijogeorge.finddoctor.ui.searchResult.doctor type";
    public static final String LOCATION = "com.rijogeorge.finddoctor.ui.searchResult.location";
    public static final String INSURENCE = "com.rijogeorge.finddoctor.ui.searchResult.insurence";

    public static DoctorsListFragment newInstance(@NonNull String doctorType, @NonNull String location, @Nullable String insurence) {
        DoctorsListFragment doctorsListFragment = new DoctorsListFragment();
        Bundle args = new Bundle();
        args.putString(DOCTOR_TYPE, doctorType);
        args.putString(LOCATION, location);
        args.putString(INSURENCE, insurence);
        doctorsListFragment.setArguments(args);
        return doctorsListFragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        DataManager dataManager = ((FindDoctorApplication) getActivity().getApplicationContext()).getApplicationComponent().getDataManager();
        DoctorsListViewModelFactory factory = new DoctorsListViewModelFactory(dataManager,
                getArguments().getString(DOCTOR_TYPE),
                getArguments().getString(LOCATION),
                getArguments().getString(INSURENCE));
        mViewModel = ViewModelProviders.of(this, factory).get(DoctorsListViewModel.class);
        mViewModel.getDoctorsList().observe(this, doctors -> {
            updateDoctorList(doctors);
        });
        return inflater.inflate(R.layout.doctors_list_fragment, container, false);
    }

    private void updateDoctorList(List<Profile> doctors) {
        int i=0;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //mViewModel = ViewModelProviders.of(this).get(DoctersListViewModel.class);
        // TODO: Use the ViewModel
    }

}
