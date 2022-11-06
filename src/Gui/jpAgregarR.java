/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

import static Gui.Dashboard.contenido;
import Logica.GestorReservaciones;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JPanel;


/**
 *
 * @author UNA
 */
public class jpAgregarR extends javax.swing.JPanel {

   Calendar fecha_actual= new GregorianCalendar();
   GestorReservaciones gestorReservaciones;
    
    public jpAgregarR() {
        initComponents(); 
        
        jcFechaActual.setCalendar(fecha_actual);
        gestorReservaciones = new GestorReservaciones();
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

        bgAgregar = new javax.swing.JPanel();
        txtAgregar = new javax.swing.JLabel();
        btnBack = new javax.swing.JPanel();
        txtbtnBack = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        txtbtnCancelar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        txtbtnAgregar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbOcupantesNinos = new javax.swing.JComboBox<>();
        cbCliente = new javax.swing.JComboBox<>();
        cbHabitacion = new javax.swing.JComboBox<>();
        cbOcupantesAdultos = new javax.swing.JComboBox<>();
        txtFormaPago = new javax.swing.JTextField();
        cdDescuento = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        txtDiasHospedaje = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        jcFechaActual = new com.toedter.calendar.JDateChooser();
        jcFechaFinal = new com.toedter.calendar.JDateChooser();
        jcFechaInicial = new com.toedter.calendar.JDateChooser();
        btnCalcular = new javax.swing.JPanel();
        txtbtnCalcular = new javax.swing.JLabel();

        bgAgregar.setBackground(new java.awt.Color(255, 236, 239));

        txtAgregar.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        txtAgregar.setText("Agregar");

        btnBack.setBackground(new java.awt.Color(255, 236, 239));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackMousePressed(evt);
            }
        });

        txtbtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/back_iconx48.png"))); // NOI18N

        javax.swing.GroupLayout btnBackLayout = new javax.swing.GroupLayout(btnBack);
        btnBack.setLayout(btnBackLayout);
        btnBackLayout.setHorizontalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackLayout.createSequentialGroup()
                .addComponent(txtbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnBackLayout.setVerticalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackLayout.createSequentialGroup()
                .addComponent(txtbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnCancelar.setBackground(new java.awt.Color(55, 41, 72));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });

        txtbtnCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnCancelar.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnCancelar.setText("Cancelar");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

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

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setText("Fecha actual:");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setText("Id huesped:");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setText("Id habitación:");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setText("Forma de pago:");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setText("Ocupantes adultos:");

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setText("Ocupantes niños:");

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel7.setText("Fecha inicial:");

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel8.setText("Fecha final:");

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel9.setText("Días de hospedaje:");

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel10.setText("Sub-Total:");

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel11.setText("Descuento:");

        jLabel12.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel12.setText("Total:");

        jLabel13.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel13.setText("Datos de la renta");

        cbOcupantesNinos.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        cbOcupantesNinos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        cbCliente.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        cbHabitacion.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        cbHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        cbOcupantesAdultos.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        cbOcupantesAdultos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        txtFormaPago.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        cdDescuento.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        cdDescuento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        txtTotal.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        txtDiasHospedaje.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        txtSubtotal.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        jcFechaActual.setDateFormatString("dd/MM/yyyy");
        jcFechaActual.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        jcFechaFinal.setDateFormatString("dd/MM/yyyy");
        jcFechaFinal.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        jcFechaInicial.setDateFormatString("dd/MM/yyyy");
        jcFechaInicial.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        btnCalcular.setBackground(new java.awt.Color(55, 41, 72));
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalcularMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCalcularMousePressed(evt);
            }
        });

        txtbtnCalcular.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnCalcular.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnCalcular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnCalcular.setText("Calcular");

        javax.swing.GroupLayout btnCalcularLayout = new javax.swing.GroupLayout(btnCalcular);
        btnCalcular.setLayout(btnCalcularLayout);
        btnCalcularLayout.setHorizontalGroup(
            btnCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCalcularLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtbtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnCalcularLayout.setVerticalGroup(
            btnCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgAgregarLayout = new javax.swing.GroupLayout(bgAgregar);
        bgAgregar.setLayout(bgAgregarLayout);
        bgAgregarLayout.setHorizontalGroup(
            bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgAgregarLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAgregar))
                    .addGroup(bgAgregarLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(bgAgregarLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                    .addComponent(cdDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bgAgregarLayout.createSequentialGroup()
                                    .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTotal)
                                        .addComponent(txtDiasHospedaje)
                                        .addComponent(txtSubtotal)
                                        .addGroup(bgAgregarLayout.createSequentialGroup()
                                            .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbOcupantesNinos, 0, 376, Short.MAX_VALUE)
                                                .addComponent(cbCliente, 0, 376, Short.MAX_VALUE)
                                                .addComponent(cbHabitacion, 0, 376, Short.MAX_VALUE)
                                                .addComponent(cbOcupantesAdultos, 0, 376, Short.MAX_VALUE)
                                                .addComponent(txtFormaPago)
                                                .addComponent(jcFechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jcFechaFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jcFechaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgAgregarLayout.createSequentialGroup()
                                .addGap(0, 73, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgAgregarLayout.createSequentialGroup()
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        bgAgregarLayout.setVerticalGroup(
            bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAgregar)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbOcupantesAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbOcupantesNinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jcFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgAgregarLayout.createSequentialGroup()
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel8)
                                .addGap(21, 21, 21)
                                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtDiasHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cdDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgAgregarLayout.createSequentialGroup()
                        .addComponent(jcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 604, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        setColor(btnBack);
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        resetColor(btnBack);
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
        
        
        jpReservaciones reservaciones = new jpReservaciones();
        reservaciones.setSize(contenido.getWidth(), contenido.getHeight());
        reservaciones.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(reservaciones, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        
        
    }//GEN-LAST:event_btnBackMousePressed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(37, 27, 55));
        txtbtnCancelar.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(55, 41, 72));
        txtbtnCancelar.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        jpReservaciones reservaciones = new jpReservaciones();
        reservaciones.setSize(contenido.getWidth(), contenido.getHeight());
        reservaciones.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(reservaciones, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(37, 27, 55));
        txtbtnAgregar.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(55, 41, 72));
        txtbtnAgregar.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnCalcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseEntered
        btnCalcular.setBackground(new Color(37, 27, 55));
        txtbtnCalcular.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnCalcularMouseEntered

    private void btnCalcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseExited
        btnCalcular.setBackground(new Color(55, 41, 72));
        txtbtnCalcular.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnCalcularMouseExited

    private void btnCalcularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMousePressed
        calcular(jcFechaInicial, jcFechaFinal);
    }//GEN-LAST:event_btnCalcularMousePressed

void setColor(JPanel panel) { //Cambiar color de los paneles(botones)
        panel.setBackground(new Color(80,65,97));

    }

    void resetColor(JPanel panel) { //Color por defecto de los paneles(botones)
        panel.setBackground(new Color(255,236,239));

    }
    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAgregar;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel btnCalcular;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbHabitacion;
    private javax.swing.JComboBox<String> cbOcupantesAdultos;
    private javax.swing.JComboBox<String> cbOcupantesNinos;
    private javax.swing.JComboBox<String> cdDescuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jcFechaActual;
    private com.toedter.calendar.JDateChooser jcFechaFinal;
    private com.toedter.calendar.JDateChooser jcFechaInicial;
    private javax.swing.JLabel txtAgregar;
    private javax.swing.JTextField txtDiasHospedaje;
    private javax.swing.JTextField txtFormaPago;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel txtbtnAgregar;
    private javax.swing.JLabel txtbtnBack;
    private javax.swing.JLabel txtbtnCalcular;
    private javax.swing.JLabel txtbtnCancelar;
    // End of variables declaration//GEN-END:variables

public void calcular(JDateChooser jcFechaInicial, JDateChooser jcFechaFinal){
    
    if (jcFechaInicial.getDate() != null && jcFechaFinal.getDate()!=null) {
        Calendar inicio = jcFechaInicial.getCalendar();
        Calendar termino = jcFechaFinal.getCalendar();
        int dias =-1;
        
        while (inicio.before(termino)|| inicio.equals(termino)) {            
            dias++;
            inicio.add(Calendar.DATE,1);
        }
        txtDiasHospedaje.setText(String.valueOf(dias));
    } else {
    }


}

 private void cargarIdsHabitaciones() {
        ArrayList<String> lista = gestorReservaciones.obtenerIdHabitaciones();
      
        for (String hab : lista) {
            cbHabitacion.addItem(hab);
        }

    }

    private void cargarIdsClientes() {
        ArrayList<String> lista = gestorReservaciones.obtenerIdClientes();
        
        for (String cli : lista) {
            cbCliente.addItem(cli);
        }

    }


}
