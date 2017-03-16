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
public class Fragment_Admin_Nachhilfetermine extends Fragment {


    public Fragment_Admin_Nachhilfetermine() {
        // Required empty public constructor
    }

    private ListView lv3;

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
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_admin_nachhilfetermine, container, false);


        String termine3[] = {"7 März 2016", "3 Jänner 2016", "12 Februar2016", "6 November 2016", "6 November 2016",
                "11 Februar2016", "1 Juni 2016",
                "9 Juni 1995", "6 November 2016", "6 November 2016", "9 Juni 2019"};

        lv3 = (ListView) view.findViewById(R.id.list_view);
        inputSearch = (EditText) view.findViewById(R.id.inputSearch);

        getActivity().setTitle("Nachhilfetermine");




        adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.admin_itemsnachhilfetermineliste, R.id.Nachhilfetermine_name, termine3);
        lv3.setAdapter(adapter);



        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Fragment_Admin_Nachhilfe_Termin fragment595 = new Fragment_Admin_Nachhilfe_Termin();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
                fragmentTransaction.replace(R.id.fragment_container, fragment595).addToBackStack("tag").commit();

            }
        });




        return view;
    }

}



