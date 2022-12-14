package com.example.a2customlistview;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class detailed extends AppCompatActivity {


    TextView dname, dprice;
    ImageView dimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        dname = findViewById(R.id.dname);
        dprice = findViewById(R.id.dprice);
        dimage = findViewById(R.id.dimage);

        Intent intent = getIntent();
        String name = intent.getStringExtra("pname");
        String price = intent.getStringExtra("pprice");
        int image = intent.getIntExtra("pimage",R.drawable.one);

        dname.setText(name);
        dprice.setText(price);
        dimage.setImageResource(image);
    }
}