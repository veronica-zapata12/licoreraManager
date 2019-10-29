package com.ceiba.licoreramanager.dominio.puerto.repositorio;

import com.ceiba.licoreramanager.dominio.modelo.entidad.ProductoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ProductoRepositorio extends JpaRepository<ProductoEntidad, Serializable> {

    @Query("select p from ProductoEntidad p where p.nombre=:nombre ")
    ProductoEntidad filtrarPorNombre(@Param("nombre") String nombre);

}
