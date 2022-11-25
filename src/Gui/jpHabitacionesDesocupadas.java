/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

import static Gui.jpAgregarH.cboActivo;
import static Gui.jpAgregarH.cboOcupado;
import static Gui.jpAgregarH.lblImageH;
import static Gui.jpAgregarH.txtDescripcion;
import static Gui.jpAgregarH.txtIdHabitacion;
import static Gui.jpAgregarH.txtNumHues;
import static Gui.jpAgregarH.txtPreAdultos;
import static Gui.jpAgregarH.txtPreNinnos;
import static Gui.jpAgregarR.cbHabitacion;
import Logica.GestorHabitaciones;
import Logica.Global;
import Logica.Habitaciones;
import Logica.imgTabla;
import java.awt.Color;
import java.awt.print.PrinterException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author UNA
 */
public class jpHabitacionesDesocupadas extends javax.swing.JPanel {

    GestorHabitaciones gestorHabitaciones;

    public jpHabitacionesDesocupadas() {
        initComponents();
        tblHabitacionesDesocupadas.setDefaultRenderer(Object.class, new imgTabla());
        tblHabitacionesDesocupadas.setRowHeight(65);
        gestorHabitaciones = new GestorHabitaciones();
        gestorHabitaciones.recuperarDeArchivo();
        tblHabitacionesDesocupadas.setModel(gestorHabitaciones.obtenerModeloTablaDesocupado());
        lblTotal.setText("Total: " + tblHabitacionesDesocupadas.getRowCount());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgHabitaciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHabitacionesDesocupadas = new javax.swing.JTable();
        btnImprimir = new javax.swing.JPanel();
        txtbtnImprimir = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        bgHabitaciones.setBackground(new java.awt.Color(255, 236, 239));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setText("Habitaciones ocupadas:");

        tblHabitacionesDesocupadas.setBackground(new java.awt.Color(255, 236, 239));
        tblHabitacionesDesocupadas.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        tblHabitacionesDesocupadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Número máximo de Huespedes", "Precio por día adulto", "Precio por día niño", "Estado", "Activa"
            }
        ));
        tblHabitacionesDesocupadas.setOpaque(false);
        tblHabitacionesDesocupadas.setSelectionBackground(new java.awt.Color(66, 28, 86));
        tblHabitacionesDesocupadas.setShowGrid(true);
        jScrollPane1.setViewportView(tblHabitacionesDesocupadas);
        if (tblHabitacionesDesocupadas.getColumnModel().getColumnCount() > 0) {
            tblHabitacionesDesocupadas.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblHabitacionesDesocupadas.getColumnModel().getColumn(2).setPreferredWidth(140);
            tblHabitacionesDesocupadas.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblHabitacionesDesocupadas.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblHabitacionesDesocupadas.getColumnModel().getColumn(5).setPreferredWidth(40);
            tblHabitacionesDesocupadas.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        btnImprimir.setBackground(new java.awt.Color(55, 41, 72));
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImprimirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnImprimirMousePressed(evt);
            }
        });

        txtbtnImprimir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnImprimir.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnImprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnImprimir.setText("Imprimir");

        javax.swing.GroupLayout btnImprimirLayout = new javax.swing.GroupLayout(btnImprimir);
        btnImprimir.setLayout(btnImprimirLayout);
        btnImprimirLayout.setHorizontalGroup(
            btnImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnImprimirLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtbtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnImprimirLayout.setVerticalGroup(
            btnImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        lblTotal.setFont(new java.awt.Font("Roboto", 3, 16)); // NOI18N
        lblTotal.setText("Total: 0");

        javax.swing.GroupLayout bgHabitacionesLayout = new javax.swing.GroupLayout(bgHabitaciones);
        bgHabitaciones.setLayout(bgHabitacionesLayout);
        bgHabitacionesLayout.setHorizontalGroup(
            bgHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
            .addGroup(bgHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgHabitacionesLayout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgHabitacionesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgHabitacionesLayout.setVerticalGroup(
            bgHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(bgHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        btnImprimir.setBackground(new Color(37, 27, 55));
        txtbtnImprimir.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        btnImprimir.setBackground(new Color(55, 41, 72));
        txtbtnImprimir.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnImprimirMouseExited

    private void btnImprimirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMousePressed
     try {
        tblHabitacionesDesocupadas.print();
        } catch (PrinterException ex){
           new frmMessagep().setVisible(true);
            frmMessagep.txtMessage.setText("Instale una impresora antes de continuar");
            frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/error_iconx64.gif")));
        }      
    }//GEN-LAST:event_btnImprimirMousePressed

    public JTable getTblHabitaciones() {
        return tblHabitacionesDesocupadas;
    }

    public void setTblHabitaciones(JTable tblHabitaciones) {
        this.tblHabitacionesDesocupadas = tblHabitaciones;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgHabitaciones;
    private javax.swing.JPanel btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    protected javax.swing.JTable tblHabitacionesDesocupadas;
    private javax.swing.JLabel txtbtnImprimir;
    // End of variables declaration//GEN-END:variables

}
