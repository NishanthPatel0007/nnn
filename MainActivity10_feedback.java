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

public class MainActivity10_feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity10_feedback);

        // Find button by its ID and set click listener
        Button button_fBck = findViewById(R.id.button_fBck);
        button_fBck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to navigate back to MainActivity10_menu
                Intent intent = new Intent(MainActivity10_feedback.this, MainActivity10_menu.class);
                startActivity(intent);  // Start MainActivity10_menu
            }
        });
    }
}