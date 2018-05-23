package com.rijogeorge.network.di.components;

import com.rijogeorge.network.DatamanagerImpl;
import com.rijogeorge.network.di.modules.DataModule;
import com.rijogeorge.network.di.modules.NetworkModule;
import com.rijogeorge.network.repository.DoctorsRepositoryImpl;

import dagger.Component;

@Component(modules = {DataModule.class, NetworkModule.class})
public interface DataComponent {
    void inject (DatamanagerImpl datamanagerImpl);
}
