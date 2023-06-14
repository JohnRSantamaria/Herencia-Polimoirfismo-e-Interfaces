/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class Gerente extends Funcionario {
    private String clave;
    
    public void setClave(String clave){
        this.clave = clave;               
    }
    
    public boolean iniciarSecion(String clave){
        return this.clave.equals(clave);
    }

    /**
     *
     * @return
     */
    @Override
    public double getBonificacion(){
        System.out.println("Desde Gerente");
        return super.getSalario();        
    }
}
