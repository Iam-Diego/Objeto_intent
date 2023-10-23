package com.example.objeto_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Operacion4Activity extends AppCompatActivity {
    private EditText etTemperatura;
    private EditText etPresion;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion4);

        etTemperatura = findViewById(R.id.etTemperatura);
        etPresion = findViewById(R.id.etPresion);
        tvResultado = findViewById(R.id.tvResultado);

        Button btnCalcularDensidad = findViewById(R.id.btnCalcularDensidad);
        btnCalcularDensidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realizar el cálculo de la densidad del aire
                calcularDensidadAire();
            }
        });
    }

    public void regresarAPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void calcularDensidadAire() {
        // Obtener la temperatura y la presión ingresadas por el usuario desde etTemperatura y etPresion
        String temperaturaStr = etTemperatura.getText().toString();
        String presionStr = etPresion.getText().toString();

        if (!temperaturaStr.isEmpty() && !presionStr.isEmpty()) {
            double temperatura = Double.parseDouble(temperaturaStr);
            double presion = Double.parseDouble(presionStr);

            // Realizar el cálculo de la densidad del aire (fórmula de estado ideal)
            double densidad = presion / (287.1 * (temperatura + 273.15)); // Densidad en kg/m^3

            tvResultado.setText("La densidad del aire es: " + densidad + " kg/m^3");
        } else {
            tvResultado.setText("Ingresa valores válidos para temperatura y presión.");
        }
    }
}
