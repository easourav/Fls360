package com.example.sourav.fls360.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sourav.fls360.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegistationFragment extends Fragment {


    public RegistationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registation, container, false);
    }

}
