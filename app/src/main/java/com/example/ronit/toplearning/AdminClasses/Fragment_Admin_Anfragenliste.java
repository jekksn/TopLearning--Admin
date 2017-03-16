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
public class Fragment_Admin_Anfragenliste extends Fragment {


    public Fragment_Admin_Anfragenliste() {
        // Required empty public constructor
    }

    private ListView lvs5;

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

        View view =  inflater.inflate(R.layout.fragment_admin_schuelerliste, container, false);


        String termine111[] = {"Schüler 1", "Schüler 2", "Schüler 3", "Schüler 4", "Schüler 5",
                "Schüler 6", "Schüler 7",
                "SSchüler 8", "Schüler 9", "Schüler 10", "Schüler 11"};

        lvs5 = (ListView) view.findViewById(R.id.list_view);
        inputSearch = (EditText) view.findViewById(R.id.inputSearch);



        getActivity().setTitle("Anfragenliste");


        adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.admin_itemsanfragenliste, R.id.anfragen_liste, termine111);
        lvs5.setAdapter(adapter);


        lvs5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Fragment_Admin_Anfrage_Nachhilfe fragment5225 = new Fragment_Admin_Anfrage_Nachhilfe();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
                fragmentTransaction.replace(R.id.fragment_container, fragment5225).addToBackStack("tag").commit();

            }
        });



        // Inflate the layout for this fragment
        return view;
    }

}
