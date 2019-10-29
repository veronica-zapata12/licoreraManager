package com.ceiba.licoreramanager.dominio.excepcion.excepcion;

public class ExcepcionDuplicidad extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String mensaje;

    public ExcepcionDuplicidad(String mensaje) {
        this.mensaje = mensaje;
    }
}
