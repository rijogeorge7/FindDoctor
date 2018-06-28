package com.rijogeorge.network.webServices;

import com.rijogeorge.network.model.DoctorSearchResponse;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DoctorSearchService {

    @GET("doctors")
    Observable<DoctorSearchResponse> getDoctors(@Query("location") String location,
                                                @Query("limit") int limit,
                                                @Query("name") String name,
                                                @Query("first_name") String first_name,
                                                @Query("last_name") String last_name,
                                                @Query("query") String query,
                                                @Query("specialty_uid") String specialty_uid,
                                                @Query("insurance_uid") String insurance_uid,
                                                @Query("practice_uid") String practice_uid,
                                                @Query("gender") String gender,
                                                @Query("sort") String sort,
                                                @Query("skip") int skip);

}
