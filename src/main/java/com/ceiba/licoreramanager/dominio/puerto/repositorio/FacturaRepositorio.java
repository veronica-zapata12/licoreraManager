package com.ceiba.licoreramanager.dominio.puerto.repositorio;

import com.ceiba.licoreramanager.dominio.modelo.entidad.FacturaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface FacturaRepositorio extends JpaRepository<FacturaEntidad, Serializable>{

}

