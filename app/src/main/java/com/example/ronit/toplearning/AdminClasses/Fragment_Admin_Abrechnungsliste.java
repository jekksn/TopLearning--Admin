package com.example.ronit.toplearning.AdminClasses;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.ronit.toplearning.R;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Admin_Abrechnungsliste extends Fragment {


    public Fragment_Admin_Abrechnungsliste() {
        // Required empty public constructor
    }

    private ListView lvs2;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;

    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;
    // Required empty public constructor





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment__admin__abrechnungsliste, container, false);


        String termine12[] = {"30 Jänner 2017", "30 Februar 2017", "30 März 2017", "30 April 2017", "30 Mai 2017",
                "30 Juni 2017", "30 Juli 2017",
                "30 August 2017", "30 September 2017", "30 Jänner 2017", "30 Jänner 2017"};

        lvs2 = (ListView) view.findViewById(R.id.list_view);
        inputSearch = (EditText) view.findViewById(R.id.inputSearch);



        getActivity().setTitle("Abrechnungsliste");


        adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.admin_itemsabrechnungsliste, R.id.abrechnungs_liste, termine12);
        lvs2.setAdapter(adapter);



        lvs2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Fragment_Admin_Abrechnung_Lehrerliste fragment52225 = new Fragment_Admin_Abrechnung_Lehrerliste();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
                fragmentTransaction.replace(R.id.fragment_container, fragment52225).addToBackStack("tag").commit();

            }
        });






        // Inflate the layout for this fragment
        return view;
    }

}
