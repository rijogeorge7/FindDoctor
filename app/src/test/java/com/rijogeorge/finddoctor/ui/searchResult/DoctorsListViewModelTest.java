package com.rijogeorge.finddoctor.ui.searchResult;

import com.rijogeorge.network.DataManager;
import com.rijogeorge.network.model.DoctorSearchQuery;
import com.rijogeorge.network.model.DoctorSearchResponse;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import io.reactivex.Single;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class DoctorsListViewModelTest {

    private DoctorsListViewModel doctorsListViewModel;

    @Mock
    DataManager dataManager;
    @Mock
    DoctorSearchQuery mMockDoctorSearchQuery;
    @Mock
    Single<DoctorSearchResponse > doctorSearchResponseSingle;

    @Before
    public void setUp() throws Exception {
        doctorsListViewModel = new DoctorsListViewModel(dataManager);
    }

    @Test
    public void loadDoctors() {
        when(dataManager.getDoctors(mMockDoctorSearchQuery)).thenReturn(doctorSearchResponseSingle);
        doctorsListViewModel.loadDoctors(mMockDoctorSearchQuery);
        verify(dataManager).getDoctors(mMockDoctorSearchQuery);
    }
}