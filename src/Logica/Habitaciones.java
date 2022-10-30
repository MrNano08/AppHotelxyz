/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Habitaciones {
   private int numHabitacion;
   private boolean ServiHabitacion;
   private int descuento;

    public Habitaciones() {
    }

    public Habitaciones(int numHabitacion, boolean ServiHabitacion, int descuento) {
        this.numHabitacion = numHabitacion;
        this.ServiHabitacion = ServiHabitacion;
        this.descuento = descuento;
    }

    
   public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public void setServiHabitacion(boolean ServiHabitacion) {
        this.ServiHabitacion = ServiHabitacion;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public boolean isServiHabitacion() {
        return ServiHabitacion;
    }

    public int getDescuento() {
        return descuento;
    }


}
