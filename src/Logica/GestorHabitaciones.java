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

public class GestorHabitaciones implements Global, Serializable {
    private int fila = 0;
    public boolean existe(int idHabitacion) {
        for (Habitaciones habitaciones : listaHabitaciones) {
            if (habitaciones.getId() == idHabitacion) {
                return true;
            }
        }
        return false;
    }


    public void guardar(Habitaciones habitaciones) {
        if (!existe(habitaciones.getId())) {
            listaHabitaciones.add(habitaciones);
        }
    }
 

    public void editar(Habitaciones habitaciones) {
        if (existe(habitaciones.getId())) {
            int pos = obtenerPosicionDe(habitaciones.getId());
            listaHabitaciones.set(pos, habitaciones);
        }
    }
      

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
            fila[4] = String.valueOf(habitaciones.getPreAdultos());
            fila[5] = String.valueOf(habitaciones.getPreNinno());
            fila[6] = habitaciones.isEstado() == true ? "Ocupada" : "Desocupada";
            fila[7] = habitaciones.isActiva() == true ? "Si" : "No";
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
    
    public void cargarReporte() {
        String logotipo = "/Reporte/logo.png";
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
//direccion del archivo JASPER
            URL in = this.getClass().getResource("/Reportes/rptHabitaciones.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
//Se crea un objeto HashMap
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", this.getClass().getResourceAsStream(logotipo));
//==================================================================
            HabitacionesDataSource datasource = new HabitacionesDataSource();
            for (Habitaciones habitaciones : listaHabitaciones) {
                datasource.addHabitaciones(habitaciones);
            }
//==================================================================
            parametros.put("total", datasource.getTotal());
            reporte_view = JasperFillManager.fillReport(reporte, parametros, datasource);
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.out.println(ex);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
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
        return "GestorHabitaciones{" + "fila=" + fila + '}';
    }

    
}
