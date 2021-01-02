package com.example.digital_voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MahabubnagarDB extends AppCompatActivity {
    Button mah_leaf_vote, mah_dev_vote, mah_farmer_vote,mah_people_vote;
    Button mp1viewc,mp2viewc,mp3viewc,mp4viewc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahabubnagar_d_b);
        mah_leaf_vote=(Button)findViewById(R.id.mah_leaf_vote);
        mah_dev_vote=(Button)findViewById(R.id.mah_dev_vote);
        mah_farmer_vote=(Button)findViewById(R.id.mah_farmer_vote);
        mah_people_vote=(Button)findViewById(R.id.mah_people_vote);
        mp1viewc=(Button)findViewById(R.id.mp1viewc);
        mp2viewc=(Button)findViewById(R.id.mp2viewc);
        mp3viewc=(Button)findViewById(R.id.mp3viewc);
        mp4viewc=(Button)findViewById(R.id.mp4viewc);
        mp1viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmc1();
            }
        });
        mp2viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmc2();
            }
        });
        mp3viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmc3();
            }
        });
        mp4viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmc4();
            }
        });
        mah_leaf_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });
        mah_dev_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });
        mah_farmer_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });
        mah_people_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });

    }
    public void openmc1(){
        Intent i =new Intent(this,mah_c_one.class);
        startActivity(i);
    }
    public void openmc2(){
        Intent i =new Intent(this,mah_c_two.class);
        startActivity(i);
    }
    public void openmc3(){
        Intent i =new Intent(this,mah_c_three.class);
        startActivity(i);
    }
    public void openmc4(){
        Intent i =new Intent(this,mah_c_four.class);
        startActivity(i);
    }
    public void openFingerprintauth(){
        Intent i=new Intent(this,fingerprintauth.class);
        startActivity(i);
    }
}