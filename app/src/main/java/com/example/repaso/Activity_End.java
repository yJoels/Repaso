package com.example.repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_End extends AppCompatActivity {
    private TextView text_nombre;
    private TextView text_base;

    private EditText edit_apellido;
    private EditText edit_exponente;
    private EditText edit_factorial;


    String nombre,base;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        text_nombre = findViewById(R.id.nombres);
        text_base = findViewById(R.id.base);
        edit_apellido = findViewById(R.id.apellidos);
        edit_exponente = findViewById(R.id.exponente);
        edit_factorial = findViewById(R.id.factorial);

        nombre = getIntent().getExtras().getString("nombre");
        base = getIntent().getExtras().getString("base");

        text_nombre.setText(nombre);
        text_base.setText(base);


    }

    public void CerrarActivity3(View view){
        String apellildo,exponente,factorial;

        apellildo = edit_apellido.getText().toString();
        exponente = edit_exponente.getText().toString();
        factorial = edit_factorial.getText().toString();

        Intent i = new Intent();
        i.putExtra("nombre",nombre);
        i.putExtra("apellido",apellildo);
        i.putExtra("base",base);
        i.putExtra("exponente",exponente);
        i.putExtra("factorial",factorial);

        setResult(Activity.RESULT_OK,i);
        this.finish();

    }

    }