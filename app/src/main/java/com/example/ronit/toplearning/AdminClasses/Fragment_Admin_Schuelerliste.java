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
public class Fragment_Admin_Schuelerliste extends Fragment {


    public Fragment_Admin_Schuelerliste() {
        // Required empty public constructor
    }



    private ListView lvs;

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


        String termine1[] = {"Kumar Ronit", "Baric Baric", "Kallenda Andreas", "Denis Kallenda", "Markus Prehtaler",
                "Eichler Andreas", "Nino Streng",
                "Ray Daniel", "Kowalski Sebastian", "Moraida Christian", "Toni Wimmer"};

        lvs = (ListView) view.findViewById(R.id.list_view);
        inputSearch = (EditText) view.findViewById(R.id.inputSearch);



        getActivity().setTitle("Schülerliste");


        adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.admin_itemsschuelerliste, R.id.Schueler_name, termine1);
        lvs.setAdapter(adapter);




        lvs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Fragment_Admin_Schuelerprofil fragment535 = new Fragment_Admin_Schuelerprofil();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
                fragmentTransaction.replace(R.id.fragment_container, fragment535).addToBackStack("tag").commit();

            }
        });





        // Inflate the layout for this fragment
        return view;
    }

}
