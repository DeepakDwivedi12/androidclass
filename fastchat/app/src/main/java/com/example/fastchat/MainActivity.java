package com.example.fastchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.registeration);
        register.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent;
                                            intent = new Intent(MainActivity.this, Registrationpage.class);
                                            startActivity(intent);
                                            Toast.makeText(MainActivity.this,"You are in registration page", Toast.LENGTH_SHORT).show();
                                        }
                                    }

        );
    }
}