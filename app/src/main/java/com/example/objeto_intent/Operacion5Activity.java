package com.example.objeto_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Operacion5Activity extends AppCompatActivity {
    private EditText etPesoCorporal;
    private EditText etGrasaCorporal;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion5);

        etPesoCorporal = findViewById(R.id.etPesoCorporal);
        etGrasaCorporal = findViewById(R.id.etGrasaCorporal);
        tvResultado = findViewById(R.id.tvResultado);

        Button btnCalcularMasaMuscular = findViewById(R.id.btnCalcularMasaMuscular);
        btnCalcularMasaMuscular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realizar el cálculo de la masa muscular
                calcularMasaMuscular();
            }
        });
    }

    public void regresarAPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void calcularMasaMuscular() {
        // Obtener el peso corporal y la grasa corporal ingresados por el usuario desde etPesoCorporal y etGrasaCorporal
        String pesoCorporalStr = etPesoCorporal.getText().toString();
        String grasaCorporalStr = etGrasaCorporal.getText().toString();

        if (!pesoCorporalStr.isEmpty() && !grasaCorporalStr.isEmpty()) {
            double pesoCorporal = Double.parseDouble(pesoCorporalStr);
            double grasaCorporal = Double.parseDouble(grasaCorporalStr);

            // Realizar el cálculo de la masa muscular (por ejemplo, como el peso corporal menos la grasa corporal)
            double masaMuscular = pesoCorporal - grasaCorporal;

            tvResultado.setText("La masa muscular es: " + masaMuscular + " kg");
        } else {
            tvResultado.setText("Ingresa valores válidos para peso corporal y grasa corporal.");
        }
    }
}
