/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

import static Gui.Dashboard.contenido;
import Logica.GestorFactura;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author UNA
 */
public class jpReportesFacturacion extends javax.swing.JPanel {

    GestorFactura gestorFactura;

    /**
     * Creates new form jpReservaciones
     */
    public jpReportesFacturacion() {
        initComponents();
        gestorFactura = new GestorFactura();
        cargarIdsHabitaciones();
        cargarIdsClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        txtFechaInicial = new javax.swing.JLabel();
        txtFechaFinal = new javax.swing.JLabel();
        txtCliente = new javax.swing.JLabel();
        txtHabitacion = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<>();
        cbHabitacion = new javax.swing.JComboBox<>();
        chxCliente = new javax.swing.JCheckBox();
        chxHabitacion = new javax.swing.JCheckBox();
        btnHabitacionesO = new javax.swing.JPanel();
        txtbtnHabitacionesO = new javax.swing.JLabel();
        btnGenerarReporte1 = new javax.swing.JPanel();
        txtbtnGenerarReporte1 = new javax.swing.JLabel();
        btnHabitacionesMeR = new javax.swing.JPanel();
        txtbtnHabitacionesMeR = new javax.swing.JLabel();
        btnIngresosHabitacion = new javax.swing.JPanel();
        txtbtnIngresosHabitacion = new javax.swing.JLabel();
        btnHabitacionesD = new javax.swing.JPanel();
        txtbtnHabitacionesD = new javax.swing.JLabel();
        btnHabitacionMaR = new javax.swing.JPanel();
        txtbtnHabitacionMaR = new javax.swing.JLabel();
        btnIngresosCliente = new javax.swing.JPanel();
        txtbtnIngresosCliente = new javax.swing.JLabel();
        jcInicial = new com.toedter.calendar.JDateChooser();
        jcFinal = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(650, 530));

