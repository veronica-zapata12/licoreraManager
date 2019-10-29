package com.ceiba.licoreramanager.aplicacion.fabrica;

import com.ceiba.licoreramanager.aplicacion.comando.ComandoFactura;
import com.ceiba.licoreramanager.dominio.modelo.dto.FacturaDto;
import org.springframework.stereotype.Component;

@Component
public class FabricaFactura {
    public FacturaDto Crear(ComandoFactura comandoFactura){
        return new FacturaDto (comandoFactura.getId(),comandoFactura.getDescripcion(),comandoFactura.getFecha(),comandoFactura.getTotal());

    }
}
