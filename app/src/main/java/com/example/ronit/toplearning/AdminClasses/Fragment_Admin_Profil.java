package com.example.ronit.toplearning.AdminClasses;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ronit.toplearning.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Admin_Profil extends Fragment {


    public Fragment_Admin_Profil() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        getActivity().setTitle("Profil");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__admin__profil, container, false);
    }

}
