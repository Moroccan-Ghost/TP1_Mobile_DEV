package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView1 = findViewById(R.id.textView4);
        TextView textView2 = findViewById(R.id.textView5);

        Bundle bundle = getIntent().getExtras();
        textView1.setText(bundle.getString("txtView1") +" : " + bundle.getString("username"));
        textView2.setText(bundle.getString("txtView2") +" : " + bundle.getString("passwd"));
    }

    public void returnHome(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}