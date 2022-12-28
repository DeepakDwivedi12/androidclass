package com.example.firebasesingledata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = name.getText().toString();

                FirebaseDatabase db= FirebaseDatabase.getInstance();
                DatabaseReference dbref = db.getReference();

                dbref.setValue(uname);
                name.setText("");
                Toast.makeText(getApplicationContext(), "DATA INSERTED", Toast.LENGTH_SHORT).show();
            }
        });
    }
}