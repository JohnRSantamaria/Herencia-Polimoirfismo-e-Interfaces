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
    
    private AutenticacionUtil util;
    
    public Administrador(){
        this.util = new AutenticacionUtil();
    }
    
    @Override
    public double getBonificacion(){        
        return this.getSalario();
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.inicarSesion(clave);
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }


}
