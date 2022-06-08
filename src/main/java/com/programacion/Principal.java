package com.programacion;

public class Principal {
    public static void main (String[] args){

        TransaccionBancaria tb = new TransaccionBancaria();
        ManejadorPersistencia mp = new ManejadorPersistenciaLogImpl();
        tb.setManejadorPersistencia(mp);

        tb.realizarTransferencia("001", "002", 10.0f);

    }
}
