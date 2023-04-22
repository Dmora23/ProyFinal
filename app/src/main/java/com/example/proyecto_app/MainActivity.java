package com.example.proyecto_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.txImUsuario);
        clave = findViewById(R.id.txImContraseña);

    }

    public void Ingresar(View view){

        if (usuario.getText().toString().equals("juan@gmail.com") && clave.getText().toString().equals("proyectofinal")){

            Intent intent = new Intent(this, EvaluacionCliente.class);
            startActivity(intent);

        }

        else{

            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();

        }
    }
}