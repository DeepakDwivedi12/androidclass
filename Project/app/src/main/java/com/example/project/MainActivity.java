package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] pname={"Shoe one","Shoe two","Shoe three","Shoe four","Shoe five",
                    "Shoe six","Shoe seven","Shoe eight","Shoe nine","Shoe ten",
                    "Shoe eleven","Shoe twelve","Shoe thirteen","Shoe fourteen","Shoe fifteen",
                    "Shoe Sixteen","Shoe seventeen","Shoe eighteen","Shoe nineteen","Shoe twenty"};
    String[] pprice={"INR 5000","INR 5000","INR 5000","INR 5000","INR 5000",
            "INR 6000","INR 6000","INR 6000","INR 6000","INR 6000",
            "INR 7000","INR 7000","INR 7000","INR 7000","INR 7000",
            "INR 8000","INR 8000","INR 8000","INR 8000","INR 8000"};
    Integer[] pimg={R.drawable.shoe1,R.drawable.shoe2,R.drawable.shoe3,R.drawable.shoe4,
                     R.drawable.shoe5,R.drawable.shoe6,R.drawable.shoe7,R.drawable.shoe8,
                     R.drawable.shoe9,R.drawable.shoe10,R.drawable.shoe11,R.drawable.shoe12,
                     R.drawable.shoe13,R.drawable.shoe14,R.drawable.shoe15,R.drawable.shoe16,
                     R.drawable.shoe17,R.drawable.shoe18,R.drawable.shoe19,R.drawable.shoe20};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        MyGridAdapter myGridAdapter=new MyGridAdapter(this,pname,pprice,pimg);
        gridView.setAdapter(myGridAdapter);
    }
}