package com.mintic.empresa.exceptions;

public class EmpleadoNoEncontradoException extends RuntimeException {

    public EmpleadoNoEncontradoException(Long idEmpleado) {
        super("No se pudo encontrar Empleado con id: " + idEmpleado);
    }

}
