package com.ceiba.licoreramanager.aplicacion.comando;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ComandoFactura {
private int id;
private String descripcion;
private Date fecha;
private Double total;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
