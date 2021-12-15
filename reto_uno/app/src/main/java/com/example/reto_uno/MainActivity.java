package com.example.reto_uno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.icon_barra);

        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.manu_izq, menu);
        return true;
    }

    public void productos(View view){
        Toast.makeText(getApplicationContext(), " Opcion de Productos", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,productos2.class);
        startActivity(intent);
        //finish();
    }
    public void servicios(View view){
        Toast.makeText(getApplicationContext(), "Opcion de Servicios", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,servicios.class);
        startActivity(intent);
        //finish();
    }
    public void sucursales(View view){
        Toast.makeText(getApplicationContext(), "Opcion de Sucursales", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,sucursales.class);
        startActivity(intent);
        //finish();
    }
    public void ajustes(View view){
        Intent intent = new Intent(MainActivity.this,ajustes.class);
        startActivity(intent);
        //finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option1:
                Toast.makeText(getApplicationContext(), "Opcion de Ajustes", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this, ajustes.class);
                startActivity(intent1);               //finish();
                return true;
            case R.id.option2:
                Toast.makeText(getApplicationContext(), "Opcion de  Productos", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(MainActivity.this, productos2.class);
                startActivity(intent2);                //finish();
                return true;
            case R.id.option3:
                Toast.makeText(getApplicationContext(), "Opcion de  Servicios", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(MainActivity.this, servicios.class);
                startActivity(intent3);                //finish();
                return true;
            case R.id.option4:
                Toast.makeText(getApplicationContext(), "Opcion de Sucursales", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity.this, sucursales.class);
                startActivity(intent4);                //finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}