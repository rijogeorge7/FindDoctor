package com.rijogeorge.network;

import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;

import io.reactivex.Single;

public interface DataManager {
    public Single<DoctorSearchResponse> getDoctors(DoctorSearchQuery doctorSearchQuery);
}
