package com.ceiba.licoreramanager.dominio.excepcion.validador;

import com.ceiba.licoreramanager.dominio.excepcion.excepcion.ExceptionObligatorio;

public class ValidadorArgumento {
    private ValidadorArgumento() {}

    public static void validarObligatorio(Object valor, String mensaje) {
        if (valor == null ) {
            throw new ExceptionObligatorio(mensaje);
        }
    }
}
