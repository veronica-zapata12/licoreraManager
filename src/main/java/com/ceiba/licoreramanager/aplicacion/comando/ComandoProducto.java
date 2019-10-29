package com.ceiba.licoreramanager.aplicacion.comando;

import org.springframework.stereotype.Component;

@Component
public class ComandoProducto {
    private int id;
    private String nombre;
    private int valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
