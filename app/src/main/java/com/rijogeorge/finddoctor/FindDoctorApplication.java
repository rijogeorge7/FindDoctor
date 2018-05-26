package com.rijogeorge.finddoctor;

import android.app.Activity;
import android.app.Application;

import com.rijogeorge.finddoctor.di.components.ApplicationComponent;
import com.rijogeorge.finddoctor.di.components.DaggerApplicationComponent;
import com.rijogeorge.network.DataManager;

public class FindDoctorApplication extends Application {

    private ApplicationComponent applicationComponent;
    public static FindDoctorApplication getApplication(Activity activity) {
        return (FindDoctorApplication) activity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