        jPanel1.setBackground(new java.awt.Color(255, 236, 239));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        txtTitle.setText("Reportes de Facturación");
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtFechaInicial.setBackground(new java.awt.Color(0, 0, 0));
        txtFechaInicial.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtFechaInicial.setText("Fecha inicial:");
        jPanel1.add(txtFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 40));

        txtFechaFinal.setBackground(new java.awt.Color(0, 0, 0));
        txtFechaFinal.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtFechaFinal.setText("Fecha final:");
        jPanel1.add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 40));

        txtCliente.setBackground(new java.awt.Color(0, 0, 0));
        txtCliente.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtCliente.setText("Cliente:");
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 40));

        txtHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        txtHabitacion.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtHabitacion.setText("Habitacion:");
        jPanel1.add(txtHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 40));

        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel1.add(cbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 170, 30));

        cbHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel1.add(cbHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 170, 30));
        jPanel1.add(chxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        chxHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxHabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(chxHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        btnHabitacionesO.setBackground(new java.awt.Color(55, 41, 72));
        btnHabitacionesO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacionesOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacionesOMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHabitacionesOMousePressed(evt);
            }
        });

        txtbtnHabitacionesO.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnHabitacionesO.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnHabitacionesO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnHabitacionesO.setText("Habitaciones ocupadas");

        javax.swing.GroupLayout btnHabitacionesOLayout = new javax.swing.GroupLayout(btnHabitacionesO);
        btnHabitacionesO.setLayout(btnHabitacionesOLayout);
        btnHabitacionesOLayout.setHorizontalGroup(
            btnHabitacionesOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHabitacionesOLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtbtnHabitacionesO, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnHabitacionesOLayout.setVerticalGroup(
            btnHabitacionesOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnHabitacionesO, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btnHabitacionesO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 250, -1));

        btnGenerarReporte1.setBackground(new java.awt.Color(55, 41, 72));
        btnGenerarReporte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarReporte1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarReporte1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarReporte1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGenerarReporte1MousePressed(evt);
            }
        });

        txtbtnGenerarReporte1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnGenerarReporte1.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnGenerarReporte1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnGenerarReporte1.setText("Generar Reporte");

        javax.swing.GroupLayout btnGenerarReporte1Layout = new javax.swing.GroupLayout(btnGenerarReporte1);
        btnGenerarReporte1.setLayout(btnGenerarReporte1Layout);
        btnGenerarReporte1Layout.setHorizontalGroup(
            btnGenerarReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGenerarReporte1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtbtnGenerarReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnGenerarReporte1Layout.setVerticalGroup(
            btnGenerarReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnGenerarReporte1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btnGenerarReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 170, -1));

        btnHabitacionesMeR.setBackground(new java.awt.Color(55, 41, 72));
        btnHabitacionesMeR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacionesMeRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacionesMeRMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHabitacionesMeRMousePressed(evt);
            }
        });

        txtbtnHabitacionesMeR.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnHabitacionesMeR.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnHabitacionesMeR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnHabitacionesMeR.setText("Habitación menos rentada");

        javax.swing.GroupLayout btnHabitacionesMeRLayout = new javax.swing.GroupLayout(btnHabitacionesMeR);
        btnHabitacionesMeR.setLayout(btnHabitacionesMeRLayout);
        btnHabitacionesMeRLayout.setHorizontalGroup(
            btnHabitacionesMeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHabitacionesMeRLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtbtnHabitacionesMeR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnHabitacionesMeRLayout.setVerticalGroup(
            btnHabitacionesMeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnHabitacionesMeR, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btnHabitacionesMeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 250, -1));

        btnIngresosHabitacion.setBackground(new java.awt.Color(55, 41, 72));
        btnIngresosHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresosHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresosHabitacionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngresosHabitacionMousePressed(evt);
            }
        });

        txtbtnIngresosHabitacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnIngresosHabitacion.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnIngresosHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnIngresosHabitacion.setText("Ingresos de una habitación");

        javax.swing.GroupLayout btnIngresosHabitacionLayout = new javax.swing.GroupLayout(btnIngresosHabitacion);
        btnIngresosHabitacion.setLayout(btnIngresosHabitacionLayout);
        btnIngresosHabitacionLayout.setHorizontalGroup(
            btnIngresosHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIngresosHabitacionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtbtnIngresosHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnIngresosHabitacionLayout.setVerticalGroup(
            btnIngresosHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnIngresosHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btnIngresosHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 250, -1));

        btnHabitacionesD.setBackground(new java.awt.Color(55, 41, 72));
        btnHabitacionesD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacionesDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacionesDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHabitacionesDMousePressed(evt);
            }
        });

        txtbtnHabitacionesD.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnHabitacionesD.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnHabitacionesD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnHabitacionesD.setText("Habitaciones desocupadas");

        javax.swing.GroupLayout btnHabitacionesDLayout = new javax.swing.GroupLayout(btnHabitacionesD);
        btnHabitacionesD.setLayout(btnHabitacionesDLayout);
        btnHabitacionesDLayout.setHorizontalGroup(
            btnHabitacionesDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHabitacionesDLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtbtnHabitacionesD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnHabitacionesDLayout.setVerticalGroup(
            btnHabitacionesDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnHabitacionesD, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btnHabitacionesD, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 250, -1));

        btnHabitacionMaR.setBackground(new java.awt.Color(55, 41, 72));
        btnHabitacionMaR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacionMaRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacionMaRMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHabitacionMaRMousePressed(evt);
            }
        });

        txtbtnHabitacionMaR.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnHabitacionMaR.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnHabitacionMaR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnHabitacionMaR.setText("Habitación más rentada");

        javax.swing.GroupLayout btnHabitacionMaRLayout = new javax.swing.GroupLayout(btnHabitacionMaR);
        btnHabitacionMaR.setLayout(btnHabitacionMaRLayout);
        btnHabitacionMaRLayout.setHorizontalGroup(
            btnHabitacionMaRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHabitacionMaRLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtbtnHabitacionMaR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnHabitacionMaRLayout.setVerticalGroup(
            btnHabitacionMaRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnHabitacionMaR, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btnHabitacionMaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 250, -1));

        btnIngresosCliente.setBackground(new java.awt.Color(55, 41, 72));
        btnIngresosCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresosClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresosClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngresosClienteMousePressed(evt);
            }
        });

        txtbtnIngresosCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnIngresosCliente.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnIngresosCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnIngresosCliente.setText("Ingresos de un cliente");

        javax.swing.GroupLayout btnIngresosClienteLayout = new javax.swing.GroupLayout(btnIngresosCliente);
        btnIngresosCliente.setLayout(btnIngresosClienteLayout);
        btnIngresosClienteLayout.setHorizontalGroup(
            btnIngresosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIngresosClienteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtbtnIngresosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnIngresosClienteLayout.setVerticalGroup(
            btnIngresosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnIngresosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btnIngresosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 250, -1));
        jPanel1.add(jcInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 170, -1));
        jPanel1.add(jcFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chxHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxHabitacionActionPerformed

    private void btnHabitacionesOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesOMouseEntered
        btnHabitacionesO.setBackground(new Color(37, 27, 55));
        txtbtnHabitacionesO.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnHabitacionesOMouseEntered

    private void btnHabitacionesOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesOMouseExited
        btnHabitacionesO.setBackground(new Color(55, 41, 72));
        txtbtnHabitacionesO.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnHabitacionesOMouseExited

    private void btnHabitacionesOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesOMousePressed
new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Opcion disponible en proximas actualizaciones.");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/LoSentimos.gif")));
    }//GEN-LAST:event_btnHabitacionesOMousePressed

    private void btnGenerarReporte1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReporte1MouseEntered
        btnGenerarReporte1.setBackground(new Color(37, 27, 55));
        txtbtnGenerarReporte1.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnGenerarReporte1MouseEntered

    private void btnGenerarReporte1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReporte1MouseExited
        btnGenerarReporte1.setBackground(new Color(55, 41, 72));
        txtbtnGenerarReporte1.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnGenerarReporte1MouseExited

    private void btnGenerarReporte1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReporte1MousePressed
    String error = validarEntrada();
        if (error.equals("")) {
            System.out.println("No se encuentran errores");
         new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Opcion disponible en proximas actualizaciones.");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/LoSentimos.gif")));
        
        } else {
            new frmMessagep().setVisible(true);

            frmMessagep.txtMessage.setText(validarEntrada());
            frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/info_iconx64.gif")));

        }
     
      

    }//GEN-LAST:event_btnGenerarReporte1MousePressed

    private void btnHabitacionesMeRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesMeRMouseEntered
        btnHabitacionesMeR.setBackground(new Color(37, 27, 55));
        txtbtnHabitacionesMeR.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnHabitacionesMeRMouseEntered

    private void btnHabitacionesMeRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesMeRMouseExited
        btnHabitacionesMeR.setBackground(new Color(55, 41, 72));
        txtbtnHabitacionesMeR.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnHabitacionesMeRMouseExited

    private void btnHabitacionesMeRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesMeRMousePressed
    new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Opcion disponible en proximas actualizaciones.");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/LoSentimos.gif")));
    }//GEN-LAST:event_btnHabitacionesMeRMousePressed

    private void btnIngresosHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosHabitacionMouseEntered
        btnIngresosHabitacion.setBackground(new Color(37, 27, 55));
        txtbtnIngresosHabitacion.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnIngresosHabitacionMouseEntered

    private void btnIngresosHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosHabitacionMouseExited
        btnIngresosHabitacion.setBackground(new Color(55, 41, 72));
        txtbtnIngresosHabitacion.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnIngresosHabitacionMouseExited

    private void btnIngresosHabitacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosHabitacionMousePressed
    new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Opcion disponible en proximas actualizaciones.");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/LoSentimos.gif")));
    }//GEN-LAST:event_btnIngresosHabitacionMousePressed

    private void btnHabitacionesDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesDMouseEntered
        btnHabitacionesD.setBackground(new Color(37, 27, 55));
        txtbtnHabitacionesD.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnHabitacionesDMouseEntered

    private void btnHabitacionesDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesDMouseExited
        btnHabitacionesD.setBackground(new Color(55, 41, 72));
        txtbtnHabitacionesD.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnHabitacionesDMouseExited

    private void btnHabitacionesDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesDMousePressed
    new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Opcion disponible en proximas actualizaciones.");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/LoSentimos.gif")));
    }//GEN-LAST:event_btnHabitacionesDMousePressed

    private void btnHabitacionMaRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionMaRMouseEntered
        btnHabitacionMaR.setBackground(new Color(37, 27, 55));
        txtbtnHabitacionMaR.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnHabitacionMaRMouseEntered

    private void btnHabitacionMaRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionMaRMouseExited
        btnHabitacionMaR.setBackground(new Color(55, 41, 72));
        txtbtnHabitacionMaR.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnHabitacionMaRMouseExited

    private void btnHabitacionMaRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionMaRMousePressed
    new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Opcion disponible en proximas actualizaciones.");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/LoSentimos.gif")));
    }//GEN-LAST:event_btnHabitacionMaRMousePressed

    private void btnIngresosClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosClienteMouseEntered
        btnIngresosCliente.setBackground(new Color(37, 27, 55));
        txtbtnIngresosCliente.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnIngresosClienteMouseEntered

    private void btnIngresosClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosClienteMouseExited
        btnIngresosCliente.setBackground(new Color(55, 41, 72));
        txtbtnIngresosCliente.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnIngresosClienteMouseExited

    private void btnIngresosClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosClienteMousePressed
    new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Opcion disponible en proximas actualizaciones.");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/LoSentimos.gif")));
    }//GEN-LAST:event_btnIngresosClienteMousePressed

    private void btnGenerarReporte1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReporte1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarReporte1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGenerarReporte1;
    private javax.swing.JPanel btnHabitacionMaR;
    private javax.swing.JPanel btnHabitacionesD;
    private javax.swing.JPanel btnHabitacionesMeR;
    private javax.swing.JPanel btnHabitacionesO;
    private javax.swing.JPanel btnIngresosCliente;
    private javax.swing.JPanel btnIngresosHabitacion;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbHabitacion;
    private javax.swing.JCheckBox chxCliente;
    private javax.swing.JCheckBox chxHabitacion;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jcFinal;
    private com.toedter.calendar.JDateChooser jcInicial;
    private javax.swing.JLabel txtCliente;
    private javax.swing.JLabel txtFechaFinal;
    private javax.swing.JLabel txtFechaInicial;
    private javax.swing.JLabel txtHabitacion;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtbtnGenerarReporte1;
    private javax.swing.JLabel txtbtnHabitacionMaR;
    private javax.swing.JLabel txtbtnHabitacionesD;
    private javax.swing.JLabel txtbtnHabitacionesMeR;
    private javax.swing.JLabel txtbtnHabitacionesO;
    private javax.swing.JLabel txtbtnIngresosCliente;
    private javax.swing.JLabel txtbtnIngresosHabitacion;
    // End of variables declaration//GEN-END:variables
 private void cargarIdsHabitaciones() {
        ArrayList<String> lista = gestorFactura.obtenerIdHabitaciones();
      
        for (String hab : lista) {
            cbHabitacion.addItem(hab);
        }

    }

    private void cargarIdsClientes() {
        ArrayList<String> lista = gestorFactura.obtenerIdClientes();
        
        for (String cli : lista) {
            cbCliente.addItem(cli);
        }

    }

 private String validarEntrada() {
        
     
     if (jcInicial.getDate()==null) {
           jcInicial.requestFocus();
            return "Se requiere la fecha de inicial";
         }
        
        if (jcFinal.getDate()==null) {
            jcFinal.requestFocus();
            return "Se requiere la fecha de final";
        }
        
        if(jcInicial.getDate().after(jcFinal.getDate())){
     
     return "La fecha inicial debe ser anterior a la fecha final";
     }
        
        if (chxCliente.isSelected()){
        if (cbCliente.getSelectedIndex()==0) {
            cbCliente.requestFocus();
            return "Elija el id del cliente";
        }
        }
        
        if (chxHabitacion.isSelected()){
        if (cbHabitacion.getSelectedIndex()==0) {
            cbHabitacion.requestFocus();
            return "Elija el id de la habitacion";
        }
        }
        
        return "";
    
}
}
