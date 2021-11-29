package com.example.reto_uno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class productos extends AppCompatActivity {

    private EditText codigo;// = (EditText)findViewById(R.id.editTextNumber);
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        codigo =  (EditText)findViewById(R.id.editTextNumber);
        resultado = (TextView)findViewById((R.id.textView2)) ;
    }
    public void agregar(View view){
        int cod_producto = Integer.parseInt(codigo.getText().toString());

        resultado.setText(cod_producto);

    }
}