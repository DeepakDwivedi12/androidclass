package com.example.optionmenu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.Menu;

import androidx.annotation.NonNull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu,menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.contactus:
                Intent intent = new Intent(getApplicationContext(),contact_activity.class);
                startActivity(intent);

            case R.id.aboutus:

            case R.id.search:

            case R.id.history:

        }
        return super.onOptionsItemSelected(item);
    }
}