/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class CuentaCorriente extends Cuenta {    
    public CuentaCorriente(int agencia, int numero){
        super(agencia,numero);
    }

    @Override
    public boolean saca(double valor) {
        double comision = 0.2;
        
        return super.saca(valor + comision); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }    
}
