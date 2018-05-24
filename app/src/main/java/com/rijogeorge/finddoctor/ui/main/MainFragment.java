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

public class MainFragment extends Fragment {

    public static final String locationString = "com.rijogeorge.finddoctor.ui.main.locationString";
    private MainViewModel mViewModel;
    private TextView locationTextView;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        locationTextView = view.findViewById(R.id.locationText);
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
        String location = locationTextView.getText().toString();
        Intent searchDoctorListIntent = new Intent(getActivity(), DoctorSearchListActivity.class);
        searchDoctorListIntent.putExtra(locationString, location);
        startActivity(searchDoctorListIntent);
    }
}
