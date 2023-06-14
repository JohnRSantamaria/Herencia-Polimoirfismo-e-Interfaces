/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class ControlBonificacion {
    private double suma; 
    
    public double registarSalario(Funcionario funcionario){
        
        this.suma += funcionario.getBonificacion();
        System.out.println("current Value: "+this.suma);
        return this.suma;
    }
}
