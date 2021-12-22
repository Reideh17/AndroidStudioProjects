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
    private int id = 0;
    private String title = "";
    private String description = "";
    private byte[] image;

    private ImageView imgProduct;
    private TextView tvTitle, tvDescription, tvId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_productos);

        try{
            Intent intent = getIntent();
            id = intent.getIntExtra("id",0);
            title = intent.getStringExtra("title");
            description = intent.getStringExtra("description");
            image = intent.getByteArrayExtra("image");

            tvTitle = (TextView) findViewById(R.id.titleP);
            tvDescription = (TextView) findViewById(R.id.descriptionP);
            tvId = (TextView) findViewById(R.id.idP);
            imgProduct = (ImageView) findViewById(R.id.imageP);

            tvTitle.setText(title);
            tvDescription.setText(description);
            Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
            imgProduct.setImageBitmap(bitmap);
            tvId.setText("ID: "+id);
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
        }


    }
}