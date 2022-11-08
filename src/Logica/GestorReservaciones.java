/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import static Logica.Global.listaClientes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author UNA
 */
public class GestorReservaciones implements Global, Serializable {
   private int fila = 0;
   
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
    


    public boolean existe(String idRentaHabi) {
        for (Reservaciones reservaciones : listaReservaciones) {
            if (reservaciones.getIdRentaHabi().equals(idRentaHabi)) {
                return true;
            }
        }
        return false;
    }
    //Avisa la existencia si agunas de las categorias ya existe.

    public void guardar(Reservaciones reservaciones) {
        if (!existe(reservaciones.getIdRentaHabi())) {
            listaReservaciones.add(reservaciones);
        }
    }
    //guarda una categoria dentro del contenedor 

    public void editar(Reservaciones reservaciones) {
        if (existe(reservaciones.getIdRentaHabi())) {
            int pos = obtenerPosicionDe(reservaciones.getIdRentaHabi());
            listaReservaciones.set(pos, reservaciones);
        }
    }
    //elimina alguna categoria ya existente y la cambio por una nueva en la misma posicion.        

    public int obtenerPosicionDe(String idRentaHabi) {
        for (Reservaciones reservaciones : listaReservaciones) {
            if (reservaciones.getIdRentaHabi().equals(idRentaHabi)) {
                return listaReservaciones.indexOf(reservaciones);
            }
        }
        return -1;
    }

    public DefaultTableModel obtenerModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID RENTA", "FECHA", "ID HABITACION", "ID CLIENTE", "FORMA DE PAGO"}
        );
        String fila[] = new String[5];
        for (Reservaciones reservaciones : listaReservaciones) {
            fila[0] = reservaciones.getIdRentaHabi();
            fila[1] = "" + reservaciones.getFecha();
            fila[2] = "" + reservaciones.getIdHabi();
            fila[3] = "" + reservaciones.getIdCliente();
            fila[4] = reservaciones.getFormaPago().toUpperCase();
            modelo.addRow(fila);
        }
        return modelo;
    }

    public void eliminar(String idRentaHabi) {
        int pos = obtenerPosicionDe(idRentaHabi);
        listaReservaciones.remove(pos);
    }

    @Override
    public void guardarEnArchivo() {
        String archivo = "Reservaciones.txt";
        if (!listaReservaciones.isEmpty()) {
            try {
                ObjectOutputStream ficheroSalida = new ObjectOutputStream(
                        new FileOutputStream(new File(archivo)));
                ficheroSalida.writeObject(listaReservaciones);
                ficheroSalida.flush();
                ficheroSalida.close();
                System.out.println("Datos reservacion guardados correctamente en " + archivo + ".");
            } catch (FileNotFoundException fnfe) {
                System.out.println("Error: El fichero " + archivo + " no existe. ");
            } catch (IOException ioe) {
                System.out.println("Error: Falló la escritura en el fichero: " + archivo + ". ");
            }
        } else {
            System.out.println("No hay datos que guardar. La lista está vacía. ");
        }
    }

    @Override
    public void recuperarDeArchivo() {
        try {
            File fichero = new File("Reservaciones.txt");
            if (fichero.exists()) {
                ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
                ArrayList<Reservaciones> temporal = (ArrayList) ficheroEntrada.readObject();
                listaReservaciones.clear();
                listaReservaciones.addAll(temporal);
                ficheroEntrada.close();
            }
        } catch (ClassNotFoundException cnfe) {

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }

    }
   

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "GestorClientes{" + "fila=" + fila + '}';
    }
 
     
}
