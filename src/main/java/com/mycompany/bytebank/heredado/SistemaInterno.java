/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class SistemaInterno {
    
    private String clave = "12345";
    
    public boolean autentica(Autenticable gerente){
        boolean puedeInicarSesion = gerente.iniciarSesion(clave);
        if(puedeInicarSesion){
            System.out.println("Login Exitoso");                   
            return true;
        }else{
            System.out.println("Error en Login");
            return false;
        }        
    }
}
