/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorFactura implements Global{
    
    public ArrayList<String> obtenerIdClientes() {
        ArrayList<String> listaDeIdC = new ArrayList<>();
        for (Clientes clientes : listaClientes) {
            listaDeIdC.add(clientes.getId() + "");
        }
        return listaDeIdC;
    }
    
    public ArrayList<String> obtenerIdHabitaciones() {
        ArrayList<String> listaDeIdH = new ArrayList<>();
        for (Habitaciones habitaciones : listaHabitaciones) {
            listaDeIdH.add(habitaciones.getId() + "");
        }
        return listaDeIdH;
    }
    @Override
    public void guardarEnArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void recuperarDeArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
