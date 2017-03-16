package com.example.ronit.toplearning.AdminClasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.example.ronit.toplearning.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Admin_Welcome_Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;


    NavigationView navigationView =  null;
    Toolbar toolbar = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navi_admin_activity_welcome);

        Button buttonanfragen = (Button) findViewById(R.id.button3);


        Fragment_Admin_WelcomeHauptmenu fragment367 = new Fragment_Admin_WelcomeHauptmenu();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
        fragmentTransaction.replace(R.id.fragment_container, fragment367).addToBackStack("tag").commit();


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

            Fragment_Admin_Lehrerliste fragment27 = new Fragment_Admin_Lehrerliste();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
            fragmentTransaction.replace(R.id.fragment_container, fragment27).addToBackStack("tag").commit();



        } else if (id == R.id.nav_manage1111) {

            Fragment_Admin_Lehrer_hinzufuegen fragment1777 = new Fragment_Admin_Lehrer_hinzufuegen();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
            fragmentTransaction.replace(R.id.fragment_container, fragment1777).addToBackStack("tag").commit();


        } else if (id == R.id.nav_manage11) {

            Fragment_Admin_Schuelerliste fragment17 = new Fragment_Admin_Schuelerliste();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
            fragmentTransaction.replace(R.id.fragment_container, fragment17).addToBackStack("tag").commit();


        } else if (id == R.id.nav_slideshow) {

            Fragment_Admin_Anfragenliste fragment1 = new Fragment_Admin_Anfragenliste();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
            fragmentTransaction.replace(R.id.fragment_container, fragment1).addToBackStack("tag").commit();


        } else if (id == R.id.nav_manage) {


            Fragment_Admin_Nachhilfetermine fragment15 = new Fragment_Admin_Nachhilfetermine();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
            fragmentTransaction.replace(R.id.fragment_container, fragment15).addToBackStack("tag").commit();

        } else if (id == R.id.nav_manage1) {


            Fragment_Admin_Abrechnungsliste fragment123 = new Fragment_Admin_Abrechnungsliste();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
            fragmentTransaction.replace(R.id.fragment_container, fragment123).addToBackStack("tag").commit();


        }
        else if (id == R.id.nav_manage3) {

            Fragment_Admin_Profil fragment13 = new Fragment_Admin_Profil();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
            fragmentTransaction.replace(R.id.fragment_container, fragment13).addToBackStack("tag").commit();

        }

        else if (id == R.id.nav_manage88) {

            Admin_Statistik fragment13778 = new Admin_Statistik();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
            fragmentTransaction.replace(R.id.fragment_container, fragment13778).addToBackStack("tag").commit();

        }


        else if (id == R.id.nav_manage8855) {

            Fragment_Admin_KStempel fragment137786 = new Fragment_Admin_KStempel();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);
            fragmentTransaction.replace(R.id.fragment_container, fragment137786).addToBackStack("tag").commit();

        }


        else if (id == R.id.nav_slideshow54) {



        }




        else if (id == R.id.nav_manage4) {




            }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
