package com.ceiba.licoreramanager.dominio.excepcion.excepcion;

public class ExceptionObligatorio extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String mensaje;

    public ExceptionObligatorio(String mensaje){
        this.mensaje=mensaje;
    }
}
