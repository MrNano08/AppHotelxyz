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
 * @author UNA
 */
public class HabitacionesDataSource implements JRDataSource{

    private ArrayList<Habitaciones> lista = new ArrayList<>();
    private int indice = -1;
    
    @Override
    public boolean next() throws JRException {
    return ++indice < lista.size();    
    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {
    Object valor = null;
        switch (jrField.getName()) {
            case "id":
                valor = lista.get(indice).getId();
                break;
            case "descripcion":
                valor = lista.get(indice).getDescripcion();
                break;
            case "imagen":
                valor = lista.get(indice).getImagen();
                break;
            case "nummaxhus":
                valor = lista.get(indice).getNumMaxHus();
                break;
            case "preadultos":
                valor = lista.get(indice).getPreAdultos();
                break;
            case "preninnos":
                valor = lista.get(indice).getPreNinno();
                break;
                
            case "estado":
                valor = lista.get(indice).isEstado();
                break;
                
            case "activa":
                valor = lista.get(indice).isActiva();
                break;
        }
        return valor;
    }    
    
    public void addHabitaciones(Habitaciones habitaciones) {
        this.lista.add(habitaciones);
    }

    public int getTotal() {
        return lista.size();
    }
    
}
