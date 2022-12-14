package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox mnu,rma,acm,bvb;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mnu=findViewById(R.id.manchester);
        rma=findViewById(R.id.madrid);
        acm=findViewById(R.id.milan);
        bvb=findViewById(R.id.dortmund);

        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result="Selected teams are :";
                if(mnu.isChecked()){
                    result+="\nMANCHESTER UNITED";
                }
                if(rma.isChecked()){
                    result+="\n REAL MADRID";
                }
                if(acm.isChecked()){
                    result+="\nAC MILAN";
                }
                if(bvb.isChecked()){
                    result+="\nBORUSSIA DORTMUND";
                }
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}