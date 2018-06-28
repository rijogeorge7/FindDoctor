package com.rijogeorge.finddoctor.ui.main;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rijogeorge.finddoctor.R;
import com.rijogeorge.finddoctor.ui.base.BaseActivity;
import com.rijogeorge.finddoctor.ui.main.MainFragment;
import com.rijogeorge.network.DatamanagerImpl;
import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends BaseActivity {

    //private final CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
        /*Disposable docterSearchSubsciption = new DatamanagerImpl().getDoctors(new DoctorSearchQuery.Builder("37.773,-122.413,1")
                .Limit(10)
                .build())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccessDoctorSearch, this::OnFailureDoctorSearch);*/
        //mCompositeDisposable.add(docterSearchSubsciption);
    }

    private void onSuccessDoctorSearch(DoctorSearchResponse doctorSearchResponse) {
    int i=0;
    }

    private void OnFailureDoctorSearch(Throwable e) {
    int i=0;
    }


}
