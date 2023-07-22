package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RadioButton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btEnviar(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity7.class);

        EditText txtNombre = (EditText)findViewById(R.id.id_nombreres);
        EditText txtCedula = (EditText)findViewById(R.id.id_cedulares);
        EditText txtCiudad= (EditText)findViewById(R.id.id_ciudadres);
        EditText txtCelu=(EditText)findViewById(R.id.id_celularesres);
        EditText txtCelectronico= (EditText)findViewById(R.id.id_celectronicores);
        RadioButton Masculino = (RadioButton) findViewById(R.id.id_generos);
        RadioButton Femenino = (RadioButton) findViewById(R.id.id_sexom);
        CalendarView Calendario= (CalendarView)findViewById(R.id.id_calendariores);



        String nombre;
        String cedula;
        String ciudad;
        String celular;
        String celectronico;
        String sexo;

        long Calendario1 = Calendario.getDate();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String calendario = formatoFecha.format(new Date());


        if (Masculino.isChecked())
            sexo = "Masculino";
        else
            sexo = "Femenino";

        nombre=txtNombre.getText().toString();
        cedula=txtCedula.getText().toString();
        ciudad=txtCiudad.getText().toString();
        celular=txtCelu.getText().toString();
        celectronico=txtCelectronico.getText().toString();

        Bundle b = new Bundle();

        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("CEDULA", txtCedula.getText().toString());
        b.putString("CIUDAD", txtCiudad.getText().toString());
        b.putString("CELULAR", txtCelu.getText().toString());
        b.putString("CELECTRONICO", txtCelectronico.getText().toString());



        b.putString("NOMBRE", nombre);
        b.putString("CEDULA", cedula);
        b.putString("CIUDAD", ciudad);
        b.putString("CELULAR", celular);
        b.putString("CELECTRONICO",celectronico);
        b.putString("SEXO",sexo);



        intent.putExtras(b);
        startActivity(intent);

    }
    public void Limpiar (View view){

        EditText txtNombre = (EditText)findViewById(R.id.id_calendariores);
        CalendarView Calendario = findViewById(R.id.id_calendariores);
        EditText txtCedula = (EditText)findViewById(R.id.id_cedulares);
        EditText txtCiudad= (EditText)findViewById(R.id.id_ciudadres);
        EditText txtCelu=(EditText)findViewById(R.id.id_celularesres);
        EditText txtCelectronico= (EditText)findViewById(R.id.id_celectronicores);
        RadioButton Masculino = (RadioButton) findViewById(R.id.id_generos);
        RadioButton Femenino = (RadioButton) findViewById(R.id.id_sexom);


        txtNombre.setText("");
        txtCedula.setText("");
        txtCiudad.setText("");
        txtCelu.setText("");
        txtCelectronico.setText("");
        Masculino.setChecked(false);
        Femenino.setChecked(false);

        Calendario.setDate(System.currentTimeMillis());
        txtCiudad.setText("");
        Masculino.setChecked(false);
        Femenino.setChecked(false);
        txtCelectronico.setText("");
        txtCelectronico.setText("");

    }
}



