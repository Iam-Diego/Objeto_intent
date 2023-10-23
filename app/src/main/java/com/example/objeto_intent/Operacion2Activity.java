package com.example.objeto_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Operacion2Activity extends AppCompatActivity {
    private EditText etMatrixA;
    private EditText etMatrixB;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion2);

        etMatrixA = findViewById(R.id.etMatrixA);
        etMatrixB = findViewById(R.id.etMatrixB);
        tvResultado = findViewById(R.id.tvResultado);

        Button btnSumar = findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realizar la suma de matrices y mostrar el resultado en tvResultado
                sumarMatrices();
            }
        });

        Button btnRestar = findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realizar la resta de matrices y mostrar el resultado en tvResultado
                restarMatrices();
            }
        });
    }

    public void regresarAPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void sumarMatrices() {
        // Obtener las matrices ingresadas por el usuario desde etMatrixA y etMatrixB
        String matrizAStr = etMatrixA.getText().toString();
        String matrizBStr = etMatrixB.getText().toString();

        // Dividir las cadenas en filas
        String[] filasA = matrizAStr.split(";");
        String[] filasB = matrizBStr.split(";");

        // Verificar si las matrices tienen el mismo tamaño (mismo número de filas y columnas)
        if (filasA.length != filasB.length) {
            tvResultado.setText("Las matrices deben tener el mismo tamaño para sumar.");
            return;
        }

        // Realizar la suma de matrices
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < filasA.length; i++) {
            String[] elementosA = filasA[i].split(",");
            String[] elementosB = filasB[i].split(",");

            if (elementosA.length != elementosB.length) {
                tvResultado.setText("Las matrices deben tener el mismo tamaño para sumar.");
                return;
            }

            for (int j = 0; j < elementosA.length; j++) {
                double valorA = Double.parseDouble(elementosA[j]);
                double valorB = Double.parseDouble(elementosB[j]);
                double suma = valorA + valorB;
                resultado.append(suma);
                if (j < elementosA.length - 1) {
                    resultado.append(", ");
                }
            }
            resultado.append("\n");
        }

        // Mostrar el resultado en tvResultado
        tvResultado.setText("Resultado de la suma:\n" + resultado.toString());
    }

    private void restarMatrices() {
        // Obtener las matrices ingresadas por el usuario desde etMatrixA y etMatrixB
        String matrizAStr = etMatrixA.getText().toString();
        String matrizBStr = etMatrixB.getText().toString();

        // Dividir las cadenas en filas
        String[] filasA = matrizAStr.split(";");
        String[] filasB = matrizBStr.split(";");

        // Verificar si las matrices tienen el mismo tamaño (mismo número de filas y columnas)
        if (filasA.length != filasB.length) {
            tvResultado.setText("Las matrices deben tener el mismo tamaño para restar.");
            return;
        }

        // Realizar la resta de matrices
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < filasA.length; i++) {
            String[] elementosA = filasA[i].split(",");
            String[] elementosB = filasB[i].split(",");

            if (elementosA.length != elementosB.length) {
                tvResultado.setText("Las matrices deben tener el mismo tamaño para restar.");
                return;
            }

            for (int j = 0; j < elementosA.length; j++) {
                double valorA = Double.parseDouble(elementosA[j]);
                double valorB = Double.parseDouble(elementosB[j]);
                double resta = valorA - valorB;
                resultado.append(resta);
                if (j < elementosA.length - 1) {
                    resultado.append(", ");
                }
            }
            resultado.append("\n");
        }

        // Mostrar el resultado en tvResultado
        tvResultado.setText("Resultado de la resta:\n" + resultado.toString());
    }
}
