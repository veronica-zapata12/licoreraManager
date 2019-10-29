package com.ceiba.licoreramanager.dominio.modelo.dto;

public class ItemFacturaDto {
    private int id;
    private int cantidad;
   private ProductoDto productoDto;
    public ItemFacturaDto (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public ProductoDto getProductoDto() {
        return productoDto;
    }

    public void setProductoDto(ProductoDto productoDto) {
        this.productoDto = productoDto;
    }

    public Double getParcial() {
        Double calculo=cantidad * productoDto.getValor();
        return calculo ;
    }
}
