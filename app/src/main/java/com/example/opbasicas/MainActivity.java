package com.example.opbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Numero1;
    EditText Numero2;
    Button Suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Numero1  = (EditText) findViewById(R.id.num1);
        Numero2= (EditText) findViewById(R.id.num2);
        Suma = (Button) findViewById(R.id.Sumar);
    }
}
