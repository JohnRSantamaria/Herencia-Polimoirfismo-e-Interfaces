/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class Contador extends Funcionario{  
       
    @Override
    public double getBonificacion() {
        System.out.println("Desde Contador");
        return 200;
    }       
}
