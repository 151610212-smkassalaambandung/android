package com.istigosah.assalaam.istigosah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homee);


        Button pengertianistigosah =(Button) findViewById(R.id.activity_pengertian_istigosah);
        pengertianistigosah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),pengertianistigosah.class);
                startActivityForResult(myIntent, 0);
            }
        });


        Button tatacara =(Button) findViewById(R.id.activity_tata_cara);
        tatacara.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),tatacara.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button tujuan =(Button) findViewById(R.id.activity_tujuanistigosah);
        tujuan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),tujuan.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button bentukbentuk =(Button) findViewById(R.id.activity_bentukbentukistigosah);
        bentukbentuk.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),bentukbentuk.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button doaistigosah =(Button) findViewById(R.id.activity_doaistigosah);
        doaistigosah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),doa.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
