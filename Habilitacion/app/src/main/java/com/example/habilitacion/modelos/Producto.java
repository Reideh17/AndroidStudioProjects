package com.example.habilitacion.modelos;

public class Producto {
    private int id;
    private byte [] image;
    private String titulo;
    private String descripcion;


    public Producto(int id,  String titulo, String descripcion, byte[] image) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
