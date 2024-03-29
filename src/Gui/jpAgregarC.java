/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

import static Gui.Dashboard.contenido;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import Logica.Clientes;
import Logica.GestorClientes;

import Logica.Global;
import javax.swing.ImageIcon;

/**
 *
 * @author UNA
 */
public class jpAgregarC extends jpClientes {

    GestorClientes gestorClientes;
    public jpAgregarC() {
        gestorClientes= new GestorClientes();
        gestorClientes.recuperarDeArchivo();
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
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtIdHuesped = new javax.swing.JTextField();
        btnBack = new javax.swing.JPanel();
        txtbtnBack = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        txtbtnGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        txtbtnCancelar = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();

        bgAgregar.setBackground(new java.awt.Color(255, 236, 239));

        txtAgregar.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        txtAgregar.setForeground(new java.awt.Color(0, 0, 0));
        txtAgregar.setText("Agregar");

        lblNombre.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblNombre.setText("Nombre:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setText("ID Huésped:");

        txtNombre.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        txtIdHuesped.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        txtIdHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdHuespedActionPerformed(evt);
            }
        });

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
            .addComponent(txtbtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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

        txtDireccion.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel1.setText("Datos del huésped");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setText("Empresa:");

        txtEmpresa.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });

        txtCorreo.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setText("Correo:");

        txtTelefono.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel7.setText("Teléfono:");

        lblApellidos.setBackground(new java.awt.Color(0, 0, 0));
        lblApellidos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblApellidos.setText("Apellidos:");

        txtApellidos.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        javax.swing.GroupLayout bgAgregarLayout = new javax.swing.GroupLayout(bgAgregar);
        bgAgregar.setLayout(bgAgregarLayout);
        bgAgregarLayout.setHorizontalGroup(
            bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAgregarLayout.createSequentialGroup()
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgAgregarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgAgregarLayout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAgregar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgAgregarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bgAgregarLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(bgAgregarLayout.createSequentialGroup()
                                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtIdHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                    .addComponent(txtEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                    .addComponent(txtApellidos))))
                        .addGap(0, 329, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgAgregarLayout.setVerticalGroup(
            bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAgregarLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgAgregarLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 573, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgAgregarLayout.createSequentialGroup()
                        .addComponent(txtAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        setColor(btnBack);
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        resetColor(btnBack);
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed

        jpClientes clientes = new jpClientes();
        clientes.setSize(contenido.getWidth(), contenido.getHeight());
        clientes.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(clientes, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        
        
    }//GEN-LAST:event_btnBackMousePressed

    private void txtIdHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdHuespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdHuespedActionPerformed

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
            Clientes clientes = new Clientes();
            clientes.setId(Integer.parseInt(txtIdHuesped.getText()));
            clientes.setNombre(txtNombre.getText());
            clientes.setApellidos(txtApellidos.getText());
            clientes.setDireccion(txtDireccion.getText());
            clientes.setEmpresa(txtEmpresa.getText());
            clientes.setCorreo(txtCorreo.getText().toLowerCase());
            clientes.setTelefono(Integer.parseInt(txtTelefono.getText()));

            if (txtAgregar.getText().equals("Agregar")) {
                if (gestorClientes.existe(clientes.getId())) {
                    new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Id de cliente ya registrada");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/info_iconx64.gif")));

                } else {
                    gestorClientes.guardar(clientes);

                    new frmMessagep().setVisible(true);
                    frmMessagep.txtMessage.setText("Datos guardados correctamente.");
                    frmMessagep.txtMessageImage.setIcon(new ImageIcon(getClass().getResource("/resources/Icons/info_iconx64.gif")));
                    gestorClientes.guardarEnArchivo();

                }
            } else {
                gestorClientes.editar(clientes);
                gestorClientes.guardarEnArchivo();
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

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(37, 27, 55));
        txtbtnCancelar.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(55, 41, 72));
        txtbtnCancelar.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        jpClientes clientes = new jpClientes();
        clientes.setSize(contenido.getWidth(), contenido.getHeight());
        clientes.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(clientes, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

void setColor(JPanel panel) { //Cambiar color de los paneles(botones)
        panel.setBackground(new Color(80,65,97));

    }

    void resetColor(JPanel panel) { //Color por defecto de los paneles(botones)
        panel.setBackground(new Color(255,236,239));

    }
    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAgregar;
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblNombre;
    protected javax.swing.JLabel txtAgregar;
    protected static javax.swing.JTextField txtApellidos;
    protected static javax.swing.JTextField txtCorreo;
    protected static javax.swing.JTextField txtDireccion;
    protected static javax.swing.JTextField txtEmpresa;
    protected static javax.swing.JTextField txtIdHuesped;
    protected static javax.swing.JTextField txtNombre;
    protected static javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtbtnBack;
    private javax.swing.JLabel txtbtnCancelar;
    private javax.swing.JLabel txtbtnGuardar;
    // End of variables declaration//GEN-END:variables

private String validarEntrada() {
        

            if (txtNombre.getText().trim().equals("")) {
                txtNombre.requestFocus();
                return "Ingrese el Nombre del cliente.";
            }
            
             if (txtApellidos.getText().trim().equals("")) {
                txtApellidos.requestFocus();
                return "Digite los apellidos del cliente.";
            }
            
            if (txtIdHuesped.getText().trim().equals("")) {
            txtIdHuesped.requestFocus();
            return "Se requiere el id del cliente.";
        } else {
            try {
                Integer.parseInt(txtIdHuesped.getText());
            } catch (NumberFormatException e) {
                txtIdHuesped.requestFocus();
                return "El id del cliente debe ser numérico.";
            }

            if (txtDireccion.getText().trim().equals("")) {
                txtDireccion.requestFocus();
                return "Ingrese la dirección.";
            }

            if (txtEmpresa.getText().trim().equals("")) {
                txtEmpresa.requestFocus();
                return "Ingrese la empresa del cliente.";
            }

            if (txtCorreo.getText().trim().equals("")) {
                txtCorreo.requestFocus();
                return "Ingrese el correo del cliente.";
            }
            
            if (txtTelefono.getText().trim().equals("")) {
            txtTelefono.requestFocus();
            return "Se requiere el número de teléfono del cliente.";
        } else {
            try {
                    Integer.parseInt(txtTelefono.getText());
            } catch (NumberFormatException e) {
                txtTelefono.requestFocus();
                return "El número de teléfono del cliente debe ser numérico.";
            }
                
            }
            return "";

        }
    }
}



