package com.example.thefinals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity10_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity10_menu);

        // Button 9 - Navigate back to MainActivity
        Button button101 = findViewById(R.id.button101);  // Ensure button9 exists in your page01.xml
        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to MainActivity
                Intent intent = new Intent(MainActivity10_menu.this, MainActivity10_History.class);
                startActivity(intent);  // Start MainActivity
            }
        });

        Button button102 = findViewById(R.id.button102);  // Ensure button9 exists in your page01.xml
        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to MainActivity
                Intent intent = new Intent(MainActivity10_menu.this, MainActivity10_rate.class);
                startActivity(intent);  // Start MainActivity
            }
        });

        Button button103 = findViewById(R.id.button103);  // Ensure button9 exists in your page01.xml
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10_menu.this, MainActivity10_About.class);
                startActivity(intent);
            }
        });


        Button button104 = findViewById(R.id.button104);  // Ensure button9 exists in your page01.xml
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to MainActivity
                Intent intent = new Intent(MainActivity10_menu.this, MainActivity10_feedback.class);
                startActivity(intent);  // Start MainActivity
            }
        });

        Button button_exit1 = findViewById(R.id.button_exit1);  // Ensure button9 exists in your page01.xml
        button_exit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to MainActivity
                Intent intent = new Intent(MainActivity10_menu.this, MainActivity.class);
                startActivity(intent);  // Start MainActivity
            }
        });

        Button button_exit2 = findViewById(R.id.button_exit2);  // Ensure button9 exists in your page01.xml
        button_exit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to MainActivity
                Intent intent = new Intent(MainActivity10_menu.this, MainActivity.class);
                startActivity(intent);  // Start MainActivity
            }
        });
    }
}