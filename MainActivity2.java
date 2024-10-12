package com.example.thefinals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page01);

        MobileAds.initialize(this, initializationStatus -> {});

        // Find the AdView and load an ad
        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);// Ensure this matches your layout file name.

        // Button 9 - Navigate back to MainActivity
        Button button9 = findViewById(R.id.button9);  // Ensure button9 exists in your page01.xml
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to MainActivity
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);  // Start MainActivity
            }
        });

        // Button 54 - Opens WebViewActivity with the desired URL
        Button button54 = findViewById(R.id.button54);  // Ensure button54 exists in your page01.xml
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to WebViewActivity and pass a URL
                Intent intent = new Intent(MainActivity2.this, WebViewActivity.class);
                intent.putExtra("url", "https://epaper.vijayavani.net/#");  // Pass the desired URL
                startActivity(intent);  // Start WebViewActivity
            }
        });
    }
}
