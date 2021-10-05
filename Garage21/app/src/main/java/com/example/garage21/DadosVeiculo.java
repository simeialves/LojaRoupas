package com.example.garage21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DadosVeiculo extends AppCompatActivity {

    TextView placa, numero_vaga, preco_total;
    Button gravar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_veiculo);

        placa = findViewById(R.id.txtPlaca);
        numero_vaga = findViewById(R.id.txtNumeroVaga);
        preco_total = findViewById(R.id.txtPrecoTotal);

        Intent exibirDados = getIntent();

        placa.setText(exibirDados.getStringExtra("Placa"));
        numero_vaga.setText(exibirDados.getStringExtra("Numero_Vaga"));
        preco_total.setText(exibirDados.getStringExtra("Preco_Total"));

    }

    public void inserir()
    {
        Carro c = new Carro();

        c.setPlaca(placa.getText().toString());
        c.setNumero_vaga(numero_vaga.getText().toString());
        c.setPreco_total(Float.parseFloat(preco_total.getText().toString()));

        Toast.makeText(getApplicationContext(), "Cheguei aqui!", Toast.LENGTH_LONG).show();

        BancoGaragem.getBancodeDados(this).getDAO().insereCarro(c);

        Toast.makeText(getApplicationContext(), "Cadastrado com sucesso!", Toast.LENGTH_LONG).show();
    }
}