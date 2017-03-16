package com.example.ronit.toplearning.AdminClasses;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
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
public class Fragment_Admin_Lehrerliste extends Fragment {


    public Fragment_Admin_Lehrerliste() {

    }

    private ListView lv;

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

        View view =  inflater.inflate(R.layout.fragment_admin_lehrerliste, container, false);


        String termine[] = {"Frau. Schreiber", "Herr. Styler", "Herr. Daniel", "Frau. Katharina", "Frau. Susi",
                "Frau. Wurz", "Herr. Stütz",
                "Frau. Osterbauer", "Herr Stengel", "Herr. Kovaricek", "Frau. Grünsteidl"};

        lv = (ListView) view.findViewById(R.id.list_view);
        inputSearch = (EditText) view.findViewById(R.id.inputSearch);

        getActivity().setTitle("Lehrerliste");


        adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.admin_itemslehrerliste, R.id.Lehrer_name, termine);
        lv.setAdapter(adapter);
        inputSearch.addTextChangedListener(new TextWatcher() {


            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                Fragment_Admin_Lehrerliste.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Fragment_Admin_Lehrerprofil fragment55 = new Fragment_Admin_Lehrerprofil();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
                fragmentTransaction.replace(R.id.fragment_container, fragment55).addToBackStack("tag").commit();

            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
