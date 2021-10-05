package com.example.hamburgueria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormularioBebida extends AppCompatActivity {

    EditText tamanho, descricao, preco;
    Button visualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_bebida);

        descricao = findViewById(R.id.edtDescricao);
        tamanho = findViewById(R.id.edtTamanho);
        preco = findViewById(R.id.edtPrecoBebida);
        visualizar = findViewById(R.id.btnVisualizarBebida);

        Visualizar();

    }

    public void Visualizar()
    {
        visualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bebidaForm = new Intent(getApplicationContext(), DadosBebida.class);
                bebidaForm.putExtra("Descricao", descricao.getText().toString());
                bebidaForm.putExtra("Tamanho", tamanho.getText().toString());
                bebidaForm.putExtra("Preco", preco.getText().toString());

                startActivity(bebidaForm);

                descricao.setText("");
                tamanho.setText("");
                preco.setText("");
            }
        });
    }
}