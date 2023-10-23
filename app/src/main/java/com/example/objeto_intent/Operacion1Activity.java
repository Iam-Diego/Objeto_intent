package com.example.objeto_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Operacion1Activity extends AppCompatActivity {
    private EditText etNumero;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion1);

        etNumero = findViewById(R.id.etNumero);
        tvResultado = findViewById(R.id.tvResultado);

        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de nuevo a MainActivity
                Intent intent = new Intent(Operacion1Activity.this, MainActivity.class);
                startActivity(intent);
            }
        }); // Cierra el paréntesis de onClick
    }

    public void calcularRaizCuadrada(View view) {
        String numeroStr = etNumero.getText().toString();

        if (!numeroStr.isEmpty()) {
            double numero = Double.parseDouble(numeroStr);
            double resultado = Math.sqrt(numero);
            tvResultado.setText("La raíz cuadrada es: " + resultado);
        } else {
            tvResultado.setText("Ingresa un número válido.");
        }
    }
}
