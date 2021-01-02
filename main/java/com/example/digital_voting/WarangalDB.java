package com.example.digital_voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WarangalDB extends AppCompatActivity {
    Button war_leaf_vote, war_dev_vote, war_farmer_vote,war_people_vote;
    Button wp1viewc,wp2viewc,wp3viewc,wp4viewc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warangal_d_b);
        war_leaf_vote=(Button)findViewById(R.id.war_leaf_vote);
        war_dev_vote=(Button)findViewById(R.id.war_dev_vote);
        war_farmer_vote=(Button)findViewById(R.id.war_farmer_vote);
        war_people_vote=(Button)findViewById(R.id.war_people_vote);
        wp1viewc=(Button)findViewById(R.id.wp1viewc);
        wp2viewc=(Button)findViewById(R.id.wp2viewc);
        wp3viewc=(Button)findViewById(R.id.wp3viewc);
        wp4viewc=(Button)findViewById(R.id.wp4viewc);
        wp1viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwc1();
            }
        });
        wp2viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwc2();
            }
        });
        wp3viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwc3();
            }
        });
        wp4viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwc4();
            }
        });
        war_leaf_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });
        war_dev_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });
        war_farmer_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });
        war_people_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });

    }

    public void openwc1(){
        Intent i =new Intent(this,war_c_one.class);
        startActivity(i);
    }
    public void openwc2(){
        Intent i =new Intent(this,war_c_two.class);
        startActivity(i);
    }
    public void openwc3(){
        Intent i =new Intent(this,war_c_three.class);
        startActivity(i);
    }
    public void openwc4(){
        Intent i =new Intent(this,war_c_four.class);
        startActivity(i);
    }
    public void openFingerprintauth(){
        Intent i=new Intent(this,fingerprintauth.class);
        startActivity(i);
    }

}