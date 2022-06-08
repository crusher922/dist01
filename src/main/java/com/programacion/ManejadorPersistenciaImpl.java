package com.programacion;

public class ManejadorPersistenciaImpl implements ManejadorPersistencia {
    public CuentaBancariaImpl buscarCuenta(String numero){
       // System.out.printf("buscarCuenta(%s)\n",numero);
        return new CuentaBancariaImpl();
    }


}
