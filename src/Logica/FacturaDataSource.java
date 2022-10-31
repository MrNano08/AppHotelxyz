/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Usuario
 */
public class FacturaDataSource implements JRDataSource {
    private ArrayList<Factura> lista = new ArrayList<>();
    private int indice = -1;

    @Override
    public boolean next() throws JRException {
        return ++indice < lista.size();
    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {
        Object valor = null;
        switch (jrField.getName()) {
            case "fechain":
                valor = lista.get(indice).getFechain();
                break;
            case "fechafin":
                valor = lista.get(indice).getFechafin();
                break;
            case "cliente":
                valor = lista.get(indice).getCliente();
                break;
            case "habitacion":
                valor = lista.get(indice).getHabitacion();
                break;
        }
        return valor;
    }

    public void addFactura(Factura factura) {
        this.lista.add(factura);
    }

    public int getTotal() {
        return lista.size();
    }
}


