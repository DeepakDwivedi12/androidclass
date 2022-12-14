package com.example.ratingbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button getBtn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.rating);
        getBtn = findViewById(R.id.submit);
        textView = findViewById(R.id.textview);

        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int noOfstars=ratingBar.getNumStars();
                float getrating=ratingBar.getRating();
                textView.setText("Rating is : "+getrating+"/"+noOfstars);
            }
        });
        }
    }
