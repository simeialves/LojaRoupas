package com.example.garage21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    EditText placa, numero_vaga, preco_total;
    Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        placa = findViewById(R.id.edtPlaca);
        numero_vaga = findViewById(R.id.edtNumeroVaga);
        preco_total = findViewById(R.id.edtPrecoTotal);

        cadastrar = findViewById(R.id.btnCadastrar);

        cadastrar();
    }

    public void cadastrar()
    {

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dadosVeiculoForm = new Intent(getApplicationContext(), DadosVeiculo.class);
                dadosVeiculoForm.putExtra("Placa", placa.getText().toString().trim());
                dadosVeiculoForm.putExtra("Numero_Vaga", numero_vaga.getText().toString().trim());
                dadosVeiculoForm.putExtra("Preco_Total", preco_total.getText().toString().trim());

                startActivity(dadosVeiculoForm);

                placa.setText("");
                numero_vaga.setText("");
                preco_total.setText("");

            }
        });

    }
}