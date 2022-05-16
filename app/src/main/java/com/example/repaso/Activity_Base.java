package com.example.repaso;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_Base extends AppCompatActivity {
    private int LAUNCH_ACTIVITY_3;
    private EditText edit_nombre;
    private EditText edit_base;
    String nombre = null ,apellido,base = null ,exponente,factorial,potencia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        edit_nombre=findViewById(R.id.nombres);
        edit_base= findViewById(R.id.base);

    }
    public void abrirActividad3(View view) {
        Intent i = new Intent(this, Activity_End.class);
        i.putExtra("nombre",edit_nombre.getText().toString());
        i.putExtra("base",edit_base.getText().toString());
        startActivityForResult(i, LAUNCH_ACTIVITY_3);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == LAUNCH_ACTIVITY_3){
            if(resultCode == RESULT_OK) {
                nombre = data.getStringExtra("nombre");
                apellido = data.getStringExtra("apellido");
                base = data.getStringExtra("base");
                exponente = data.getStringExtra("exponente");
                factorial = data.getStringExtra("factorial");



                /*   Comprobar resultados
                Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show();
                Toast.makeText(this, apellido, Toast.LENGTH_SHORT).show();
                Toast.makeText(this, base, Toast.LENGTH_SHORT).show();
                Toast.makeText(this, exponente, Toast.LENGTH_SHORT).show();
                Toast.makeText(this, factorial, Toast.LENGTH_SHORT).show();*/
            }

                if(resultCode == Activity.RESULT_CANCELED){ }

        }
    }
    public void CerrarActivity2(View view){
        Intent intent = new Intent();
        intent.putExtra("nombre", nombre);
        intent.putExtra("apellido", apellido);
        intent.putExtra("base", base);
        intent.putExtra("exponente", exponente);
        intent.putExtra("numero", factorial);
        setResult(Activity.RESULT_OK, intent);
        this.finish();;
    }
}