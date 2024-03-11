package com.example.exp41;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exp41.R;
import com.example.exp41.SecondActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Implicit Intent Button
        Button implicitIntentButton = findViewById(R.id.implicitIntentButton);
        implicitIntentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AbulFaizBangi"));
                startActivity(intent);
            }
        });

        // Explicit Intent Button
        Button explicitIntentButton = findViewById(R.id.explicitIntentButton);
        explicitIntentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });


        // Toast Button
        Button toastButton = findViewById(R.id.toastButton);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "HI THIS IS ABULFAIZ BANGI", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

