package com.programacion;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Contenedor {
    //Esto es para lookup
    private static Map<String,Object> componentes = new HashMap<>();
    public static Object select(String name){
        return componentes.get(name);
    }

    public static void inicializar(){
        ManejadorPersistencia mp = new ManejadorPersistenciaLogImpl();
        componentes.put("mp", mp);

        //----DI

        //1.Constructor
        //TransaccionBancariaImpl tb = new TransaccionBancariaImpl(mp);
        //Este es el método más recomendado en la práctica.

        //2.Setter
        //TransaccionBancariaImpl tb = new TransaccionBancariaImpl();
        //tb.setManejadorPersistencia(mp);

        //3.Field
        TransaccionBancariaImpl tb = new TransaccionBancariaImpl();
        tb.manejadorPersistencia = mp;


        //Este es el código de las anotaciones
        Field[] fields = tb.getClass().getFields();
        for(Field field:fields ){
            MiDependencia t = field.getAnnotation(MiDependencia.class);

            if( t!=null ){
                //poner dependencia
                System.out.println("Poner dependencia "+ field.getName());
            }
        }


        componentes.put("tb", tb);


    }
}
