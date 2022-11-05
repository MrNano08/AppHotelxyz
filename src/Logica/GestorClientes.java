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
 * @author Erick
 */
public class GestorClientes implements Global, Serializable {

    private int fila = 0;

    public boolean existe(int idCliente) {
        for (Clientes clientes : listaClientes) {
            if (clientes.getId() == idCliente) {
                return true;
            }
        }
        return false;
    }
    //Avisa la existencia si agunas de las categorias ya existe.

    public void guardar(Clientes cliente) {
        if (!existe(cliente.getId())) {
            listaClientes.add(cliente);
        }
    }
    //guarda una categoria dentro del contenedor 

    public void editar(Clientes cliente) {
        if (existe(cliente.getId())) {
            int pos = obtenerPosicionDe(cliente.getId());
            listaClientes.set(pos, cliente);
        }
    }
    //elimina alguna categoria ya existente y la cambio por una nueva en la misma posicion.        

    public int obtenerPosicionDe(int idCliente) {
        for (Clientes clientes : listaClientes) {
            if (clientes.getId() == idCliente) {
                return listaClientes.indexOf(clientes);
            }
        }
        return -1;
    }

    public DefaultTableModel obtenerModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID HUESPED", "NOMBRE", "APELLIDOS", "DIRECCIÓN", "EMPRESA", "CORREO", "TELÉFONO"}
        );
        String fila[] = new String[7];
        for (Clientes clientes : listaClientes) {
            fila[0] = "" + clientes.getId();
            fila[1] = clientes.getNombre().toUpperCase();
            fila[2] = clientes.getApellidos().toUpperCase();
            fila[3] = clientes.getDireccion().toUpperCase();
            fila[4] = clientes.getEmpresa().toUpperCase();
            fila[5] = clientes.getCorreo().toLowerCase();
            fila[6] = "" + clientes.getTelefono();
            modelo.addRow(fila);
        }
        return modelo;
    }

    public void eliminar(int id) {
        int pos = obtenerPosicionDe(id);
        listaClientes.remove(pos);
    }

    @Override
    public void guardarEnArchivo() {
        String archivo = "Clientes.txt";
        if (!listaClientes.isEmpty()) {
            try {
                ObjectOutputStream ficheroSalida = new ObjectOutputStream(
                        new FileOutputStream(new File(archivo)));
                ficheroSalida.writeObject(listaClientes);
                ficheroSalida.flush();
                ficheroSalida.close();
                System.out.println("Datos de habitaciones guardados correctamente en " + archivo + ".");
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
            File fichero = new File("Clientes.txt");
            if (fichero.exists()) {
                ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
                ArrayList<Clientes> temporal = (ArrayList) ficheroEntrada.readObject();
                listaClientes.clear();
                listaClientes.addAll(temporal);
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
            URL in = this.getClass().getResource("/Reportes/rptClientes.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
//Se crea un objeto HashMap
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", this.getClass().getResourceAsStream(logotipo));
//==================================================================
            ClientesDataSource datasource = new ClientesDataSource();
            for (Clientes clientes : listaClientes) {
                datasource.addClientes(clientes);
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
        return "GestorClientes{" + "fila=" + fila + '}';
    }

}
