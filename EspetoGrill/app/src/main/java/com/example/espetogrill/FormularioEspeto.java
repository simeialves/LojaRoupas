package com.example.espetogrill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioEspeto extends AppCompatActivity {

    EditText tipo, preco;
    Button gravarDados, recuperarDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_espeto);

        tipo = findViewById(R.id.edtTipo);
        preco = findViewById(R.id.edtPrecoEspeto);

        gravarDados = findViewById(R.id.btnGravarDadosEspeto);
        recuperarDados = findViewById(R.id.btnRecuperarDadosEspeto);

        gravarDados();
        recuperarDados();
    }


    public void gravarDados()
    {
        gravarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences objetoShared = getSharedPreferences("TabelaDados", Context.MODE_PRIVATE);
                SharedPreferences.Editor editaDados = objetoShared.edit();
                editaDados.putString("Tipo", tipo.getText().toString().trim());
                editaDados.putString("Preco", preco.getText().toString().trim());

                editaDados.apply();

                Toast.makeText(getApplicationContext(), "Dados do espeto gravados com sucesso", Toast.LENGTH_LONG).show();

                tipo.setText("");
                preco.setText("");
            }
        });
    }

    public void recuperarDados()
    {
        recuperarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dadosEspetoForm = new Intent(getApplicationContext(), DadosEspeto.class);
                startActivity(dadosEspetoForm);
            }
        });
    }
}