/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Clientes {
    private int id;
    private String nombre;
    private int numeHabitacion;

    public Clientes() {
    }

    public Clientes(int id, String nombre, int numeHabitacion) {
        this.id = id;
        this.nombre = nombre;
        this.numeHabitacion = numeHabitacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeHabitacion(int numeHabitacion) {
        this.numeHabitacion = numeHabitacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeHabitacion() {
        return numeHabitacion;
    }
    
   public void morosidad() {
       
   }
}
