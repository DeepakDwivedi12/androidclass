package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] pname={"Shirt one","Shirt Two","Shirt three","Shirt four",
            "Shirt five","Shirt six","Shirt seven","Shirt eight","Shirt nine",
            "Shirt ten","Shirt eleven"};

    String[] pprice={"5000 INR","5100 INR","5200 INR","5300 INR","5400 INR",
            "5500 INR","5600 INR","5700 INR","5800 INR","5900 INR","6000 INR"};

    Integer[] pimage={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,
    R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,
    R.drawable.ten,R.drawable.eleven};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       list = findViewById(R.id.list);

       MyListAdapter myListAdapter= new MyListAdapter(this,pname,pprice,pimage);
       list.setAdapter(myListAdapter);

//       list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//           @Override
//           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//               Intent intent=new Intent(MainActivity.this)
//           }
//       });


    }
}