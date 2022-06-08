package com.programacion;

public interface TransaccionBancaria {

    void setManejadorPersistencia(ManejadorPersistencia manejadorPersistencia);
    void realizarTransferencia(String cuenta1, String cuenta2, float monto);

}
