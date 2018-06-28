package com.rijogeorge.finddoctor.ui.main;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rijogeorge.finddoctor.R;
import com.rijogeorge.finddoctor.ui.searchResult.DoctorSearchListActivity;
import com.rijogeorge.finddoctor.ui.searchResult.DoctorsListFragment;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    private TextView doctorTypeTextView;
    private TextView locationTextView;
    private TextView insurenceTextView;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        doctorTypeTextView = view.findViewById(R.id.doctorTypeText);
        locationTextView = view.findViewById(R.id.locationText);
        insurenceTextView = view.findViewById(R.id.insurenceText);
        view.findViewById(R.id.findButton).setOnClickListener(this::onClickFindButton);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        // TODO: Use the ViewModel
    }

    private void onClickFindButton(View view) {
        if(((MainActivity)getActivity()).isNetworkAvailable()) {
            String doctorType = doctorTypeTextView.getText().toString();
            String location = locationTextView.getText().toString();
            String insurence = insurenceTextView.getText().toString();
            Intent searchDoctorListIntent = new Intent(getActivity(), DoctorSearchListActivity.class);
            searchDoctorListIntent.putExtra(DoctorsListFragment.DOCTOR_TYPE, doctorType);
            searchDoctorListIntent.putExtra(DoctorsListFragment.LOCATION, location);
            searchDoctorListIntent.putExtra(DoctorsListFragment.INSURENCE, insurence);
            startActivity(searchDoctorListIntent);
        }
        else {
            ((MainActivity)getActivity()).showDialogMessage("Network issue", "Please check you network connectivity");
        }
    }
}
