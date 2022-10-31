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
public class Factura implements Serializable {
   private String fechain;
   private String fechafin;
   private String cliente;
   private String habitacion;

    public Factura() {
    }

    public Factura(String fechain, String fechafin, String cliente, String habitacion) {
        this.fechain = fechain;
        this.fechafin = fechafin;
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public void setFechain(String fechain) {
        this.fechain = fechain;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getFechain() {
        return fechain;
    }

    public String getFechafin() {
        return fechafin;
    }

    public String getCliente() {
        return cliente;
    }

    public String getHabitacion() {
        return habitacion;
    }
   
   
   
}
