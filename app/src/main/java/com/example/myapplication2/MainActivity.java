package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        EditText txtUserName = findViewById(R.id.editTextTextPersonName);
        EditText txtPasswd = findViewById(R.id.editTextTextPassword2);
        TextView textView1 = findViewById(R.id.textView2);
        TextView textView2 = findViewById(R.id.textView3);

        Intent intent = new Intent(this,MainActivity2.class);
        Bundle bundle = new Bundle();

        bundle.putString("username",txtUserName.getText().toString());
        bundle.putString("passwd",txtPasswd.getText().toString());
        bundle.putString("txtView1",textView1.getText().toString());
        bundle.putString("txtView2",textView2.getText().toString());

        intent.putExtras(bundle);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Start",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Restart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Pause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Resume",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Destroy",Toast.LENGTH_LONG).show();
    }
}