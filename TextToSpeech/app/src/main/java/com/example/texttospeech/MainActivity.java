package com.example.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ImageButton btn;
    EditText name;
    TextToSpeech t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.imageButton);
        name=findViewById(R.id.editTextTextPersonName);

        t1  = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR){
                    t1.setLanguage(Locale.US);
                }
                else{
                    Toast.makeText(MainActivity.this, "Some Error happened", Toast.LENGTH_SHORT).show();
                }
            }
        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = name.getText().toString();
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
                t1.speak(result,TextToSpeech.QUEUE_FLUSH,null);
                t1.setPitch((float) 2.9);
                t1.setSpeechRate(2);
            }
        });
    }
}