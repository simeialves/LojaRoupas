package com.example.hamburgueria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DadosBebida extends AppCompatActivity {

    TextView descricao, tamanho, preco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_bebida);

        descricao = findViewById(R.id.txtDescricao);
        tamanho = findViewById(R.id.txtTamanho);
        preco = findViewById(R.id.txtPrecoBebida);

        Intent exibirDados = getIntent();

        descricao.setText(exibirDados.getStringExtra("Descricao"));
        tamanho.setText(exibirDados.getStringExtra("Tamanho"));
        preco.setText(exibirDados.getStringExtra("Preco"));
    }
}