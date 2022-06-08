package com.programacion;

//AOP
public class ManejadorPersistenciaLogImpl  implements ManejadorPersistencia{
    private ManejadorPersistenciaImpl impl = new ManejadorPersistenciaImpl();
    public CuentaBancaria buscarCuenta(String numero){
        System.out.println("*******Buscando cuenta: "+ numero);
        return impl.buscarCuenta(numero);
    }
}
