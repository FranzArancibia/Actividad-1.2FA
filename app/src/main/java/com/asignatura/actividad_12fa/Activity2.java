package com.asignatura.actividad_12fa;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    Bundle rdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //Recibe los datos
        rdatos = getIntent().getExtras();
        // Convierte los datos en String
        String datosOb = rdatos.getString("datos");
        TextView mostrardatos = (TextView) findViewById((R.id.txtDestino));
        //Muestra los datos
        mostrardatos.setText(datosOb);
    }
}