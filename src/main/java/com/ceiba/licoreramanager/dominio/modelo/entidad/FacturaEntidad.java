package com.ceiba.licoreramanager.dominio.modelo.entidad;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="factura")
public class FacturaEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "descripcion",nullable = false,length = 500)
    private String descripcion;

    @Column(name = "fecha",nullable = false,length = 500)
    @Temporal(TemporalType.DATE)
    private Date fecha;


    @PrePersist
    public void prePersist(){
        this.fecha=new Date();
    }
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "factura_id")
    private List<ItemFacturaEntidad>items;

    public FacturaEntidad() {
        items=new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public List<ItemFacturaEntidad> getItems() {
        return items;
    }

    public void setItems(List<ItemFacturaEntidad> items) {
        this.items = items;
    }
}
