package com.rijogeorge.network;

import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;

public interface DataManager {
    public Observable<DoctorSearchResponse> getDoctors(DoctorSearchQuery doctorSearchQuery);
}
