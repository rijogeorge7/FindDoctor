package com.rijogeorge.finddoctor.ui.searchResult;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rijogeorge.finddoctor.FindDoctorApplication;
import com.rijogeorge.finddoctor.R;
import com.rijogeorge.finddoctor.ui.searchResult.adapters.DoctorListAdapter;
import com.rijogeorge.network.DataManager;
import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.Profile;

import java.util.List;

public class DoctorsListFragment extends Fragment {

    private DoctorsListViewModel mViewModel;
    public static final String DOCTOR_TYPE = "com.rijogeorge.finddoctor.ui.searchResult.doctor type";
    public static final String LOCATION = "com.rijogeorge.finddoctor.ui.searchResult.location";
    public static final String INSURENCE = "com.rijogeorge.finddoctor.ui.searchResult.insurence";

    List<Profile> doctors;
    DoctorListAdapter doctorListAdapter;


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
        View view = inflater.inflate(R.layout.doctors_list_fragment, container, false);
        RecyclerView doctorsList = view.findViewById(R.id.doctorListRecycler);
        doctorsList.setLayoutManager(new LinearLayoutManager(getActivity()));
        doctorListAdapter = new DoctorListAdapter(doctors);
        doctorsList.setAdapter(doctorListAdapter);
        return view;
    }

    private void updateDoctorList(List<Profile> doctors) {
        this.doctors = doctors;
        doctorListAdapter.updateProfiles(doctors);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //mViewModel = ViewModelProviders.of(this).get(DoctersListViewModel.class);
        // TODO: Use the ViewModel
    }

}
