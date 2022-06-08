package com.programacion;


public class Principal {



    public static void main (String[] args){

        Contenedor.inicializar();

        //----------------
        //Busca por el nombre al componete
        TransaccionBancaria tb = (TransaccionBancaria) Contenedor.select("tb");
        //Busca por el tipo de Dato al componente
       //--> TransaccionBancaria t = (TransaccionBancaria) Contenedor.select(TransaccionBancaria.class);

        //lookup
        tb.realizarTransferencia("001", "002", 10.0f);
        //DI
        //tb.realizarTransferencia("001", "002", 10.0f);


    }
}
