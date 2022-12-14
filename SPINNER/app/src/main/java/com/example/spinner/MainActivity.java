package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.EditText;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Spinner spin;
    String[] state={"Karnataka\n","Maharashtra\n","Uttar pradesh\n","Rajasthan\n","Gujarat\n","DELHI\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin=findViewById(R.id.spinner);

        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,state);
        // note writing this or MainActivity.this is same
        // android.R.layout is to use default is android
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(arrayAdapter);
        //above set the arrayAdapter in spinner
    }

}