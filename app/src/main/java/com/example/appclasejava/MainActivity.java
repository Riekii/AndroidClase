package com.example.appclasejava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.enviarbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onBtnClick(view);
            }
        });
    }

    public static String nombre;
    public static String edad;
    public static String peso;
    public static String altura;

    public void onBtnClick(View v){
        EditText nombreEdit = findViewById(R.id.nombre);
        EditText edadEdit = findViewById(R.id.edad);
        EditText pesoEdit = findViewById(R.id.peso);
        EditText alturaEdit  = findViewById(R.id.altura);

        nombre = nombreEdit.getText().toString();
        edad = edadEdit.getText().toString();
        peso = pesoEdit.getText().toString();
        altura = alturaEdit.getText().toString();

        Intent intent= new Intent(MainActivity.this,activity2.class);
        startActivity(intent);
    }


}