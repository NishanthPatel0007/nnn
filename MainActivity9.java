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

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_uk);  // Ensure this matches your layout file name.

        MobileAds.initialize(this, initializationStatus -> {});

        // Find the AdView and load an ad
        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        // Button 9 - Navigate back to MainActivity
        Button button_ukB = findViewById(R.id.button_ukB);
        button_ukB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to navigate back to MainActivity
                Intent intent = new Intent(MainActivity9.this, MainActivity.class);
                startActivity(intent);  // Start MainActivity
            }
        });
        Button button52 = findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this, WebViewActivity.class);
                intent.putExtra("url", "https://epaper.udayakala.news/edition/Bengaluru/UDAYAK_BAN/UDAYAK_BAN_20241003/page/1");  // Your desired URL
                startActivity(intent);  // Start WebViewActivity
            }
        });

    }
}