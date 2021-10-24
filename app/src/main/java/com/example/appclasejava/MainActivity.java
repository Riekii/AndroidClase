package com.example.appclasejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onBtnClick (View view){
        EditText nombreEdit = findViewById(R.id.nombre);
        EditText edadEdit = findViewById(R.id.edad);
        EditText pesoEdit = findViewById(R.id.peso);
        EditText alturaEdit  = findViewById(R.id.altura);
    }
}