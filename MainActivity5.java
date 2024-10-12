package com.example.thefinals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page06);  // Ensure this matches your layout file name.

        MobileAds.initialize(this, initializationStatus -> {});

        // Find the AdView and load an ad
        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        // Button 9 - Navigate back to MainActivity
        Button button17 = findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to navigate back to MainActivity
                Intent intent = new Intent(MainActivity5.this, MainActivity.class);
                startActivity(intent);  // Start MainActivity
            }
        });

        Button button57 = findViewById(R.id.button57);
        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, WebViewActivity.class);
                intent.putExtra("url", "https://epaper.eesanje.com/");  // Your desired URL
                startActivity(intent);  // Start WebViewActivity
            }
        });
    }
}