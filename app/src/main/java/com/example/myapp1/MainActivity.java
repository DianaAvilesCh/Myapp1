package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnEnviar(View view){

        Intent intent = new Intent(MainActivity.this, mainEnviar.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtTel = (EditText)findViewById(R.id.txtTelefono);
        EditText txtFecha = (EditText)findViewById(R.id.txtFecha);

        RadioGroup rgGenero = (RadioGroup) findViewById(R.id.rgGenero);

        Bundle b = new Bundle();

        int radioButtonID = rgGenero.getCheckedRadioButtonId();

        RadioButton rbM=(RadioButton) findViewById(radioButtonID);
        String texto = rbM.getText().toString();

        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("GENERO", texto);
        b.putString("TELEFONO", txtTel.getText().toString());
        b.putString("FECHA", txtFecha.getText().toString());

        intent.putExtras(b);
        startActivity(intent);
    }
}