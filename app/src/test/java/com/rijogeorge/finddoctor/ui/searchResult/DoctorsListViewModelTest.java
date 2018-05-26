package com.rijogeorge.finddoctor.ui.searchResult;

import com.rijogeorge.network.model.Doctors;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DoctorsListViewModelTest {

    private DoctorsListViewModel doctorsListViewModel;

    @Before
    public void setUp() throws Exception {
        doctorsListViewModel = new DoctorsListViewModel();
    }

    @Test
    public void getDoctors() {
        List<Doctors> doctors = doctorsListViewModel.getDoctors();
        assertNotNull(doctors);
    }
}