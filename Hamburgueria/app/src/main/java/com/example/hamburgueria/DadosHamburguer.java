package com.example.hamburgueria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DadosHamburguer extends AppCompatActivity {

    TextView nome, ingredientes, preco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_hamburguer);

        nome = findViewById(R.id.txtNome);
        ingredientes = findViewById(R.id.txtIngredientes);
        preco = findViewById(R.id.txtPreco);

        Intent exibirDados = getIntent();

        nome.setText(exibirDados.getStringExtra("Nome"));
        ingredientes.setText(exibirDados.getStringExtra("Ingredientes"));
        preco.setText(exibirDados.getStringExtra("Preco"));

    }
}