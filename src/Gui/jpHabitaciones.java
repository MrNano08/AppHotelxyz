/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

import Logica.GestorHabitaciones;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author UNA
 */
public class jpHabitaciones extends javax.swing.JPanel {

    GestorHabitaciones gestorHabitaciones;


    public jpHabitaciones() {
        initComponents();
        gestorHabitaciones = new GestorHabitaciones();
        gestorHabitaciones.recuperarDeArchivo();
        tblHabitaciones.setModel(gestorHabitaciones.obtenerModeloTabla());
        lblTotal.setText("Total: " + tblHabitaciones.getRowCount());

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
        tblHabitaciones = new javax.swing.JTable();
        btnAgregar = new javax.swing.JPanel();
        txtbtnAgregar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        txtbtnEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        txtbtnEliminar = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JPanel();
        txtbtnImprimir = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        bgHabitaciones.setBackground(new java.awt.Color(255, 236, 239));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setText("Habitaciones");

        tblHabitaciones.setBackground(new java.awt.Color(255, 236, 239));
        tblHabitaciones.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        tblHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Imagen", "Número máximo de Huespedes", "Precio por día adulto", "Precio por día niño", "Estado", "Activa"
            }
        ));
        tblHabitaciones.setOpaque(false);
        tblHabitaciones.setSelectionBackground(new java.awt.Color(66, 28, 86));
        tblHabitaciones.setShowGrid(true);
        jScrollPane1.setViewportView(tblHabitaciones);
        if (tblHabitaciones.getColumnModel().getColumnCount() > 0) {
            tblHabitaciones.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblHabitaciones.getColumnModel().getColumn(2).setPreferredWidth(45);
            tblHabitaciones.getColumnModel().getColumn(3).setPreferredWidth(140);
            tblHabitaciones.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblHabitaciones.getColumnModel().getColumn(5).setPreferredWidth(80);
            tblHabitaciones.getColumnModel().getColumn(6).setPreferredWidth(40);
            tblHabitaciones.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        btnAgregar.setBackground(new java.awt.Color(55, 41, 72));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });

        txtbtnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnAgregar.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnAgregar.setText("Agregar");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btnEditar.setBackground(new java.awt.Color(55, 41, 72));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarMousePressed(evt);
            }
        });

        txtbtnEditar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnEditar.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnEditar.setText("Editar");

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btnEliminar.setBackground(new java.awt.Color(55, 41, 72));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
        });

        txtbtnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnEliminar.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnEliminar.setText("Eliminar");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

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
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(37, 27, 55));
        txtbtnAgregar.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(55, 41, 72));
        txtbtnAgregar.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(new Color(37, 27, 55));
        txtbtnEditar.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(new Color(55, 41, 72));
        txtbtnEditar.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(37, 27, 55));
        txtbtnEliminar.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(55, 41, 72));
        txtbtnEliminar.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        btnImprimir.setBackground(new Color(37, 27, 55));
        txtbtnImprimir.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        btnImprimir.setBackground(new Color(55, 41, 72));
        txtbtnImprimir.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnImprimirMouseExited

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        jpAgregarH agregar = new jpAgregarH();

        agregar.setSize(Dashboard.contenido.getWidth(), Dashboard.contenido.getHeight());
        agregar.setLocation(0, 0);

        Dashboard.contenido.removeAll();
        Dashboard.contenido.add(agregar, BorderLayout.CENTER);
        Dashboard.contenido.revalidate();
        Dashboard.contenido.repaint();
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMousePressed
        jpAgregarH editar = new jpAgregarH();
        GestorHabitaciones gestor = new GestorHabitaciones();

        gestor.setFila(tblHabitaciones.getSelectedRow());

        if (gestor.getFila() != -1) {
            editar.txtAgregar.setText("Editar");
            editar.setSize(Dashboard.contenido.getWidth(), Dashboard.contenido.getHeight());
            editar.setLocation(0, 0);

            Dashboard.contenido.removeAll();
            Dashboard.contenido.add(editar, BorderLayout.CENTER);
            Dashboard.contenido.revalidate();
            Dashboard.contenido.repaint();

            jpAgregarH.txtIdHabitacion.setText(tblHabitaciones.getValueAt(gestor.getFila(), 0).toString());
            jpAgregarH.txtIdHabitacion.setEditable(false);
            jpAgregarH.txtDescripcion.setText(tblHabitaciones.getValueAt(gestor.getFila(), 1).toString());
            jpAgregarH.txtImagen.setText(tblHabitaciones.getValueAt(gestor.getFila(), 2).toString());
            jpAgregarH.txtNumHues.setText(tblHabitaciones.getValueAt(gestor.getFila(), 3).toString());
            jpAgregarH.txtPreAdultos.setText(tblHabitaciones.getValueAt(gestor.getFila(), 4).toString());
            jpAgregarH.txtPreNinnos.setText(tblHabitaciones.getValueAt(gestor.getFila(), 5).toString());

            if (tblHabitaciones.getValueAt(gestor.getFila(), 6).toString().equals("Ocupada")) {
                jpAgregarH.cboOcupado.setSelected(true);
            } else {
                jpAgregarH.cboOcupado.setSelected(false);
            }

            if (tblHabitaciones.getValueAt(gestor.getFila(), 7).toString().equals("Si")) {
                jpAgregarH.cboActivo.setSelected(true);
            } else {
                jpAgregarH.cboActivo.setSelected(false);
            }

        } else {
            new frmMessagep().setVisible(true);
            frmMessagep.txtMessage.setText("Seleccione la habitación que desea editar");
            frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/error_iconx64.gif")));
        }

    }//GEN-LAST:event_btnEditarMousePressed

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        GestorHabitaciones gestor = new GestorHabitaciones();
        gestor.setFila(tblHabitaciones.getSelectedRow());
        if (gestor.getFila() != -1) {
            int idP = Integer.parseInt(tblHabitaciones.getValueAt(gestor.getFila(), 0).toString());
            int resp = JOptionPane.showConfirmDialog(null,
                    "¿Esta seguro de eliminar la habitación seleccionada?", "Eliminar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                gestor.eliminar(idP);
                gestor.guardarEnArchivo();
                cargarDatos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la habitacón a eliminar",
                    "Eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnImprimirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMousePressed
        gestorHabitaciones.cargarReporte();
    }//GEN-LAST:event_btnImprimirMousePressed

    public JTable getTblHabitaciones() {
        return tblHabitaciones;
    }

    public void setTblHabitaciones(JTable tblHabitaciones) {
        this.tblHabitaciones = tblHabitaciones;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgHabitaciones;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    protected javax.swing.JTable tblHabitaciones;
    private javax.swing.JLabel txtbtnAgregar;
    private javax.swing.JLabel txtbtnEditar;
    private javax.swing.JLabel txtbtnEliminar;
    private javax.swing.JLabel txtbtnImprimir;
    // End of variables declaration//GEN-END:variables
private void cargarDatos() {
        tblHabitaciones.setModel(gestorHabitaciones.obtenerModeloTabla());
        lblTotal.setText("Total: " + tblHabitaciones.getRowCount());
    }
}
