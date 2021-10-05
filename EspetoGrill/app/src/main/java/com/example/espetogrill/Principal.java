package com.example.espetogrill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    Button espeto, bebida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        espeto = findViewById(R.id.btnEspetos);
        bebida = findViewById(R.id.btnBebidas);

        AcessarEspetos();
        AcessarBebida();

    }

    public void AcessarEspetos()
    {
        espeto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent espetoForm = new Intent(getApplicationContext(), FormularioEspeto.class);

                startActivity(espetoForm);
            }
        });
    }

    public void AcessarBebida()
    {
        bebida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bebidaForm = new Intent(getApplicationContext(), FormularioBebida.class);

                startActivity(bebidaForm);
            }
        });
    }
}