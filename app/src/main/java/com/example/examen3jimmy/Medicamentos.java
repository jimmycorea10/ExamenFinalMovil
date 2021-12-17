package com.example.examen3jimmy;

import java.io.Serializable;

public class Medicamentos implements Serializable {

    private  String key;
    private String nombre;
    private String descripcion;
    private String cantidad;
    private  String tiempo;
    private  String Periocidad;
    private  String url;

    public Medicamentos(String key, String nombre, String descripcion, String cantidad, String tiempo, String periocidad, String url) {
        this.key = key;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.tiempo = tiempo;
        Periocidad = periocidad;
        this.url = url;
    }

    Medicamentos(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getPeriocidad() {
        return Periocidad;
    }

    public void setPeriocidad(String periocidad) {
        Periocidad = periocidad;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
