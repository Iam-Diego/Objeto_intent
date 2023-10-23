package com.example.objeto_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOperacion1 = findViewById(R.id.btnOperacion1);
        Button btnOperacion2 = findViewById(R.id.btnOperacion2);
        Button btnOperacion3 = findViewById(R.id.btnOperacion3);
        Button btnOperacion4 = findViewById(R.id.btnOperacion4);
        Button btnOperacion5 = findViewById(R.id.btnOperacion5);

        btnOperacion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Operacion1Activity.class);
                startActivity(intent);
            }
        });

        btnOperacion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Operacion2Activity.class);
                startActivity(intent);
            }
        });

        btnOperacion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Operacion3Activity.class);
                startActivity(intent);
            }
        });

        btnOperacion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Operacion4Activity.class);
                startActivity(intent);
            }
        });

        btnOperacion5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Operacion5Activity.class);
                startActivity(intent);
            }
        });
    }
}
