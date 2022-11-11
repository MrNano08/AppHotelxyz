/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author UNA
 */
public class Dashboard extends javax.swing.JFrame {

    int xMouse, yMouse;
   static String panel;
    int pantallaAl;
    int pantallaAn;
    static boolean abierto = false;


    public Dashboard() {
        initComponents();
        jpInicio inicio = new jpInicio();
        inicio.setSize(650, 500);
        inicio.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(inicio, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        
        setColor(btnInicio);
        resetColor(btnReservaciones);
        resetColor(btnHabitaciones);
        resetColor(btnClientes);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        MenuBar = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        txtInicio = new javax.swing.JLabel();
        btnReservaciones = new javax.swing.JPanel();
        txtReservaciones = new javax.swing.JLabel();
        btnHabitaciones = new javax.swing.JPanel();
        txtHabitaciones = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        txtClientes = new javax.swing.JLabel();
        txtAyuda = new javax.swing.JLabel();
        btnReportesFacturacion = new javax.swing.JPanel();
        txtReportesFacturacion = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        infoBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 236, 239));
        background.setPreferredSize(new java.awt.Dimension(1024, 720));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuBar.setBackground(new java.awt.Color(55, 41, 72));
        MenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnInicio.setBackground(new java.awt.Color(55, 41, 72));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicioMousePressed(evt);
            }
        });

        txtInicio.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtInicio.setForeground(new java.awt.Color(255, 236, 239));
        txtInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtInicio.setText("  Inicio");

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 82, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnReservaciones.setBackground(new java.awt.Color(55, 41, 72));
        btnReservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReservacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReservacionesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReservacionesMousePressed(evt);
            }
        });

        txtReservaciones.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtReservaciones.setForeground(new java.awt.Color(255, 236, 239));
        txtReservaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtReservaciones.setText("  Reservación");

        javax.swing.GroupLayout btnReservacionesLayout = new javax.swing.GroupLayout(btnReservaciones);
        btnReservaciones.setLayout(btnReservacionesLayout);
        btnReservacionesLayout.setHorizontalGroup(
            btnReservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReservacionesLayout.createSequentialGroup()
                .addComponent(txtReservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        btnReservacionesLayout.setVerticalGroup(
            btnReservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        btnHabitaciones.setBackground(new java.awt.Color(55, 41, 72));
        btnHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacionesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHabitacionesMousePressed(evt);
            }
        });

        txtHabitaciones.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtHabitaciones.setForeground(new java.awt.Color(255, 236, 239));
        txtHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtHabitaciones.setText("  Habitaciones");

        javax.swing.GroupLayout btnHabitacionesLayout = new javax.swing.GroupLayout(btnHabitaciones);
        btnHabitaciones.setLayout(btnHabitacionesLayout);
        btnHabitacionesLayout.setHorizontalGroup(
            btnHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHabitacionesLayout.createSequentialGroup()
                .addComponent(txtHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnHabitacionesLayout.setVerticalGroup(
            btnHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        btnClientes.setBackground(new java.awt.Color(55, 41, 72));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClientesMousePressed(evt);
            }
        });

        txtClientes.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtClientes.setForeground(new java.awt.Color(255, 236, 239));
        txtClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtClientes.setText("  Clientes");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addComponent(txtClientes)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        txtAyuda.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        txtAyuda.setForeground(new java.awt.Color(255, 236, 239));
        txtAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/infox14.png"))); // NOI18N
        txtAyuda.setText("Ayuda");
        txtAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAyudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAyudaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAyudaMousePressed(evt);
            }
        });

        btnReportesFacturacion.setBackground(new java.awt.Color(55, 41, 72));
        btnReportesFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesFacturacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesFacturacionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReportesFacturacionMousePressed(evt);
            }
        });

        txtReportesFacturacion.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtReportesFacturacion.setForeground(new java.awt.Color(255, 236, 239));
        txtReportesFacturacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtReportesFacturacion.setText("  Facturación");

        javax.swing.GroupLayout btnReportesFacturacionLayout = new javax.swing.GroupLayout(btnReportesFacturacion);
        btnReportesFacturacion.setLayout(btnReportesFacturacionLayout);
        btnReportesFacturacionLayout.setHorizontalGroup(
            btnReportesFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportesFacturacionLayout.createSequentialGroup()
                .addComponent(txtReportesFacturacion)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnReportesFacturacionLayout.setVerticalGroup(
            btnReportesFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReportesFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        btnConfiguracion.setBackground(new java.awt.Color(55, 41, 72));
        btnConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 236, 239));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/engranaje.png"))); // NOI18N
        jLabel2.setText("Configuracion");

        javax.swing.GroupLayout btnConfiguracionLayout = new javax.swing.GroupLayout(btnConfiguracion);
        btnConfiguracion.setLayout(btnConfiguracionLayout);
        btnConfiguracionLayout.setHorizontalGroup(
            btnConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnConfiguracionLayout.setVerticalGroup(
            btnConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHabitaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReservaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReportesFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addComponent(btnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportesFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, 650));

        infoBar.setBackground(new java.awt.Color(55, 41, 72));
        infoBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                infoBarMouseDragged(evt);
            }
        });
        infoBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                infoBarMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Images/Hotel_img148x70.png"))); // NOI18N

        btnSalir.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(247, 236, 222));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("x");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });

        btnMinimizar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(247, 236, 222));
        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setText("—");
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMinimizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout infoBarLayout = new javax.swing.GroupLayout(infoBar);
        infoBar.setLayout(infoBarLayout);
        infoBarLayout.setHorizontalGroup(
            infoBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoBarLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(836, 836, 836)
                .addComponent(btnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );
        infoBarLayout.setVerticalGroup(
            infoBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(infoBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        background.add(infoBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 70));

        contenido.setBackground(new java.awt.Color(255, 236, 239));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        background.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 880, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        if (btnInicio.getBackground().getRGB() == -13162168 && txtInicio.getForeground().getRGB() == -4881) {
            setColor(btnInicio);
        }
        textsetColor(txtInicio);

        //System.out.println(MenuBar.getBackground().getRGB());-13162168
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        if (btnReservaciones.getBackground().getRGB() != -13162168 || btnHabitaciones.getBackground().getRGB() != -13162168
                || btnClientes.getBackground().getRGB() != -13162168 || btnReportesFacturacion.getBackground().getRGB() != -13162168)  {
            resetColor(btnInicio);
        }
        textresetColor(txtInicio);


    }//GEN-LAST:event_btnInicioMouseExited

    private void btnReservacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservacionesMouseEntered
        if (btnReservaciones.getBackground().getRGB() == -13162168) {
            setColor(btnReservaciones);
        }
        textsetColor(txtReservaciones);
        //System.out.println(txtAcercaDe.getForeground().getRGB());
    }//GEN-LAST:event_btnReservacionesMouseEntered

    private void btnReservacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservacionesMouseExited
        if (btnInicio.getBackground().getRGB() != -13162168 || btnHabitaciones.getBackground().getRGB() != -13162168
                || btnClientes.getBackground().getRGB() != -13162168 || btnReportesFacturacion.getBackground().getRGB() != -13162168) {
            resetColor(btnReservaciones);
        }
        textresetColor(txtReservaciones);
    }//GEN-LAST:event_btnReservacionesMouseExited

    private void btnHabitacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesMouseEntered
        if (btnHabitaciones.getBackground().getRGB() == -13162168) {
            setColor(btnHabitaciones);
        }
        textsetColor(txtHabitaciones);
    }//GEN-LAST:event_btnHabitacionesMouseEntered

    private void btnHabitacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesMouseExited
        if (btnReservaciones.getBackground().getRGB() != -13162168 || btnInicio.getBackground().getRGB() != -13162168
                || btnClientes.getBackground().getRGB() != -13162168 || btnReportesFacturacion.getBackground().getRGB() != -13162168) {
            resetColor(btnHabitaciones);
        }
        textresetColor(txtHabitaciones);
    }//GEN-LAST:event_btnHabitacionesMouseExited

    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
    panel = "Inicio";
        
        
        setColor(btnInicio);
        resetColor(btnReservaciones);
        resetColor(btnHabitaciones);
        resetColor(btnClientes);
        resetColor(btnReportesFacturacion);

        jpInicio inicio = new jpInicio();
        inicio.setSize(contenido.getWidth(), contenido.getHeight() - 100);
        inicio.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(inicio, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnInicioMousePressed

    private void btnReservacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservacionesMousePressed
        panel = "Reservaciones";
        resetColor(btnInicio);
        setColor(btnReservaciones);
        resetColor(btnHabitaciones);
        resetColor(btnClientes);
        resetColor(btnReportesFacturacion);
        jpHabitaciones habitaciones = new jpHabitaciones();
        jpClientes clientes = new jpClientes();
        jpReservaciones reservaciones = new jpReservaciones();
        reservaciones.setSize(contenido.getWidth(), contenido.getHeight());
        reservaciones.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(reservaciones, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnReservacionesMousePressed

    private void btnHabitacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesMousePressed

        panel = "Habitaciones";
        
        resetColor(btnInicio);
        resetColor(btnReservaciones);
        setColor(btnHabitaciones);
        resetColor(btnClientes);
        resetColor(btnReportesFacturacion);

        jpHabitaciones habitaciones = new jpHabitaciones();
        habitaciones.setSize(contenido.getWidth(), contenido.getHeight());
        habitaciones.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(habitaciones, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnHabitacionesMousePressed

    private void txtAyudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAyudaMousePressed

        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {

                try {
                    java.net.URI uri = new java.net.URI("https://proyectoazul323.wixsite.com/hotel");
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_txtAyudaMousePressed

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        if (btnClientes.getBackground().getRGB() == -13162168) {
            setColor(btnClientes);
        }
        textsetColor(txtClientes);
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        if (btnReservaciones.getBackground().getRGB() != -13162168 || btnHabitaciones.getBackground().getRGB() != -13162168
                || btnInicio.getBackground().getRGB() != -13162168 || btnReportesFacturacion.getBackground().getRGB() != -13162168) {
            resetColor(btnClientes);
        }
        textresetColor(txtClientes);
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMousePressed
        
        
        
        panel = "Clientes";
        resetColor(btnInicio);
        resetColor(btnReservaciones);
        resetColor(btnHabitaciones);
        setColor(btnClientes);
        resetColor(btnReportesFacturacion);

        jpClientes clientes = new jpClientes();
        clientes.setSize(contenido.getWidth(), contenido.getHeight());
        clientes.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(clientes, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnClientesMousePressed

    private void btnReportesFacturacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesFacturacionMouseEntered
        if (btnClientes.getBackground().getRGB() == -13162168) {
            setColor(btnReportesFacturacion);
        }
        textsetColor(txtReportesFacturacion);
    }//GEN-LAST:event_btnReportesFacturacionMouseEntered

    private void btnReportesFacturacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesFacturacionMouseExited
        if (btnReservaciones.getBackground().getRGB() != -13162168 || btnHabitaciones.getBackground().getRGB() != -13162168
                || btnInicio.getBackground().getRGB() != -13162168 || btnClientes.getBackground().getRGB() != -13162168) {
            resetColor(btnReportesFacturacion);
        }
        textresetColor(txtReportesFacturacion);
    }//GEN-LAST:event_btnReportesFacturacionMouseExited

    private void btnReportesFacturacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesFacturacionMousePressed
        panel = "ReportesFacturacion";
        resetColor(btnInicio);
        resetColor(btnReservaciones);
        resetColor(btnHabitaciones);
        resetColor(btnClientes);
        setColor(btnReportesFacturacion);
        
        jpReportesFacturacion facturacion = new jpReportesFacturacion();
        facturacion.setSize(contenido.getWidth(), contenido.getHeight());
        facturacion.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(facturacion, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnReportesFacturacionMousePressed

    private void infoBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_infoBarMousePressed

    private void infoBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_infoBarMouseDragged

    private void btnConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseClicked
        panel = "Configuracion de usuario";
        jpConfiguracion configuracion = new jpConfiguracion();
        configuracion.setSize(contenido.getWidth(), contenido.getHeight());
        configuracion.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(configuracion, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnConfiguracionMouseClicked

    private void txtAyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAyudaMouseEntered
     
        textsetColor(txtAyuda);
    }//GEN-LAST:event_txtAyudaMouseEntered

    private void txtAyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAyudaMouseExited
       textresetColor(txtAyuda);
    }//GEN-LAST:event_txtAyudaMouseExited

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        if (abierto == false ) {
        new frmSalir().setVisible(true);    
        abierto = true;
        }
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(Color.red);
        
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(new Color(247,236,222));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnMinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMousePressed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMousePressed

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setForeground(new Color(37, 27, 55));
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setForeground(new Color(247,236,222));
    }//GEN-LAST:event_btnMinimizarMouseExited

    void setColor(JPanel panel) { //Cambiar color de los paneles(botones)
        panel.setBackground(new Color(37, 27, 55));

    }

    void resetColor(JPanel panel) { //Color por defecto de los paneles(botones)
        panel.setBackground(new Color(55, 41, 72));

    }

    void textsetColor(JLabel label) { //Cambiar color del texto de los paneles(botones)
        label.setForeground(new Color(255, 202, 202));

    }

    void textresetColor(JLabel label) {//Color por defecto del texto de los paneles(botones)
        label.setForeground(new Color(255, 236, 239));

    }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuBar;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnConfiguracion;
    private javax.swing.JPanel btnHabitaciones;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JPanel btnReportesFacturacion;
    private javax.swing.JPanel btnReservaciones;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JPanel btnSalir1;
    public static javax.swing.JPanel contenido;
    private javax.swing.JPanel infoBar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtAyuda;
    private javax.swing.JLabel txtClientes;
    private javax.swing.JLabel txtHabitaciones;
    private javax.swing.JLabel txtInicio;
    private javax.swing.JLabel txtReportesFacturacion;
    private javax.swing.JLabel txtReservaciones;
    private javax.swing.JLabel txtSalir1;
    // End of variables declaration//GEN-END:variables

    private void setSize(double pantallaAn, double pantallaAl) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
