package com.ceiba.licoreramanager.aplicacion.fabrica;

import com.ceiba.licoreramanager.aplicacion.comando.ComandoProducto;
import com.ceiba.licoreramanager.dominio.modelo.dto.ProductoDto;
import org.springframework.stereotype.Component;

@Component
public class FabricaProducto {
    public ProductoDto crear (ComandoProducto comandoProducto){
        return new ProductoDto(comandoProducto.getId(),
                                comandoProducto.getNombre(),
                                comandoProducto.getValor());

    }
}
