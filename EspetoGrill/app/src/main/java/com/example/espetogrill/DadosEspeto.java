package com.example.espetogrill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class DadosEspeto extends AppCompatActivity {

    TextView tipo, preco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_espeto);

        tipo = findViewById(R.id.txtTipo);
        preco = findViewById(R.id.txtPreco);

        SharedPreferences recuperarDados = getSharedPreferences("TabelaDados", Context.MODE_PRIVATE);

        tipo.setText(recuperarDados.getString("Tipo", "Nulo"));
        preco.setText(recuperarDados.getString("Preco", "Nulo"));
    }
}