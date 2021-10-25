package com.example.appclasejava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        Button button = findViewById(R.id.enviarbutton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBtnClick(view);
            }
        });
    }
    public void onBtnClick(View v){
        Intent intent= new Intent(activity2.this,activity3.class);
        startActivity(intent);
        finish();
    }
}
