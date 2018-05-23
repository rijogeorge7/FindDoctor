package com.rijogeorge.network.di.modules;

import com.rijogeorge.network.repository.DoctorsRepository;
import com.rijogeorge.network.repository.DoctorsRepositoryImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    DoctorsRepository provideDoctorsRepository(DoctorsRepositoryImpl doctorsRepositoryImpl) {
        return doctorsRepositoryImpl;
    }

}
