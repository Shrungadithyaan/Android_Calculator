package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   EditText e1, e2;
   TextView tv;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.Etext1);
        e2 = findViewById(R.id.Etext2);
        tv = findViewById(R.id.Vtext);
    }

    public void doAdd(View v){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        int result = a1 + a2;
        tv.setText(""+result);
    }

    public void doSub(View v){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        int result = a1 - a2;
        tv.setText(""+result);
    }

    public void doDiv(View v){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        int result = a1 / a2;
        tv.setText(""+result);
    }

    public void doMul(View v){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        int result = a1 * a2;
        tv.setText(""+result);
    }
}