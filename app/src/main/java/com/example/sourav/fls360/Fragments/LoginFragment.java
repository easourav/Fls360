package com.example.sourav.fls360.Fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sourav.fls360.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    TextView newUserTV;

    OnLoginFromActivityListener loginFromActivityListener;
    public interface OnLoginFromActivityListener
    {
        public void performRegister();
        public void performLogin(String name);
    }


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_login, container, false);
        newUserTV=view.findViewById(R.id.tvNewUser);

        newUserTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //call the performRegister method
                loginFromActivityListener.performRegister();
            }
        });
        return view;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        loginFromActivityListener = (OnLoginFromActivityListener) activity;
    }

}
