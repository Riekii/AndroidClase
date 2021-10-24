package com.example.appclasejava;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        TextView bienvenido = findViewById(R.id.bienvenido);
        TextView edad = findViewById(R.id.edad);

        bienvenido.setText("Hola "+ MainActivity.nombre);
        edad.setText(MainActivity.edad);

    }
}
