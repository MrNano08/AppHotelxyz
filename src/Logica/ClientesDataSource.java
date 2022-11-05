/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;


public class ClientesDataSource implements JRDataSource{

    private ArrayList<Clientes> lista = new ArrayList<>();
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
            case "nombre":
                valor = lista.get(indice).getNombre();
                break;
            case "apellidos":
                valor = lista.get(indice).getApellidos();
                break;
            case "direccion":
                valor = lista.get(indice).getDireccion();
                break;
            case "empresa":
                valor = lista.get(indice).getEmpresa();
                break;
            case "correo":
                valor = lista.get(indice).getCorreo();
                break;
                
            case "telefono":
                valor = lista.get(indice).getTelefono();
                break;
        }
        return valor;
    }    
    
    public void addClientes(Clientes clientes) {
        this.lista.add(clientes);
    }

    public int getTotal() {
        return lista.size();
    }
    
    
    }
    
    
    
    
    
    
    
    

