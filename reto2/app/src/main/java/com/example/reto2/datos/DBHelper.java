package com.example.reto2.datos;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private SQLiteDatabase sqLiteDatabase;

    public DBHelper(@Nullable Context context) {
        super(context,"Habilitacion4b.db",null,1);
        sqLiteDatabase = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE productos (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "title VARCHAR,"+
                "description VARCHAR,"+
                "image BLOB" +
                ")");
        db.execSQL("CREATE TABLE servicios (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "name VARCHAR,"+
                "descripcion VARCHAR,"+
                "precio VARCHAR,"+
                "image BLOB" +
                ")");
        db.execSQL("CREATE TABLE sucursales (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "name VARCHAR,"+
                "descripcion VARCHAR,"+
                "location VARCHAR,"+
                "image BLOB" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS productos");
        db.execSQL("DROP TABLE IF EXISTS servicios");
        db.execSQL("DROP TABLE IF EXISTS sucursales");
    }

    /* procesos del aplicacion */

    public void insertproductos (String title, String description, byte[] image){
        String sql= "INSERT INTO productos VALUES(null, ?, ?, ?)";
        SQLiteStatement statement = sqLiteDatabase.compileStatement(sql);
        statement.clearBindings();

        statement.bindString(1,title);
        statement.bindString(2,description);
        statement.bindBlob(3,image);

        statement.executeInsert();

    }

    public Cursor getproductos (){
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM productos",null);
        return cursor;
    }

    public void deleteprocuto (int id){
        sqLiteDatabase.execSQL("DELETE FROM productos WHERE id = "+ id);

    }





}
