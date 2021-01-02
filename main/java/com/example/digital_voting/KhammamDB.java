package com.example.digital_voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KhammamDB extends AppCompatActivity {
    Button kha_leaf_vote, kha_dev_vote, kha_farmer_vote,kha_people_vote;
    Button kp1viewc,kp2viewc,kp3viewc,kp4viewc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khammam_d_b);
        kha_leaf_vote=(Button)findViewById(R.id.kha_leaf_vote);
        kha_dev_vote=(Button)findViewById(R.id.kha_dev_vote);
        kha_farmer_vote=(Button)findViewById(R.id.kha_farmer_vote);
        kha_people_vote=(Button)findViewById(R.id.kha_people_vote);
        kp1viewc=(Button)findViewById(R.id.kp1viewc);
        kp2viewc=(Button)findViewById(R.id.kp2viewc);
        kp3viewc=(Button)findViewById(R.id.kp3viewc);
        kp4viewc=(Button)findViewById(R.id.kp4viewc);
        kp1viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkc1();
            }
        });
        kp2viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkc2();
            }
        });
        kp3viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkc3();
            }
        });
        kp4viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkc4();
            }
        });
        kha_leaf_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });
        kha_dev_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });
        kha_farmer_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });
        kha_people_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFingerprintauth();
            }
        });

    }
    public void openkc1(){
        Intent i =new Intent(this,kha_c_one.class);
        startActivity(i);
    }
    public void openkc2(){
        Intent i =new Intent(this,kha_c_two.class);
        startActivity(i);
    }
    public void openkc3(){
        Intent i =new Intent(this,kha_c_three.class);
        startActivity(i);
    }
    public void openkc4(){
        Intent i =new Intent(this,kha_c_four.class);
        startActivity(i);
    }
    public void openFingerprintauth(){
        Intent i=new Intent(this,fingerprintauth.class);
        startActivity(i);
    }
}