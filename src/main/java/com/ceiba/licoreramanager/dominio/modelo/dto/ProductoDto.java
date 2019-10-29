package com.ceiba.licoreramanager.dominio.modelo.dto;

import com.ceiba.licoreramanager.dominio.excepcion.validador.ValidadorArgumento;

public class ProductoDto {
    private int id;
    private String nombre;
    private int valor;
    private static final String NOMBRE_OBLIGATORIO="el nombre es obligatorio";
    private static final String VALOR_OBLIGATORIO="el valor es obligatorio";

    public ProductoDto(int id, String nombre, int valor) {
        ValidadorArgumento.validarObligatorio(nombre,NOMBRE_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(valor,VALOR_OBLIGATORIO);
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }
    public ProductoDto(){}

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
