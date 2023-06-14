/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class TestGerente {
    public static void main(String[] args) {
        //Funcionario gerente = new Funcionario();
        Gerente gerente = new Gerente();
        gerente.setSalario(6000);
        gerente.setNombre("John");
        gerente.setClave("alura");        
        gerente.setTipo(1);
        
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("alura"));
    }
   
}
