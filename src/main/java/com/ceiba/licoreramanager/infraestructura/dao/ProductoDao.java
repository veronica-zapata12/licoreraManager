package com.ceiba.licoreramanager.infraestructura.dao;

import com.ceiba.licoreramanager.aplicacion.comando.ComandoProducto;
import com.ceiba.licoreramanager.aplicacion.fabrica.FabricaProducto;
import com.ceiba.licoreramanager.dominio.modelo.dto.ProductoDto;
import com.ceiba.licoreramanager.dominio.modelo.entidad.ProductoEntidad;
import com.ceiba.licoreramanager.dominio.puerto.repositorio.ProductoRepositorio;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoDao {
private ModelMapper modelMapper=new ModelMapper();

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Autowired
    private FabricaProducto fabricaProducto;

    public void guardar(ComandoProducto comandoProducto){
        ProductoDto productoDto=this.fabricaProducto.crear(comandoProducto);
        ProductoEntidad productoEntidad=modelMapper.map(productoDto,ProductoEntidad.class);
        productoRepositorio.save(productoEntidad);


    }

    public ProductoDto filtroPornombre (String nombre){
        ProductoEntidad productoEntidad=productoRepositorio.filtrarPorNombre(nombre);
        ProductoDto productoDto=modelMapper.map(productoEntidad,ProductoDto.class);
        return productoDto;
    }
    public Double obtenerValorporNombre(String nombre){
        ProductoEntidad productoEntidad=productoRepositorio.filtrarPorNombre(nombre);
        ProductoDto productoDto=modelMapper.map(productoEntidad,ProductoDto.class);
        return productoDto.getValor();
    }
 public List<ProductoEntidad> listar(){
      return productoRepositorio.findAll();
    }

}
