package com.example.hamburgueria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormularioHamburguer extends AppCompatActivity {

    EditText nome, ingredientes, preco;
    Button visualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_hamburguer);

        nome = findViewById(R.id.edtNome);
        ingredientes = findViewById(R.id.edtIngredientes);
        preco = findViewById(R.id.edtPrecoHamburguer);

        visualizar = findViewById(R.id.btnVisualizarHambuguer);

        Visualizar();
    }

    public void Visualizar()
    {
        visualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent hamburguerForm = new Intent(getApplicationContext(), DadosHamburguer.class);
                hamburguerForm.putExtra("Nome", nome.getText().toString().trim());
                hamburguerForm.putExtra("Ingredientes", ingredientes.getText().toString().trim());
                hamburguerForm.putExtra("Preco", preco.getText().toString().trim());

                startActivity(hamburguerForm);

                nome.setText("");
                ingredientes.setText("");
                preco.setText("");
            }
        });
    }
}