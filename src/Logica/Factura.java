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
   private boolean chClientes;
   private boolean chHabitaciones;

    public Factura() {
    }

    public Factura(String fechain, String fechafin, String cliente, String habitacion, boolean chClientes, boolean chHabitaciones) {
        this.fechain = fechain;
        this.fechafin = fechafin;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.chClientes = chClientes;
        this.chHabitaciones = chHabitaciones;
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

    public void setChClientes(boolean chClientes) {
        this.chClientes = chClientes;
    }

    public void setChHabitaciones(boolean chHabitaciones) {
        this.chHabitaciones = chHabitaciones;
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

    public boolean isChClientes() {
        return chClientes;
    }

    public boolean isChHabitaciones() {
        return chHabitaciones;
    }
   
}
