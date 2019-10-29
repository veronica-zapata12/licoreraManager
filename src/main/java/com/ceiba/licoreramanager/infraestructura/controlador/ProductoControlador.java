package com.ceiba.licoreramanager.infraestructura.controlador;

import com.ceiba.licoreramanager.aplicacion.comando.ComandoProducto;
import com.ceiba.licoreramanager.dominio.modelo.dto.ProductoDto;
import com.ceiba.licoreramanager.dominio.modelo.entidad.ProductoEntidad;
import com.ceiba.licoreramanager.infraestructura.dao.ProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ProductoControlador")
public class ProductoControlador {
    @Autowired
    private ProductoDao productoDao;

    @PostMapping(value = "/guardarProducto",produces = MediaType.APPLICATION_JSON_VALUE)
    public void guardarProducto(@RequestBody ComandoProducto comandoProducto){
        productoDao.guardar(comandoProducto);
    }

    @GetMapping(value = "/buscarPorNombreProducto/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductoDto buscarPorNombreProducto(@PathVariable String nombre){
        return productoDao.filtroPornombre(nombre);
    }
    @GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductoEntidad> listarProductos(){
        return productoDao.listar();

  }
}
