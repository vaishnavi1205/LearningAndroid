package com.swishsoftwaresolutions.firstandriodapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Custom_list extends AppCompatActivity {
    ListView lv;
    TextView name,type,versionNumber,feature;

    ArrayList<DataModels> datamodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        lv = (ListView)findViewById(R.id.clv);
        datamodel = new ArrayList<>();

        datamodel.add(new DataModels("KitKat","Android","4",""));
        datamodel.add(new DataModels("Donut","Android","3",""));
        datamodel.add(new DataModels("Marshmellow","Android","6",""));
        CustomAdapter cust = new CustomAdapter(Custom_list.this,0);
        lv.setAdapter(cust);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                datamodel.get(i);
                Snackbar.make(view,"Name: "+datamodel.get(i).getName()+"\n"+"Type: "+datamodel.get(i).getType()+"\n"+"Version: "+datamodel.get(i).getVersion_number(),Snackbar.LENGTH_LONG).show();
            }
        });


    }

    class CustomAdapter extends ArrayAdapter{
        public CustomAdapter(Context context, int resource) {
            super(context, resource);
        }

        @Override
        public int getCount() {
            return datamodel.size();
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null){
                LayoutInflater inflater = LayoutInflater.from(Custom_list.this);
                convertView = inflater.inflate(R.layout.customlayout,null);
                name = (TextView) convertView.findViewById(R.id.name);
                type = (TextView) convertView.findViewById(R.id.type);
                versionNumber = (TextView) convertView.findViewById(R.id.versionnumber);
                feature = (TextView) convertView.findViewById(R.id.feature);
            }
            name.setText(datamodel.get(position).getName());
            type.setText(datamodel.get(position).getType());
            versionNumber.setText(datamodel.get(position).getVersion_number());
            feature.setText(datamodel.get(position).getFeature());
            return convertView;
        }


    }

}

