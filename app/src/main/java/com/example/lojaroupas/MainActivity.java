package com.example.lojaroupas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText descricao, fornecedor, marca, preco;
Button gravar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        descricao = findViewById(R.id.edtdescricao);
        fornecedor = findViewById(R.id.edtfornecedor);
        marca = findViewById(R.id.edtmarca);
        preco = findViewById(R.id.edtpreco);
        gravar = findViewById(R.id.btgravar);

        gravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gravar();
            }
        });
    }
    public void Gravar()
    {
        produtos p = new produtos();

        p.setDescricao(descricao.getText().toString().trim());
        p.setFornecedor(fornecedor.getText().toString().trim());
        p.setMarca(marca.getText().toString().trim());
        p.setPreco(Float.parseFloat(preco.getText().toString().trim()));

        BancoLoja.getBancodeDados(this).getDAO().insereProduto(p);
    }
}