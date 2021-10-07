package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edNumero;
    private TextView tvResultado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initwidgets();
        setupButton();
        calculadora = new Calculadora();
    }

    private void setupButton() {
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumarValores();
            }
        });
    }

    private void sumarValores() {
        tvResultado.setText(Calculadora.add(edNumero.getText().toString()));
    }

    private void initwidgets() {
        edNumero = findViewById(R.id.dato);
        tvResultado = findViewById(R.id.txt);
        btnCalcular = findViewById(R.id.btn);
    }
}