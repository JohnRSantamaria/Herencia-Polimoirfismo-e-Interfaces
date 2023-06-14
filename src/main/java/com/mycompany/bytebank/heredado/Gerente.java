/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class Gerente extends Funcionario implements Autenticable{


    @Override
    public double getBonificacion(){
        System.out.println("Desde Gerente");
        return super.getSalario() + this.getSalario() * 0.5;        
    }


    @Override
    public void setClave(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean iniciarSesion(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
