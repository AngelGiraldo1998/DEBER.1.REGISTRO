package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ResourceBundle;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        TextView txtrespuesta = (TextView)findViewById(R.id.id_respuesta);

        Bundle bundle = this.getIntent().getExtras();

        txtrespuesta.setText("DATOS REGISTRADO \n "
                + bundle.getString("NOMBRE")+"\n"
                + bundle.getString("CEDULA")+"\n"
                + bundle.getString("CIUDAD")+"\n"
                + bundle.getString("CELULAR")+"\n"
                + bundle.getString("CELECTRONICO")+"\n"
                + bundle.getString("SEXO")+"\n");




    }
}