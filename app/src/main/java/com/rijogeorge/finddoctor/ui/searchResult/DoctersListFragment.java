package com.rijogeorge.finddoctor.ui.searchResult;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rijogeorge.finddoctor.R;

public class DoctersListFragment extends Fragment {

    private DoctersListViewModel mViewModel;

    public static DoctersListFragment newInstance() {
        return new DoctersListFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = ViewModelProviders.of(this).get(DoctersListViewModel.class);
        return inflater.inflate(R.layout.docters_list_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //mViewModel = ViewModelProviders.of(this).get(DoctersListViewModel.class);
        // TODO: Use the ViewModel
    }

}
