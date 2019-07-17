package com.example.alcproj;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button mButton = (Button) findViewById(R.id.activityAclick);
        mButton.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, com.example.alcproj.activityB.class));
            }
        });

        Button nButton = (Button) findViewById(R.id.activityBclick);
        nButton.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, com.example.alcproj.activityC.class));
            }
        });
    }

}
