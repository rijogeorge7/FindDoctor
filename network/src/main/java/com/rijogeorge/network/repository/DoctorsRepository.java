package com.rijogeorge.network.repository;

import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;

public interface DoctorsRepository {
    public Observable<DoctorSearchResponse> getDoctors(DoctorSearchQuery doctorSearchQuery);
}
