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
   private String imagen;
   private int numMaxHus;
   private double preAdultos;
   private double preNinno;
   private boolean estado;
   private boolean activa;

    public Habitaciones() {
    }

    public Habitaciones(int id, String descripcion, String imagen, int numMaxHus, double preAdultos, double preNinno, boolean estado, boolean activa) {
        this.id = id;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.numMaxHus = numMaxHus;
        this.preAdultos = preAdultos;
        this.preNinno = preNinno;
        this.estado = estado;
        this.activa = activa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getNumMaxHus() {
        return numMaxHus;
    }

    public void setNumMaxHus(int numMaxHus) {
        this.numMaxHus = numMaxHus;
    }

    public double getPreAdultos() {
        return preAdultos;
    }

    public void setPreAdultos(double preAdultos) {
        this.preAdultos = preAdultos;
    }

    public double getPreNinno() {
        return preNinno;
    }

    public void setPreNinno(double preNinno) {
        this.preNinno = preNinno;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "id=" + id + ", descripcion=" + descripcion + ", imagen=" + imagen + ", numMaxHus=" + numMaxHus + ", preAdultos=" + preAdultos + ", preNinno=" + preNinno + ", estado=" + estado + ", activa=" + activa + '}';
    }

    

    

}
