package com.example.hamburgueria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText login, senha;
    Button logar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.edtLogin);
        senha = findViewById(R.id.edtSenha);
        logar = findViewById(R.id.btnLogar);
        LogarSistema();

    }

    public void LogarSistema()
    {
        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String lg = login.getText().toString().trim();
                String sh = senha.getText().toString().trim();

                if (lg.equals("Simei") && sh.equals("123"))
                {
                    Intent tprincipal = new Intent(getApplicationContext(), Principal.class);
                    tprincipal.putExtra("Login", login.getText().toString());
                    startActivity(tprincipal);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Dados incorretos", Toast.LENGTH_LONG).show();
                    login.setText("");
                    senha.setText("");
                    login.requestFocus();
                }
            }
        });
    }
}