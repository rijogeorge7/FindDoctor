package com.rijogeorge.finddoctor.di.components;

import com.rijogeorge.finddoctor.di.modules.ApplicationModule;
import com.rijogeorge.finddoctor.ui.searchResult.DoctorsListViewModel;
import com.rijogeorge.network.DataManager;
import com.rijogeorge.network.DatamanagerImpl;
import com.rijogeorge.network.di.modules.DataModule;
import com.rijogeorge.network.di.modules.NetworkModule;

import dagger.Component;

@Component(modules = {ApplicationModule.class, DataModule.class, NetworkModule.class})
public interface ApplicationComponent {

    DataManager getDataManager();


}
