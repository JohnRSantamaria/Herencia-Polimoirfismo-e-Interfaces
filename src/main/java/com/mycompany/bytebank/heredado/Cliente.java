/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.heredado;

/**
 *
 * @author ResetStoreX
 */
public class Cliente implements Autenticable{
    
    private String nombre;
    private String documento;
    private String telefono;   
    
    private AutenticacionUtil util;
        

    public Cliente (){
        this.util = new AutenticacionUtil();
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
