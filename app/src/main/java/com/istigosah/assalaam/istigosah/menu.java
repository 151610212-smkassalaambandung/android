package com.istigosah.assalaam.istigosah;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.AlertDialog;

import android.view.Menu;

import com.istigosah.assalaam.istigosah.R;
import com.istigosah.assalaam.istigosah.homee;

public class menu extends AppCompatActivity{

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
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apa kalian ingin Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        menu.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present. getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
