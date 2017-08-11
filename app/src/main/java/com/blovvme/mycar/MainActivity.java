package com.blovvme.mycar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by Blovvme on 8/11/17.
 */
public class MainActivity extends AppCompatActivity implements AddNewCarFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddNewCarFragment newCar = new AddNewCarFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.flFrame1, newCar, "MainActivity").commit();

        CarRecyclerViewFragment carList = new CarRecyclerViewFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.flFrame2, carList, "MainActivity").commit();
    }

    @Override
    public void onFragmentInteraction(Car car) {

    }
}