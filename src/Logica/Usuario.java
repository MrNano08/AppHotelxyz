/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Usuario implements Serializable {
    private String usuario;
    private int contasenna;

    public Usuario() {
    }

    public Usuario(String usuario, int contasenna) {
        this.usuario = usuario;
        this.contasenna = contasenna;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContasenna(int contasenna) {
        this.contasenna = contasenna;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getContasenna() {
        return contasenna;
    }
    
    
}
