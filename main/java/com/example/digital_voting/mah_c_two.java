package com.example.digital_voting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mah_c_two extends AppCompatActivity {
    Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mah_c_two);
        backbutton=(Button)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtomahDB();
            }
        });
    }

    public void backtomahDB(){
        finish();
    }
}