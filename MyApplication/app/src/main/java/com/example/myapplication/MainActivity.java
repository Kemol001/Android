package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybutton = findViewById(R.id.Submit);
        EditText edittext = (EditText)findViewById(R.id.nameText);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = edittext.getText().toString();
                Log.d("lol2",text);
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("username",text);
                startActivity(intent);
            }
        });
    }
}