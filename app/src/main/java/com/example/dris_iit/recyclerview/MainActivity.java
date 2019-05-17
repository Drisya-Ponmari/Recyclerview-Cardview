
package com.example.dris_iit.recyclerview;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.dris_iit.recyclerview.databinding.CitiesBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CityAdapter adapter;
    private ArrayList<Cities> citiesArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesArrayList =new ArrayList<>();
        citiesArrayList.add(new Cities("Palakkad","Kerala"));
        citiesArrayList.add(new Cities("Vashi","Maharashtra"));
        citiesArrayList.add(new Cities("Varanasi","Uttarpradesh"));
        citiesArrayList.add(new Cities("Kozhikode","Kerala"));
        citiesArrayList.add(new Cities("Kannur","Kerala"));
        citiesArrayList.add(new Cities("Chennau","TamilNadu"));
        citiesArrayList.add(new Cities("Srinagar","Jammu&Kashmir"));
        citiesArrayList.add(new Cities("Lucknow","Uttarpradesh"));
        citiesArrayList.add(new Cities("Allahabad","Uttarpradesh"));
        citiesArrayList.add(new Cities("Dehradun","Uttarakand"));
        citiesArrayList.add(new Cities("Bhopal","MadhyaPradesh"));
        citiesArrayList.add(new Cities("Banglore","Karnataka"));
        citiesArrayList.add(new Cities("Manglore","Karnataka"));


        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        adapter =new CityAdapter(citiesArrayList);
        recyclerView.setAdapter(adapter);


    }
}