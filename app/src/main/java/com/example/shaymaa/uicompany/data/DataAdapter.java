package com.example.shaymaa.uicompany.data;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shaymaa.uicompany.R;

import java.util.ArrayList;

/**
 * Created by Shaymaa on 6/23/2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<Factory_data> android;

    public DataAdapter(ArrayList<Factory_data> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout. singel_card_masna, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.factory_name.setText(android.get(i).getName());
        viewHolder.cintery_name.setText(android.get(i).getVer());
        viewHolder.email_factory.setText(android.get(i).getApi());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView factory_name,cintery_name,email_factory;
        public ViewHolder(View view) {
            super(view);

            factory_name = (TextView)view.findViewById(R.id.name_factory);
            cintery_name = (TextView)view.findViewById(R.id.counter_name);
            email_factory = (TextView)view.findViewById(R.id.email_factory);

        }
    }

}

