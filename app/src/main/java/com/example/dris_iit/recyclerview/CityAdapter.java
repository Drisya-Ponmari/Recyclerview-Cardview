package com.example.dris_iit.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v7.widget.RecyclerView.*;


public  class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {

    private ArrayList<Cities> datalist;

    public CityAdapter (ArrayList<Cities> datalist) {
        this.datalist=datalist;

    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.cities,parent,false);
        return new CityViewHolder(view);

    }

    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {
        holder.citynametxt.setText(datalist.get(position).getCityname());
        holder.statetxt.setText(datalist.get(position).getState());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
    class  CityViewHolder extends  RecyclerView.ViewHolder{
        TextView citynametxt, statetxt;

        CityViewHolder(View itemView){

            super (itemView);
            citynametxt =(TextView) itemView.findViewById(R.id.city_name);
            statetxt=(TextView) itemView.findViewById(R.id.state_name);
        }

    }
}

