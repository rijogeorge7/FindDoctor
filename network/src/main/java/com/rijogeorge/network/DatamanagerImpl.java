package com.rijogeorge.network;

import com.rijogeorge.network.di.DaggerWrapper;
import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;
import com.rijogeorge.network.repository.DoctorsRepository;
import com.rijogeorge.network.repository.DoctorsRepositoryImpl;

import javax.inject.Inject;

import io.reactivex.Single;

public class DatamanagerImpl implements DataManager {

    @Inject
    DoctorsRepository doctorsRepository; //= new DoctorsRepositoryImpl();

    @Inject
    public DatamanagerImpl() {
        DaggerWrapper.getComponent().inject(this);
    }

    @Override
    public Single<DoctorSearchResponse> getDoctors(DoctorSearchQuery doctorSearchQuery) {
        return doctorsRepository.getDoctors(doctorSearchQuery);
    }
}
