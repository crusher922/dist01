package com.programacion;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.logging.Logger;

public class TransaccionBancariaImpl implements TransaccionBancaria{
    //3. Field
   @MiDependencia ManejadorPersistencia manejadorPersistencia;

   //Ejemplos de lo que puede tener el componente
    int x;
    Logger log;

// Este metodo es un método lookup para buscar las dependencias
//JNDI es un registro de nombres
//    public TransaccionBancariaImpl(){
//
//        manejadorPersistencia = (ManejadorPersistencia) Contenedor.select("mp");
//        try{
//            Context ctx = new InitialContext();
//            manejadorPersistencia= (ManejadorPersistencia) ctx.lookup("java:comp/env/ManejadorPersistencia");
//
//        }catch (Exception ex){
//
//        }
//    }


    //1.Constructor
//    public TransaccionBancariaImpl(ManejadorPersistencia manejadorPersistencia){
//        this.manejadorPersistencia = manejadorPersistencia;
//    }

    //2. Setter
    public void setManejadorPersistencia(ManejadorPersistencia manejadorPersistencia){
        this.manejadorPersistencia = manejadorPersistencia;
    }

    public void realizarTransferencia(String cuenta1, String cuenta2, float monto){

        System.out.printf("realizarTransferencia(%s-%s-%.2f)\n",cuenta1, cuenta2, monto);

        CuentaBancariaImpl objCuenta1 = manejadorPersistencia.buscarCuenta(cuenta1);
        CuentaBancariaImpl objCuenta2 = manejadorPersistencia.buscarCuenta(cuenta2);

        objCuenta1.deposito(monto);
        objCuenta2.retiro(monto);

    }
}
