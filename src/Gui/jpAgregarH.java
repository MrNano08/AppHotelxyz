/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

import static Gui.Dashboard.contenido;
import Logica.GestorHabitaciones;
import Logica.Global;
import Logica.Habitaciones;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author UNA
 */
public class jpAgregarH extends jpHabitaciones {

    GestorHabitaciones gestorHabitaciones;
    private FileInputStream fis;
    private int longitudBytes;

    public jpAgregarH() {
        gestorHabitaciones = new GestorHabitaciones();
        gestorHabitaciones.recuperarDeArchivo();

        initComponents();

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
        btnGuardar = new javax.swing.JPanel();
        txtbtnGuardar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdHabitacion = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumHues = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPreAdultos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPreNinnos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboOcupado = new javax.swing.JCheckBox();
        cboActivo = new javax.swing.JCheckBox();
        lblImageH = new javax.swing.JLabel();

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
            .addComponent(txtbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnGuardar.setBackground(new java.awt.Color(55, 41, 72));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
        });

        txtbtnGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtbtnGuardar.setForeground(new java.awt.Color(247, 236, 222));
        txtbtnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnGuardar.setText("Guardar");

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGuardarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel1.setText("Datos habitación");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("Id habitación:");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Imagen:");

        txtIdHabitacion.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        txtDescripcion.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Numero de Huespedes:");

        txtNumHues.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Precio por dia (adultos):");

        txtPreAdultos.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("Precio por dia (niños):");

        txtPreNinnos.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("Ocupado:");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setText("Activo:");

