package com.example.reto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Form_add_Activity extends AppCompatActivity {

    private TextView tvTitulo;
    String titulo = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_add);

        tvTitulo = (TextView) findViewById(R.id.tv_titulo);
        Intent intent = getIntent();
        titulo = intent.getStringExtra("name");

        tvTitulo.setText(titulo);



    }
}