package com.example.gridview_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] pname={"shoe one","shoe two","shoe 3","shoe 4","shoe 5",
    "shoe 6","shoe 7","shoe 8","shoe 9","shoe 10","shoe 11","shoe 12","shoe 13",
    "shoe14","shoe15","shoe16","shoe17","shoe18","shoe19","shoe20"};
    String[] pprice={"INR 5000","INR 5000","INR 5000","INR 5000","INR 5000","INR 5000","INR 5000","INR 5000","INR 5000","INR 5000",
            "INR 5000","INR 5000","INR 5000","INR 5000","INR 5000","INR 5000","INR 5000","INR 5000","INR 5000","INR 5000"};
    Integer[] pimage={R.drawable.shoe1,R.drawable.shoe2,R.drawable.shoe3,R.drawable.shoe4,R.drawable.shoe5,R.drawable.shoe6,
            R.drawable.shoe7,R.drawable.shoe8, R.drawable.shoe9,R.drawable.shoe10,R.drawable.shoe11,
            R.drawable.shoe12,R.drawable.shoe13,R.drawable.shoe14,R.drawable.shoe15,R.drawable.shoe16,
            R.drawable.shoe17,R.drawable.shoe18,R.drawable.shoe19,R.drawable.shoe20};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        MyGridAdapter myGridAdapter= new MyGridAdapter(this,pname,pprice,pimage);
        gridView.setAdapter(myGridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,DetailedActivity.class);
                intent.putExtra("pname",pname[i]);
                intent.putExtra("pprice",pprice[i]);
                intent.putExtra("pimage",pimage[i]);
                startActivity(intent);
            }
        });
    }
}