package com.rijogeorge.network.repository;

import android.support.annotation.VisibleForTesting;

import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;
import com.rijogeorge.network.webServices.DoctorSearchService;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;

public class DoctorsRepositoryImpl implements DoctorsRepository {

    @Inject
    DoctorSearchService doctorSearchService;

    @Inject
    public DoctorsRepositoryImpl() {

    }

    @Override
    public Observable<DoctorSearchResponse> getDoctors(DoctorSearchQuery doctorSearchQuery) {
        return doctorSearchService.getDoctors(doctorSearchQuery.getLocation(),
                doctorSearchQuery.getLimit(),
                doctorSearchQuery.getName(),
                doctorSearchQuery.getFirst_name(),
                doctorSearchQuery.getLast_name(),
                doctorSearchQuery.getQuery(),
                doctorSearchQuery.getSpecialty_uid(),
                doctorSearchQuery.getInsurance_uid(),
                doctorSearchQuery.getPractice_uid(),
                getGenderString(doctorSearchQuery.getGender()),
                getSortString(doctorSearchQuery.getSort()),
                doctorSearchQuery.getSkip());
    }

    private String getGenderString(DoctorSearchQuery.Gender gender){
        if(gender != null){
            return gender.toString();
        }
        else
            return null;
    }

    private String getSortString(DoctorSearchQuery.Sort sort){
        if(sort != null){
            return sort.toString();
        }
        else
            return null;
    }
}
