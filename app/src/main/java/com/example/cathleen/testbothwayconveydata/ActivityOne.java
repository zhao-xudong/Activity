package com.example.cathleen.testbothwayconveydata;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {
    Button returnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_one);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age",20);
        Toast.makeText(this,name+age,Toast.LENGTH_LONG).show();



        returnBack = (Button)findViewById(R.id.returnBack);
        returnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String name = intent.getStringExtra("name");
                int age = intent.getIntExtra("age",20);
                intent.putExtra("result","姓名"+ name +"年龄"+ age);
                setResult(0,intent);
                finish();
            }
        });
    }

}
