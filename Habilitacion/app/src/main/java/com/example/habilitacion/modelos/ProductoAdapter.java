package com.example.habilitacion.modelos;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.habilitacion.R;
import com.example.habilitacion.modelos.Producto;
import com.example.habilitacion.presentacion.show_productos;

import java.util.ArrayList;

public class ProductoAdapter extends BaseAdapter {
    private Context context;
    ArrayList<Producto> productos;
    LayoutInflater inflater;

    public ProductoAdapter(Context context, ArrayList<Producto> productos) {
        this.context = context;
        this.productos = productos;
    }

    @Override
    public int getCount() {
        return productos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView == null){
            convertView = inflater.inflate(R.layout.productos_items, null);
        }

        ImageView imageView = convertView.findViewById(R.id.imageItem);
        TextView textView = convertView.findViewById(R.id.titleItem);
        Button button = convertView.findViewById(R.id.btnShowItem);

        Producto producto = productos.get(position);
        Bitmap bitmap = BitmapFactory.decodeByteArray(producto.getImage(), 0, producto.getImage().length);

        textView.setText(producto.getTitulo());
        imageView.setImageBitmap(bitmap);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(context, show_productos.class);
                    intent.putExtra("id", producto.getId());
                    intent.putExtra("title", producto.getTitulo());
                    intent.putExtra("description", producto.getDescripcion());
                    //intent.putExtra("image", producto.getImage());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(context, e.toString(), Toast.LENGTH_LONG).show();
                    Log.e("Error ->", e.toString());
                }

            }
        });


        return convertView;
    }
}