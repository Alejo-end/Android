package com.example.lab5;

public class Cuenta {
    private boolean es_principal;
    private String nombre;
    private long id;

    private Cuenta(boolean es_principal, String nombre, long id){
        this.es_principal = es_principal;
        this.nombre = nombre;
        this.id = id;
    }
}
