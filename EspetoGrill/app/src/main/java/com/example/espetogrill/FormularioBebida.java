package com.example.espetogrill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormularioBebida extends AppCompatActivity {

    EditText descricao, tamanho, preco;
    Button gravarDados, recuperarDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_bebida);

        descricao = findViewById(R.id.edtDescricao);
        tamanho = findViewById(R.id.edtTamanho);
        preco = findViewById(R.id.edtPrecoBebida);

        gravarDados = findViewById(R.id.btnGravarDadosBebida);
        recuperarDados = findViewById(R.id.btnRecuperarDadosBebida);

        gravarDados();
        recuperarDados();

    }

    public void gravarDados()
    {
        gravarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences objetoBebida = getSharedPreferences("TabelaDadosBebida", Context.MODE_PRIVATE);
                SharedPreferences.Editor editaDadosBebida = objetoBebida.edit();
                editaDadosBebida.putString("Descricao", descricao.getText().toString().trim());
                editaDadosBebida.putString("Tamanho", tamanho.getText().toString().trim());
                editaDadosBebida.putString("Preco", preco.getText().toString().trim());

                editaDadosBebida.apply();

                Toast.makeText(getApplicationContext(), "Dados da bebida gravados com sucesso", Toast.LENGTH_LONG).show();

                descricao.setText("");
                tamanho.setText("");
                preco.setText("");
            }
        });
    }

    public void recuperarDados()
    {
        recuperarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dadosBebidaForm = new Intent(getApplicationContext(), DadosBebida.class);
                startActivity(dadosBebidaForm);
            }
        });
    }
}