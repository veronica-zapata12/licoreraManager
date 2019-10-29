package com.ceiba.licoreramanager.dominio.modelo.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacturaDto {
    private int id;
    private String descripcion;
    private Date fecha;
    private Double total;

    private List<ItemFacturaDto> items;


    public FacturaDto() {

    }

    public FacturaDto(int id, String descripcion, Date fecha, Double total) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.total = total;
        items = new ArrayList<>();
    }

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

    public List<ItemFacturaDto> getItems() {
        return items;
    }

    public void setItems(List<ItemFacturaDto> items) {
        this.items = items;
    }

    public Double getTotales() {
        Double total = 0.00;
        for (ItemFacturaDto item : items) {
            total += item.getParcial();
        }
        return total;
    }
}


