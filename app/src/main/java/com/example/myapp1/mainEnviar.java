package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class mainEnviar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_enviar);

        //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.lblSaludo);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a mostrar
        txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("NOMBRE")
                + "\n"+bundle.getString("GENERO")
                + "\n"+bundle.getString("FECHA")
                + "\n"+bundle.getString("TELEFONO"));

    }
}