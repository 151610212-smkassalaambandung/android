package com.istigosah.assalaam.istigosah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView my = (WebView) findViewById(R.id.webview);
        my.loadUrl("http://www.smkassalaambandung.sch.id");

    }
}
