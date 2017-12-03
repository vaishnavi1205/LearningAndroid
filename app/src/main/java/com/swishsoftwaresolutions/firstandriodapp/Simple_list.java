package com.swishsoftwaresolutions.firstandriodapp;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Simple_list extends AppCompatActivity {
    String [] mobile = {"IPhone","Samsung","Nokia","Pixel","Moto","Vivo","Micromax"};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        lv = (ListView)findViewById(R.id.lv);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.layout,mobile);
        lv.setAdapter(adapter);

    }
}
