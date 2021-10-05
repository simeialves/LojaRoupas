package com.example.hamburgueria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    TextView usuario;
    Button hamburguer, bebida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        hamburguer = findViewById(R.id.btnHamburguer);
        bebida = findViewById(R.id.btnBebida);
        usuario = findViewById(R.id.txtUsuario);

//        Intent obj = getIntent();
//        usuario.setText(obj.getStringExtra("usuario"));

        AcessarHamburguer();
        AcessarBebida();
    }

    public void AcessarHamburguer()
    {
        hamburguer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent hamburguerForm = new Intent(getApplicationContext(), FormularioHamburguer.class);

                startActivity(hamburguerForm);
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