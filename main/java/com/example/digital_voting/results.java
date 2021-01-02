package com.example.digital_voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class results extends AppCompatActivity {
    Button backbutton,signout_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        backbutton=(Button)findViewById(R.id.backbutton);
        signout_btn=(Button)findViewById(R.id.signout_btn);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        signout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutfn();
            }
        });
    }
    public void logoutfn(){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}