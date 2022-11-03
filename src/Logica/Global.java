/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Logica;

import java.util.ArrayList;

public interface Global {

    ArrayList<Habitaciones> listaHabitaciones = new ArrayList<>();
    ArrayList<Clientes> listaClientes = new ArrayList<>();
    ArrayList<Reservaciones> listaReservaciones = new ArrayList<>();
    ArrayList<Factura> listaFacturas = new ArrayList<>();
    ArrayList<Usuario> listaUsuario = new ArrayList<>();

    public void guardarEnArchivo();

    public void recuperarDeArchivo();
}
