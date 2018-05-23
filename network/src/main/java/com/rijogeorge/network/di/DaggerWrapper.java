package com.rijogeorge.network.di;

import com.rijogeorge.network.di.components.DaggerDataComponent;
import com.rijogeorge.network.di.components.DataComponent;

public class DaggerWrapper {

    private static DataComponent mComponent;

    public static DataComponent getComponent() {
        if(mComponent == null)
            initComponent();
        return mComponent;
    }

    private static void initComponent() {
        mComponent = DaggerDataComponent
                .builder()
                //.dataModule(new DataModule())
                .build();
    }

    private DaggerWrapper() {
    }
}
