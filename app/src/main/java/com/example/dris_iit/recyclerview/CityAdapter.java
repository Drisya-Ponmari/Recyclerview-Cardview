package com.example.dris_iit.recyclerview;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dris_iit.recyclerview.databinding.CitiesBinding;

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
       Cities status=datalist.get(position);
       holder.bind(status);
        }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
    public class  CityViewHolder extends  RecyclerView.ViewHolder{
        private CitiesBinding binding;
        public  CityViewHolder(View view){
            super(view);
            binding = DataBindingUtil.bind(view);

        }

        public void bind (Cities cities){
            binding.setPlace(cities);
        }
    }
}
