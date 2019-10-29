package com.ceiba.licoreramanager.aplicacion.comando;

import org.springframework.stereotype.Component;

import java.awt.geom.Arc2D;
import java.util.Date;

@Component
public class ComandoProducto {
    private int id;
    private String nombre;
    private Double valor;

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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
