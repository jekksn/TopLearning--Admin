package com.example.ronit.toplearning.AdminClasses;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ronit.toplearning.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Admin_Abrechnung_Lehrerprotokoll extends Fragment {






    public Fragment_Admin_Abrechnung_Lehrerprotokoll() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Lehrerprotokoll");
        View view = inflater.inflate(R.layout.fragment_admin__abrechnung__lehrerprotokoll, container, false);


        Button Lehrer = (Button) view.findViewById(R.id.button7);
        Lehrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment_Admin_Lehrerprofil fragment17777 = new Fragment_Admin_Lehrerprofil();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
                fragmentTransaction.replace(R.id.fragment_container, fragment17777).addToBackStack("tag").commit();
            }
        });

        return view;

    }

}
