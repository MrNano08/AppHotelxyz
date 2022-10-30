/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Hotel {
    private Habitaciones habitacion;
    private Clientes cliente;

    public Hotel() {
    }

    public Hotel(Habitaciones habitacion, Clientes cliente) {
        this.habitacion = habitacion;
        this.cliente = cliente;
    }

    public void setHabitacion(Habitaciones habitacion) {
        this.habitacion = habitacion;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Habitaciones getHabitacion() {
        return habitacion;
    }

    public Clientes getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Hotel{" + "habitacion=" + habitacion + ", cliente=" + cliente + '}';
    }

    public void calcularPrecio() {
    
}
    public void calcularDescuento() {
        
    }
}
