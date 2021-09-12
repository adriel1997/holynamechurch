package com.hnc.hnc.holynamechurch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        String l = getIntent().getExtras().getString("id");
        WebView browser=findViewById(R.id.website);
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl(l);
    }
}
