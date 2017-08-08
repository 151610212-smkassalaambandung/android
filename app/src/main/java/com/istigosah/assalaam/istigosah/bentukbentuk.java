package com.istigosah.assalaam.istigosah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class bentukbentuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bentukbentuk);

        Button perintah =(Button) findViewById(R.id.activity_perintah);
        perintah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),perintah.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button boleh =(Button) findViewById(R.id.activity_boleh);
        boleh.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),boleh.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button dilarang =(Button) findViewById(R.id.activity_dilarang);
        dilarang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),dilarang.class);
                startActivityForResult(myIntent, 0);
            }
        });


    }
}
