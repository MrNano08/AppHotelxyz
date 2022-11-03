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

/**
 *
 * @author Usuario
 */
public class GestorUsuario implements Global, Serializable {
   
    public boolean existeUsuario(String Cusuario) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getUsuario().equals(Cusuario)) {
                return true;
            }
        }
        return false;
    }
    
    public void guardarUsuario(Usuario usuario) {
        if (!existeUsuario(usuario.getUsuario())) {
            listaUsuario.add(usuario);
        }
    }
    
     public boolean existeClave(int clave) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getContasenna() == clave) {
                return true;
            }
        }
        return false;
    }
    
    public void guardarClave(Usuario usuario) {
         if (!existeClave(usuario.getContasenna())) {
            listaUsuario.add(usuario);
        }
    }

    @Override
    public void guardarEnArchivo() {
        String archivo = "usuario.txt";
        if (!listaUsuario.isEmpty()) {
            try {
                ObjectOutputStream ficheroSalida = new ObjectOutputStream(
                        new FileOutputStream(new File(archivo)));
                ficheroSalida.writeObject(listaUsuario);
                ficheroSalida.flush();
                ficheroSalida.close();
                System.out.println("Datos de usuario guardados correctamente en " + archivo + ".");
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
            File fichero = new File("usuario.txt");
            if (fichero.exists()) {
                ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
                ArrayList<Usuario> temporal = (ArrayList) ficheroEntrada.readObject();
                listaUsuario.clear();
                listaUsuario.addAll(temporal);
                ficheroEntrada.close();
            }
        } catch (ClassNotFoundException cnfe) {

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }

    }
    }


