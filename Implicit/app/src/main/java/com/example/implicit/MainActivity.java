package com.example.implicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class
MainActivity extends AppCompatActivity {

    Button btn;
    EditText editUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= findViewById(R.id.submit);
        editUrl= findViewById(R.id.url);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                String url = editUrl.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        }

        );
    }
}