package com.istigosah.assalaam.istigosah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.istigosah.assalaam.istigosah.R;
import com.istigosah.assalaam.istigosah.homee;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button menu =(Button) findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View menu){
                Intent myIntent = new
                        Intent(menu.getContext(),homee.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton web = (ImageButton) findViewById(R.id.activity_webview);
        web.setOnClickListener(new View.OnClickListener(){
            public void onClick(View menu){
                Intent myIntent = new
                        Intent(menu.getContext(),webview.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton profil = (ImageButton) findViewById(R.id.activity_profil);
        profil.setOnClickListener(new View.OnClickListener(){
            public void onClick(View menu){
                Intent myIntent = new
                        Intent(menu.getContext(),profil.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
