package com.example.appclasejava;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        TextView bienvenido = findViewById(R.id.bienvenido2);
        TextView medida  = findViewById(R.id.textMedida);
        TextView peso  = findViewById(R.id.textPeso);

        bienvenido.setText("Hola "+ MainActivity.nombre);
        peso.setText(MainActivity.peso);
        medida.setText(MainActivity.altura);
    }
}