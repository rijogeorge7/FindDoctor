package com.rijogeorge.finddoctor.di.modules;

import com.rijogeorge.network.DataManager;
import com.rijogeorge.network.DatamanagerImpl;
import com.rijogeorge.network.repository.DoctorsRepository;
import com.rijogeorge.network.repository.DoctorsRepositoryImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    DataManager provideDataManager(DatamanagerImpl datamanager){
        return datamanager;
    }

}
