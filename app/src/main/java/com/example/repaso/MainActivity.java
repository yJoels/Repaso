package com.example.repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int LAUNCH_ACTIVITY_2=1;
    String nombre = null,
            apellido = null,
            base = null,
            exponente= null,
            factorial=null;

    private TextView text_nombre;
    private TextView text_apellido;
    private TextView text_base;
    private TextView text_exponente;
    private TextView text_factorial;
    //hola


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_apellido = findViewById(R.id.apellidos);
        text_nombre = findViewById(R.id.nombres);
        text_base = findViewById(R.id.base);
        text_exponente = findViewById(R.id.exponente);
        text_factorial = findViewById(R.id.factorial);
    }
    public void abrirActividad2(View view){
        Intent i = new Intent(this,Activity_Base.class);
        startActivityForResult(i,LAUNCH_ACTIVITY_2);

    }


}