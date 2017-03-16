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
public class Fragment_Admin_WelcomeHauptmenu extends Fragment {


    public Fragment_Admin_WelcomeHauptmenu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Welcome");

        View view = inflater.inflate(R.layout.fragment_admin__welcome__hauptmenu_, container, false);

        Button buttonanfragen = (Button) view.findViewById(R.id.button3);
        Button buttonmeinetermine = (Button) view.findViewById(R.id.button2);

        buttonanfragen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment_Admin_Anfragenliste fragment1777 = new Fragment_Admin_Anfragenliste();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
                fragmentTransaction.replace(R.id.fragment_container, fragment1777).addToBackStack("tag").commit();
            }
        });


        buttonmeinetermine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment_Admin_MeineTermine fragment1773 = new Fragment_Admin_MeineTermine();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
                fragmentTransaction.replace(R.id.fragment_container, fragment1773).addToBackStack("tag").commit();
            }
        });





        // Inflate the layout for this fragment
        return view;
    }

}
