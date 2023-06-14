/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class TestSistemaInterno {
    public static void main(String[] args) {
     SistemaInterno sistema = new SistemaInterno();
     Gerente gerente1 = new Gerente();
     Administrador admin = new Administrador();
     
     sistema.autentica(gerente1);
     sistema.autentica(admin);
             
    }            
}