        lblImageH.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblImageH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageH.setText("Seleccionar");
        lblImageH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImageH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImageHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImageHMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImageHMousePressed(evt);
            }
        });

        javax.swing.GroupLayout bgAgregarLayout = new javax.swing.GroupLayout(bgAgregar);
        bgAgregar.setLayout(bgAgregarLayout);
        bgAgregarLayout.setHorizontalGroup(
            bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAgregar)
                .addContainerGap())
            .addGroup(bgAgregarLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgAgregarLayout.createSequentialGroup()
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(txtPreNinnos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgAgregarLayout.createSequentialGroup()
                                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addGroup(bgAgregarLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboOcupado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboActivo)))
                                .addGap(18, 18, 18)
                                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPreAdultos, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(txtNumHues))))
                        .addGap(206, 206, 206)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(bgAgregarLayout.createSequentialGroup()
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(bgAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdHabitacion))
                            .addGroup(bgAgregarLayout.createSequentialGroup()
                                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImageH, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescripcion))))
                        .addGap(316, 316, 316))))
        );
        bgAgregarLayout.setVerticalGroup(
            bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAgregar)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblImageH, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgAgregarLayout.createSequentialGroup()
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNumHues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreNinnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgAgregarLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgAgregarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboActivo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboOcupado, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgAgregarLayout.createSequentialGroup()
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 633, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        setColor(btnBack);
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        resetColor(btnBack);
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed

        jpHabitaciones habitaciones = new jpHabitaciones();
        habitaciones.setSize(contenido.getWidth(), contenido.getHeight());
        habitaciones.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(habitaciones, BorderLayout.CENTER);
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
        jpHabitaciones habitaciones = new jpHabitaciones();
        habitaciones.setSize(contenido.getWidth(), contenido.getHeight());
        habitaciones.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(habitaciones, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(37, 27, 55));
        txtbtnGuardar.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(55, 41, 72));
        txtbtnGuardar.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        String error = validarEntrada();
        if (error.equals("")) {//no hay errores
            Habitaciones habitaciones = new Habitaciones();
            habitaciones.setId(Integer.parseInt(txtIdHabitacion.getText()));
            habitaciones.setDescripcion(txtDescripcion.getText());
            lblImageH.setText("");
            habitaciones.setImagen(lblImageH);
            habitaciones.setNumMaxHus(Integer.parseInt(txtNumHues.getText()));
            habitaciones.setPreNinno(Double.parseDouble(txtPreNinnos.getText()));
            habitaciones.setPreAdultos(Double.parseDouble(txtPreAdultos.getText()));
            habitaciones.setEstado(cboOcupado.isSelected());
            habitaciones.setActiva(cboActivo.isSelected());

            if (txtAgregar.getText().equals("Agregar")) {
                if (gestorHabitaciones.existe(habitaciones.getId())) {
                    new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Id de habitacion ya registrada");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/info_iconx64.gif")));

                } else {
                    gestorHabitaciones.guardar(habitaciones);

                    new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Datos guardados correctamente.");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/info_iconx64.gif")));
                    gestorHabitaciones.guardarEnArchivo();

                }
            } else {
                gestorHabitaciones.editar(habitaciones);
                gestorHabitaciones.guardarEnArchivo();
                new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Datos guardados correctamente.");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/info_iconx64.gif")));
                    
            }

        } else {
            new frmMessagep().setVisible(true);

            frmMessagep.txtMessage.setText(validarEntrada());
            frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/info_iconx64.gif")));

        }

    }//GEN-LAST:event_btnGuardarMousePressed

    private void lblImageHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageHMousePressed
        JFileChooser se = new JFileChooser();
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = se.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {

                fis = new FileInputStream(se.getSelectedFile());
                this.longitudBytes = (int) se.getSelectedFile().length();
                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(lblImageH.getWidth(), lblImageH.getHeight(), Image.SCALE_DEFAULT);
                lblImageH.setIcon(new ImageIcon(icono));
                lblImageH.updateUI();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Error en el primer catch");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error en el segundo catch");
            }  catch (java.lang.NullPointerException e) {
                e.printStackTrace();
                new frmMessagep().setVisible(true);

            frmMessagep.txtMessage.setText("Tipo de archivo no compatible.");
            frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/error_iconx64.gif")));

            } 
                
            
        }
    }//GEN-LAST:event_lblImageHMousePressed

    private void lblImageHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageHMouseEntered
        lblImageH.setForeground(new Color(90, 93,95));
    }//GEN-LAST:event_lblImageHMouseEntered

    private void lblImageHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageHMouseExited
        lblImageH.setForeground(new Color(60,63,65));
    }//GEN-LAST:event_lblImageHMouseExited

    void setColor(JPanel panel) { //Cambiar color de los paneles(botones)
        panel.setBackground(new Color(80, 65, 97));

    }

    void resetColor(JPanel panel) { //Color por defecto de los paneles(botones)
        panel.setBackground(new Color(255, 236, 239));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAgregar;
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    protected static javax.swing.JCheckBox cboActivo;
    protected static javax.swing.JCheckBox cboOcupado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    protected static javax.swing.JLabel lblImageH;
    public javax.swing.JLabel txtAgregar;
    protected static javax.swing.JTextField txtDescripcion;
    protected static javax.swing.JTextField txtIdHabitacion;
    protected static javax.swing.JTextField txtNumHues;
    protected static javax.swing.JTextField txtPreAdultos;
    protected static javax.swing.JTextField txtPreNinnos;
    private javax.swing.JLabel txtbtnBack;
    private javax.swing.JLabel txtbtnCancelar;
    private javax.swing.JLabel txtbtnGuardar;
    // End of variables declaration//GEN-END:variables

    private String validarEntrada() {
        if (txtIdHabitacion.getText().trim().equals("")) {
            txtIdHabitacion.requestFocus();
            return "Ingrese el id de la habitacion.";
        } else {
            try {
                Integer.parseInt(txtIdHabitacion.getText());
            } catch (NumberFormatException e) {
                txtIdHabitacion.requestFocus();
                return "El id de la habitacion debe ser numérico.";
            }

            if (txtDescripcion.getText().trim().equals("")) {
                txtDescripcion.requestFocus();
                return "Ingrese la descripción de la habitación.";
            }

            if (txtNumHues.getText().trim().equals("")) {
                txtNumHues.requestFocus();
                return "Ingrese la cantidad de huespedes.";
            } else {
                try {
                    Integer.parseInt(txtNumHues.getText());
                } catch (NumberFormatException e) {
                    txtNumHues.requestFocus();
                    return "La cantidad de Huespedes debe ser numérica.";
                }
            }

            if (txtPreNinnos.getText().trim().equals("")) {
                txtPreNinnos.requestFocus();
                return "Ingrese el precio para niños.";
            } else {
                try {
                    Double.parseDouble(txtPreNinnos.getText());
                } catch (NumberFormatException e) {
                    txtPreNinnos.requestFocus();
                    return "Los precio deben ser numéricos.";
                }
            }

            if (txtPreAdultos.getText().trim().equals("")) {
                txtPreAdultos.requestFocus();
                return "Ingrese el precio para Adultos.";
            } else {
                try {
                    Double.parseDouble(txtPreAdultos.getText());
                } catch (NumberFormatException e) {
                    txtPreAdultos.requestFocus();
                    return "Los precios deben ser numéricos.";
                }
            }
            return "";
        }
    }

}
