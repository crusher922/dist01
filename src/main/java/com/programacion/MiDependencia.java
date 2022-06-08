package com.programacion;

//Con esta clase el Contenedor sabe a donde apuntar. Estas son marcas

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MiDependencia {
}
