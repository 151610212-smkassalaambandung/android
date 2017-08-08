package com.istigosah.assalaam.istigosah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class tatacara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatacara);

        Button ringan =(Button) findViewById(R.id.activity_ringan);
        ringan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),ringan.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button besar =(Button) findViewById(R.id.activity_besar);
        besar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),besar.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}
