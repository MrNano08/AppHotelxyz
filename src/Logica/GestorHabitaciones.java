/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author UNA
 */
public class GestorHabitaciones implements Global, Serializable {
    
    public boolean existe(int idHabitacion) {
        for (Habitaciones habitaciones : listaHabitaciones) {
            if (habitaciones.getId() == idHabitacion) {
                return true;
            }
        }
        return false;
    }
    //Avisa la existencia si agunas de las categorias ya existe.

    public void guardar(Habitaciones habitaciones) {
        if (!existe(habitaciones.getId())) {
            listaHabitaciones.add(habitaciones);
        }
    }
    //guarda una categoria dentro del contenedor 

    public void editar(Habitaciones habitaciones) {
        if (existe(habitaciones.getId())) {
            int pos = obtenerPosicionDe(habitaciones.getId());
            listaHabitaciones.set(pos, habitaciones);
        }
    }
    //elimina alguna categoria ya existente y la cambio por una nueva en la misma posicion.        

    public int obtenerPosicionDe(int idhabitacion) {
        for (Habitaciones habitaciones: listaHabitaciones) {
            if (habitaciones.getId() == idhabitacion) {
                return listaHabitaciones.indexOf(habitaciones);
            }
        }
        return -1;
    }

    public DefaultTableModel obtenerModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID","DESCRIPCION", "IMAGEN", "NUMERO MAXIMO DE HUESPEDES", "PRECIO POR DIA ADULTOS", "PRECIO POR DIA NIÑOS", "ESTADO", "ACTIVA" }
        );
        String fila[] = new String[8];
        for (Habitaciones habitaciones : listaHabitaciones) {
            fila[0] = "" + habitaciones.getId();
            fila[1] = habitaciones.getDescripcion().toUpperCase();
            fila[2] = habitaciones.getImagen().toUpperCase();
            fila[3] = "" + habitaciones.getNumMaxHus();
            fila[4] = "" + habitaciones.getPreAdultos();
            fila[5] = habitaciones.isEstado() == true ? "Ocupada" : "Desocupada";
            fila[6] = habitaciones.isActiva() == true ? "Si" : "No";
            modelo.addRow(fila);
        }
        return modelo;
    }

    public void eliminar(int id) {
        int pos = obtenerPosicionDe(id);
        listaHabitaciones.remove(pos);
    }

    @Override
    public void guardarEnArchivo() {
        String archivo = "Habitaciones.txt";
        if (!listaHabitaciones.isEmpty()) {
            try {
                ObjectOutputStream ficheroSalida = new ObjectOutputStream(
                        new FileOutputStream(new File(archivo)));
                ficheroSalida.writeObject(listaHabitaciones);
                ficheroSalida.flush();
                ficheroSalida.close();
                System.out.println("Datos de habitaciones guardados correctamente en " + archivo + ".");
            } catch (FileNotFoundException fnfe) {
                System.out.println("Error: El fichero " + archivo + " no existe. ");
            } catch (IOException ioe) {
                System.out.println("Error: Falló la escritura en el fichero" + archivo + ". ");
            }
        } else {
            System.out.println("No hay datos que guardar. La lista está vacía. ");
        }
    }

    @Override
    public void recuperarDeArchivo() {
        try {
            File fichero = new File("Habitaciones.txt");
            if (fichero.exists()) {
                ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
                ArrayList<Habitaciones> temporal = (ArrayList) ficheroEntrada.readObject();
                listaHabitaciones.clear();
                listaHabitaciones.addAll(temporal);
                ficheroEntrada.close();
            }
        } catch (ClassNotFoundException cnfe) {

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }

    }

    
}
