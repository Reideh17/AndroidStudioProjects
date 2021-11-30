package com.example.reto_uno;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class productos2 extends AppCompatActivity {
    private EditText codigo;// = (EditText)findViewById(R.id.editTextNumber);
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos2);
        codigo =  (EditText)findViewById(R.id.txt_codigo);
        resultado = (TextView)findViewById((R.id.txtv_resultado)) ;
    }
    public void agregar(View view){
        int cod_producto = Integer.parseInt(codigo.getText().toString());

        resultado.setText("Se agrego un producto de manera correcta.\n Codigo :"+cod_producto);



    }
}