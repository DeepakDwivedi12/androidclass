package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    RadioButton dl,mb,bn;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl=findViewById(R.id.del);
        mb=findViewById(R.id.mum);
        bn=findViewById(R.id.ban);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result="Selected city is:";
                if(dl.isChecked()){
                    result +="\n Delhi";
                }
                if(mb.isChecked()){
                    result +="\n Mumbai";
                }
                if(bn.isChecked()){
                    result +="\n Bangalore";
                }
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}