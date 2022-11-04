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
public class Habitaciones implements Serializable {
   private int id;
   private String descripcion;
   private String Imagen;
   private int numMaxHus;
   private int preAdultos;
   private int preNinno;
   private boolean estado;
   private boolean activa;

    public Habitaciones() {
    }

    public Habitaciones(int id, String descripcion, String Imagen, int numMaxHus, int preAdultos, int preNinno, boolean estado, boolean activa) {
        this.id = id;
        this.descripcion = descripcion;
        this.Imagen = Imagen;
        this.numMaxHus = numMaxHus;
        this.preAdultos = preAdultos;
        this.preNinno = preNinno;
        this.estado = estado;
        this.activa = activa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public void setNumMaxHus(int numMaxHus) {
        this.numMaxHus = numMaxHus;
    }

    public void setPreAdultos(int preAdultos) {
        this.preAdultos = preAdultos;
    }

    public void setPreNinno(int preNinno) {
        this.preNinno = preNinno;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return Imagen;
    }

    public int getNumMaxHus() {
        return numMaxHus;
    }

    public int getPreAdultos() {
        return preAdultos;
    }

    public int getPreNinno() {
        return preNinno;
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean isActiva() {
        return activa;
    }

    

}
