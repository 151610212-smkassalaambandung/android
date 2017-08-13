package com.istigosah.assalaam.istigosah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class doa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);
        Button alfatihah =(Button) findViewById(R.id. activity_alfatihah);
        alfatihah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View menu){
                Intent myIntent = new
                        Intent(menu.getContext(),alfatihah.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button suratyasin =(Button) findViewById(R.id. activity_suratyasin);
        suratyasin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View menu){
                Intent myIntent = new
                        Intent(menu.getContext(),suratyasin.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
