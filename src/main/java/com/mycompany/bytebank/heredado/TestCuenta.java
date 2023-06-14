/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1, 1);
        CuentaAhorros ca  = new  CuentaAhorros(2, 3);
        
        cc.deposita(2000);
        cc.transfiere(1000, ca);
        
        
        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}
