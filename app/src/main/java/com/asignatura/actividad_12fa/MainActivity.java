package com.asignatura.actividad_12fa;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Enviar;
    EditText txtDat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDat = (EditText) findViewById(R.id.txtDatos);
        Enviar = (Button) findViewById(R.id.btnEnviar);
        /// Implementacion de OnClickListener (su click rapido)///
        Enviar.setOnClickListener(this);
    }


    public void enviarDatos(View v) {

        //Convierte el EditText a String
        String datos = txtDat.getText().toString();
        // Crea Intent
        Intent pasardatos = new Intent (MainActivity.this, Activity2.class);
        //Envia Datos
        pasardatos.putExtra("datos",datos);
        //Inicia Activity2
        startActivity(pasardatos);


    }

    @Override
    public void onClick(View view) {
        enviarDatos(view);
    }
}