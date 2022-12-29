package com.example.gridview_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailedActivity extends AppCompatActivity {

    TextView dname,dprice;
    ImageView dimage;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        dname=findViewById(R.id.dname);
        dprice=findViewById(R.id.dprice);
        dimage=findViewById(R.id.dimage);

        Intent intent=getIntent();
        String name=intent.getStringExtra("pname");
        String price=intent.getStringExtra("pprice");
        int image=intent.getIntExtra("pimage",R.drawable.shoe1);

        dname.setText(name);
        dprice.setText(price);
        dimage.setImageResource(image);

        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailedActivity.this,"Your Order is placed",Toast.LENGTH_SHORT).show();
            }
        });


    }
}