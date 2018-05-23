package com.rijogeorge.network;

import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.repository.DoctorsRepository;
import com.rijogeorge.network.repository.DoctorsRepositoryImpl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DatamanagerImplTest {

    @InjectMocks DataManager dataManager = new DatamanagerImpl();

    @Mock
    DoctorSearchQuery mMockDoctorSearchQuery;
    @Mock
    DoctorsRepository mMockDoctorsRepository;

    @Before
    public void setUp() throws Exception {
        //dataManager = new DatamanagerImpl();
    }

    @Test
    public void getDoctors() {
        dataManager.getDoctors(mMockDoctorSearchQuery);
        verify(mMockDoctorsRepository).getDoctors(mMockDoctorSearchQuery);
    }
}