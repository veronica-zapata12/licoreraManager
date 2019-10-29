package com.ceiba.licoreramanager.dominio.modelo.entidad;

import javax.persistence.*;

@Entity
@Table(name = "facturas_items")
public class ItemFacturaEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "cantidad",nullable = false,length = 500)
    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id")
    private ProductoEntidad productoEntidad;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoEntidad getProductoEntidad() {
        return productoEntidad;
    }

    public void setProductoEntidad(ProductoEntidad productoEntidad) {
        this.productoEntidad = productoEntidad;
    }
}
