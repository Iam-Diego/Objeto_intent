package com.example.objeto_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Operacion3Activity extends AppCompatActivity {
    private EditText etParteRealA;
    private EditText etParteImaginariaA;
    private EditText etParteRealB;
    private EditText etParteImaginariaB;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion3);

        etParteRealA = findViewById(R.id.etParteRealA);
        etParteImaginariaA = findViewById(R.id.etParteImaginariaA);
        etParteRealB = findViewById(R.id.etParteRealB);
        etParteImaginariaB = findViewById(R.id.etParteImaginariaB);
        tvResultado = findViewById(R.id.tvResultado);

        Button btnSumar = findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realizar la suma de números complejos y mostrar el resultado en tvResultado
                sumarNumerosComplejos();
            }
        });

        Button btnRestar = findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realizar la resta de números complejos y mostrar el resultado en tvResultado
                restarNumerosComplejos();
            }
        });
    }

    public void regresarAPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void sumarNumerosComplejos() {
        // Obtener las partes real e imaginaria ingresadas por el usuario
        double parteRealA = Double.parseDouble(etParteRealA.getText().toString());
        double parteImaginariaA = Double.parseDouble(etParteImaginariaA.getText().toString());
        double parteRealB = Double.parseDouble(etParteRealB.getText().toString());
        double parteImaginariaB = Double.parseDouble(etParteImaginariaB.getText().toString());

        // Realizar la suma de números complejos
        double resultadoReal = parteRealA + parteRealB;
        double resultadoImaginario = parteImaginariaA + parteImaginariaB;

        // Mostrar el resultado en tvResultado
        tvResultado.setText("Resultado de la suma: " + resultadoReal + " + " + resultadoImaginario + "i");
    }

    private void restarNumerosComplejos() {
        // Obtener las partes real e imaginaria ingresadas por el usuario
        double parteRealA = Double.parseDouble(etParteRealA.getText().toString());
        double parteImaginariaA = Double.parseDouble(etParteImaginariaA.getText().toString());
        double parteRealB = Double.parseDouble(etParteRealB.getText().toString());
        double parteImaginariaB = Double.parseDouble(etParteImaginariaB.getText().toString());

        // Realizar la resta de números complejos
        double resultadoReal = parteRealA - parteRealB;
        double resultadoImaginario = parteImaginariaA - parteImaginariaB;

        // Mostrar el resultado en tvResultado
        tvResultado.setText("Resultado de la resta: " + resultadoReal + " + " + resultadoImaginario + "i");
    }
}
