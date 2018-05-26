package com.rijogeorge.finddoctor.ui.searchResult;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rijogeorge.finddoctor.R;
import com.rijogeorge.finddoctor.ui.main.MainFragment;

public class DoctorSearchListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctors_search_list_activity);
        String location = getIntent().getStringExtra(MainFragment.locationString);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.doctersListContainer, DoctorsListFragment.newInstance())
                .commit();
    }
}
