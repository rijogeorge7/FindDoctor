package com.rijogeorge.network.repository;

import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;

import io.reactivex.Single;

public interface DoctorsRepository {
    public Single<DoctorSearchResponse> getDoctors(DoctorSearchQuery doctorSearchQuery);
}
