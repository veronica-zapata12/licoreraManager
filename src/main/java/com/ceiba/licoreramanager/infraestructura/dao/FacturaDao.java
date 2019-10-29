package com.ceiba.licoreramanager.infraestructura.dao;

import com.ceiba.licoreramanager.dominio.modelo.dto.FacturaDto;
import com.ceiba.licoreramanager.dominio.modelo.dto.ItemFacturaDto;
import com.ceiba.licoreramanager.dominio.modelo.dto.ProductoDto;
import com.ceiba.licoreramanager.dominio.modelo.entidad.FacturaEntidad;
import com.ceiba.licoreramanager.dominio.modelo.entidad.ItemFacturaEntidad;
import com.ceiba.licoreramanager.dominio.negocio.CalculoParcial;
import com.ceiba.licoreramanager.dominio.puerto.repositorio.FacturaRepositorio;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class FacturaDao {
private ModelMapper modelMapper=new ModelMapper();
private Date fecha=new Date();

@Autowired
    private ProductoDto productoDto;
    @Autowired
    private ItemFacturaDto itemFacturaDto;
@Autowired
    FacturaRepositorio facturaRepositorio;

public void facturar(FacturaDto facturaDto){
    facturaDto=new FacturaDto();
    FacturaEntidad facturaEntidad =modelMapper.map(facturaDto,FacturaEntidad.class);
    facturaRepositorio.save(facturaEntidad);
}
}
