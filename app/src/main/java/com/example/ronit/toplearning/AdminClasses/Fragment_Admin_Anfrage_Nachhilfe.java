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
public class Fragment_Admin_Anfrage_Nachhilfe extends Fragment {


    public Fragment_Admin_Anfrage_Nachhilfe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Nachhilfestunden Anfrage");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__admin__anfrage__nachhilfe, container, false);

        Button lehrerliste = (Button) view.findViewById(R.id.button6);

        lehrerliste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment_Admin_Lehrerliste fragment177788 = new Fragment_Admin_Lehrerliste();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
                fragmentTransaction.replace(R.id.fragment_container, fragment177788).addToBackStack("tag").commit();
            }
        });


        return view;




    }

}
