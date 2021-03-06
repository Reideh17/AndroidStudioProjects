package com.example.habilitacion.presentacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.habilitacion.R;

public class show_productos extends AppCompatActivity {
    private int idProducto = 0;
    private String title = "";
    private String description = "";
    private byte[] image;

    private ImageView imgProduct;
    private TextView tvTitulo, tvDescription, tvId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_productos);

        try{
            Intent intent = getIntent();
            idProducto = intent.getIntExtra("id",0);
            title = intent.getStringExtra("title");
            description = intent.getStringExtra("description");
            image = intent.getByteArrayExtra("image");

            tvTitulo = (TextView) findViewById(R.id.titleP);
            tvDescription = (TextView) findViewById(R.id.descriptionP);
            tvId = (TextView) findViewById(R.id.idProducto);
            imgProduct = (ImageView) findViewById(R.id.imageP);

            tvTitulo.setText(title);
            tvDescription.setText(description);
            Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
            imgProduct.setImageBitmap(bitmap);
            tvId.setText("ID: "+idProducto);
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
        }


    }
}