package com.example.ronit.toplearning.AdminClasses;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.ronit.toplearning.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Fragment_Admin_Lehrer_hinzufuegen extends Fragment implements View.OnClickListener {


    private List<String> Spinnerlist = new ArrayList<String>();
    String titel, vorname, nachname, straße, ort, geschlecht, plz, auto, akademiker, email, telefon;
    EditText etVorname, etNachname, etStraße, etOrt, etPlz, etEmail, etTelefon;
    Spinner spTitel;
    RadioButton rbGeschlechtw, rbGeschlechtm, rbAutoj, rbAuton, rbAkademikerA, rbAkademikerN;

    String Titel;

    Button btn;

    String isGender;
    String isAuto;
    String isAkademiker;

    public Fragment_Admin_Lehrer_hinzufuegen() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        getActivity().setTitle("Lehrer Hinzufügen");





        etVorname = (EditText) getView().findViewById(R.id.et_vorname);
        etNachname = (EditText) getView().findViewById(R.id.et_nachname);
        etStraße = (EditText) getView().findViewById(R.id.et_straße);
        etOrt = (EditText) getView().findViewById(R.id.et_ort);
        etPlz = (EditText) getView().findViewById(R.id.et_plz);
        etEmail = (EditText) getView().findViewById(R.id.et_email);
        etTelefon = (EditText) getView().findViewById(R.id.et_telefon);

        spTitel = (Spinner) getView().findViewById(R.id.sp_titel);

        btn = (Button) getView().findViewById(R.id.btnhinzufügen);


        Spinnerlist.add("");
        Spinnerlist.add("Dr.");
        Spinnerlist.add("Mag.");
        Spinnerlist.add("Dip.");
        Spinnerlist.add("Ing.");

        btn.setOnClickListener(this);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getView().getContext(), android.R.layout.simple_spinner_item, Spinnerlist);
        adapter1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spTitel.setAdapter(adapter1);

        spTitel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String pos = (String)spTitel.getItemAtPosition(position);
                titel = pos;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return inflater.inflate(R.layout.fragment__admin__lehrer_hinzufuegen, container, false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnhinzufügen:
                if (rbGeschlechtm.isChecked()){
                    isGender = "m";

                }
                else if (rbGeschlechtw.isChecked())
                {
                    isGender = "w";
                }

                if (rbAkademikerA.isChecked()){
                    isAkademiker = "1";

                }
                else if (rbAkademikerN.isChecked())
                {
                    isAkademiker = "0";
                }

                if (rbAutoj.isChecked()){
                    isAuto = "1";

                }
                else if (rbAuton.isChecked())
                {
                    isAuto = "0";
                }



                vorname = etVorname.getText().toString().trim();
                nachname = etNachname.getText().toString().trim();
                straße = etStraße.getText().toString().trim();
                ort = etOrt.getText().toString().trim();
                plz = etPlz.getText().toString().trim();
                email = etEmail.getText().toString().trim();
                telefon = etTelefon.getText().toString().trim();
                geschlecht = isGender;
                auto = isAuto;
                akademiker = isAkademiker;
                Titel = titel;
                registerTeacher(Titel, vorname, nachname, straße, ort, geschlecht, plz, auto, akademiker, email, telefon);

                break;
        }
    }


    private void registerTeacher(final String titel, final String vorname,final String nachname, final String straße, final String ort,
                              final String geschlecht, final String plz, final String auto,  final String akademiker, final String email,  final String telefon )
    {
        StringRequest strReg = new StringRequest(Request.Method.POST, config.URLGETLEHRER, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jObj = new JSONObject(response);
                    boolean error = jObj.getBoolean("error");

                    if (!error)
                    {

                    }
                    else{
                        String errormessage = jObj.getString("error_msg");

                        Toast.makeText(getView().getContext(), errormessage, Toast.LENGTH_LONG).show();
                    }
                }
                catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getView().getContext(), error.getMessage(), Toast.LENGTH_LONG).show();


            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();

                params.put("Vorname", vorname);
                params.put("Nachname", nachname);
                params.put("Geschlecht", geschlecht);
                params.put("Adresse", straße);
                params.put("Plz", plz);
                params.put("Ort", ort);
                params.put("Email", email);
                params.put("Telefon", telefon);
                params.put("Titel", titel);
                params.put("Auto", auto);
                params.put("Akademiker", akademiker);





                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(getView().getContext());
        requestQueue.add(strReg);
    }



}
