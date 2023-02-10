package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView lbContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbContador = findViewById(R.id.lbContador);
    }

    public void incrementar(View view){
        int contador = Integer.parseInt(String.valueOf(lbContador.getText()));
        contador++;
        lbContador.setText(String.valueOf(contador));
    }
}