/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class testReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");
       
        Gerente gerente = new Gerente();
        gerente.setNombre("ximena");
        
        funcionario.setSalario(2000);
        
    }
}
