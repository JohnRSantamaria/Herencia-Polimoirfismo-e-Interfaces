/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class AutenticacionUtil {
    private String clave;
    
    public boolean inicarSesion(String clave){
        return this.clave == clave;
    }
    
    public void setClave(String clave){
        this.clave = clave;
    }
}
