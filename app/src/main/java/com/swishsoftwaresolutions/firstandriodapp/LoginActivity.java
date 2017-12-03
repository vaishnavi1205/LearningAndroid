package com.swishsoftwaresolutions.firstandriodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
     EditText usname;
     EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button;
        usname = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        button = (Button)findViewById(R.id.click);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String uname = usname.getText().toString();
                String pass = password.getText().toString();
                if(uname.equals("CodeShaala") && pass.equals("android")){
                    Intent intent = new Intent(LoginActivity.this,Custom_list.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this,"Invalid Credentials",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
