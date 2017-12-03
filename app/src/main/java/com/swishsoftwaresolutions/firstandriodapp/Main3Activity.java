package com.swishsoftwaresolutions.firstandriodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(Main3Activity.this,"Inside onCreate() of Activity 1;",Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main3);
        Button click;
        click = (Button)findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(Main3Activity.this,"Inside OnStart(); of Activity 1",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(Main3Activity.this,"Inside onResume(); of Activity 1",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(Main3Activity.this,"Inside onPause(); of Activity 1",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(Main3Activity.this,"Inside onRestart(); of Activity 1",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(Main3Activity.this,"Inside onStop(); of Activity 1",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(Main3Activity.this,"Inside onDestroy(); of Activity 1",Toast.LENGTH_LONG).show();
    }
}
