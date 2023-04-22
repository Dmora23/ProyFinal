package com.example.proyecto_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import Clases.Usuario;
import Clases.UsuarioDOU;


public  class EvaluacionCliente extends AppCompatActivity {

    EditText nombre, apellido, sueldo, prestamo;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion_cliente);

        nombre = (EditText) findViewById(R.id.edtNombre);
        apellido = (EditText) findViewById(R.id.edtApellido);
        sueldo = (EditText) findViewById(R.id.edtSueldo);
        prestamo = (EditText) findViewById(R.id.edtPrestamo);

    }

    public void evaluar(View view) {

        Double evalupres,su,pres;
        String nom, ape;

        su = Double.parseDouble(sueldo.getText().toString());
        pres= Double.parseDouble(prestamo.getText().toString());
        nom = nombre.getText().toString();
        ape = apellido.getText().toString();
        evalupres = (pres/su);
        Usuario objusuario=new Usuario(nom,ape);
        UsuarioDOU objusuariodou=new UsuarioDOU(su,pres);

        if (evalupres > 40) {

            Toast.makeText(this, "Usted no califica para un préstamo, lo sentimos", Toast.LENGTH_SHORT).show();
        }

        else{
            Toast.makeText(this, "Usted califica para un préstamo", Toast.LENGTH_SHORT).show();
        }
    }

    public void prestamos(View view){

        Double eva,su,pres;
        String nom, ape;

        su = Double.parseDouble(sueldo.getText().toString());
        pres= Double.parseDouble(prestamo.getText().toString());
        nom = nombre.getText().toString();
        ape = apellido.getText().toString();
        eva = pres/su;

        if (eva < 40) {
            Toast.makeText(this, "Usted califica para un préstamo", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);


        }

        else{
            Toast.makeText(this, "Usted no califica para un préstamo, lo sentimos", Toast.LENGTH_SHORT).show();
        }

    }
}
