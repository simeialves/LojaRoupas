package com.example.espetogrill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
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

        SharedPreferences recuperarDados = getSharedPreferences("TabelaDadosBebida", Context.MODE_PRIVATE);

        descricao.setText(recuperarDados.getString("Descricao", "Nulo"));
        tamanho.setText(recuperarDados.getString("Tamanho", "Nulo"));
        preco.setText(recuperarDados.getString("Preco", "Nulo"));
    }
}