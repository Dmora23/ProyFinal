package com.example.proyecto_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity2 extends EvaluacionCliente {
    TextView salida;
    EditText nombre;
    Button uno,dos,tres;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        salida = (TextView) findViewById(R.id.txvSalidap);
        nombre = (EditText) findViewById(R.id.edtNombre);
        uno = (Button) findViewById(R.id.btnOpcion1);
        dos = (Button) findViewById(R.id.btnOpcion2);
        tres= (Button) findViewById(R.id.btnOpcion3);
        salida.setText("El es:"+nombre);
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),MainActivity3.class));
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),MainActivity31.class));
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),MainActivity32.class));
            }
        });




    }
}