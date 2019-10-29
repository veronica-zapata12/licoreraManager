package com.ceiba.licoreramanager.dominio.negocio;

import com.ceiba.licoreramanager.dominio.modelo.dto.ProductoDto;
import com.ceiba.licoreramanager.infraestructura.dao.ProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculoParcial {
    @Autowired
    private ProductoDao productoDao;

    public Double calcularParcial(int cantidad, String nombre){
        Double parcial = productoDao.obtenerValorporNombre(nombre);
        return parcial += cantidad;
    }

}
