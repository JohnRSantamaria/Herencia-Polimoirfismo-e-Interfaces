/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class Administrador extends Funcionario implements Autenticable  {
    
    private String clave;
    
    @Override
    public double getBonificacion(){        
        return this.getSalario();
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.clave == clave;
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }


}
