package com.programacion;

public class CuentaBancariaImpl implements CuentaBancaria{

    public void deposito(float monto){
        System.out.printf("deposito(%.2f)\n", monto);
    }
    public void retiro(float monto){
        System.out.printf("retiro(%.2f)\n", monto);
    }
}
