
package Gui;

import Logica.GestorUsuario;
import Logica.Global;
import Logica.Usuario;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class frmlogin extends javax.swing.JFrame implements Global{

    int xMouse, yMouse;
    int intentos = 2;
    private String usr;
    private String contrasena;
    public frmlogin() {
        initComponents();
        GestorUsuario gestor = new GestorUsuario();
        gestor.recuperarDeArchivo(); 
        Usuario callUserClass = new Usuario();
        for (Usuario usuario : listaUsuario) {
           usr = usuario.getUsuario(); 
           contrasena = usuario.getContrasena();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        barrasuperior = new javax.swing.JPanel();
        closebtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pfContrasena = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        loginbtn = new javax.swing.JPanel();
        loginbtntxt1 = new javax.swing.JLabel();
        cancelarbtn = new javax.swing.JPanel();
        cancelarbtntxt = new javax.swing.JLabel();
        txtmsgError = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(204, 204, 204));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barrasuperior.setBackground(new java.awt.Color(255, 255, 255));
        barrasuperior.setForeground(new java.awt.Color(255, 255, 255));
        barrasuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barrasuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barrasuperiorMouseDragged(evt);
            }
        });
        barrasuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barrasuperiorMousePressed(evt);
            }
        });

        closebtn.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout closebtnLayout = new javax.swing.GroupLayout(closebtn);
        closebtn.setLayout(closebtnLayout);
        closebtnLayout.setHorizontalGroup(
            closebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        closebtnLayout.setVerticalGroup(
            closebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barrasuperiorLayout = new javax.swing.GroupLayout(barrasuperior);
        barrasuperior.setLayout(barrasuperiorLayout);
        barrasuperiorLayout.setHorizontalGroup(
            barrasuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barrasuperiorLayout.createSequentialGroup()
                .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        barrasuperiorLayout.setVerticalGroup(
            barrasuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(barrasuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setText("INICIAR SESIÓN");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtUsuario.setForeground(java.awt.Color.gray);
        txtUsuario.setText("Ingrese su nombre de usuario.");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 280, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setText("USUARIO");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        pfContrasena.setBackground(new java.awt.Color(255, 255, 255));
        pfContrasena.setForeground(java.awt.Color.gray);
        pfContrasena.setText("contrasena");
        pfContrasena.setToolTipText("");
        pfContrasena.setBorder(null);
        pfContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pfContrasenaMousePressed(evt);
            }
        });
        pfContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfContrasenaActionPerformed(evt);
            }
        });
        bg.add(pfContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 280, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 10));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 10));

        loginbtn.setBackground(new java.awt.Color(55, 41, 72));
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginbtnMousePressed(evt);
            }
        });

        loginbtntxt1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        loginbtntxt1.setForeground(new java.awt.Color(255, 236, 239));
        loginbtntxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbtntxt1.setText("Aceptar");
        loginbtntxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginbtntxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtntxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbtntxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbtntxt1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginbtntxt1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout loginbtnLayout = new javax.swing.GroupLayout(loginbtn);
        loginbtn.setLayout(loginbtnLayout);
        loginbtnLayout.setHorizontalGroup(
            loginbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginbtntxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        loginbtnLayout.setVerticalGroup(
            loginbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginbtntxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 30));

        cancelarbtn.setBackground(new java.awt.Color(55, 41, 72));
        cancelarbtn.setForeground(new java.awt.Color(255, 255, 255));

        cancelarbtntxt.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        cancelarbtntxt.setForeground(new java.awt.Color(255, 236, 239));
        cancelarbtntxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarbtntxt.setText("Cancelar");
        cancelarbtntxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarbtntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarbtntxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarbtntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarbtntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cancelarbtnLayout = new javax.swing.GroupLayout(cancelarbtn);
        cancelarbtn.setLayout(cancelarbtnLayout);
        cancelarbtnLayout.setHorizontalGroup(
            cancelarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarbtntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancelarbtnLayout.setVerticalGroup(
            cancelarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarbtntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(cancelarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        txtmsgError.setBackground(new java.awt.Color(255, 255, 255));
        txtmsgError.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtmsgError.setForeground(new java.awt.Color(255, 255, 255));
        txtmsgError.setText("Usuario o contraseña incorrectos   Intentos restantes:");
        bg.add(txtmsgError, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        btnAyuda.setBackground(new java.awt.Color(242, 242, 242));
        btnAyuda.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        btnAyuda.setForeground(new java.awt.Color(102, 102, 102));
        btnAyuda.setText(" Ayuda ");
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAyudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAyudaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAyudaMousePressed(evt);
            }
        });
        bg.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void barrasuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrasuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barrasuperiorMousePressed

    private void barrasuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrasuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barrasuperiorMouseDragged

    private void cancelarbtntxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarbtntxtMouseClicked
    System.exit(0);
    }//GEN-LAST:event_cancelarbtntxtMouseClicked

    private void loginbtntxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtntxt1MouseEntered
        loginbtn.setBackground(new Color(37, 27, 55));
        loginbtntxt1.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_loginbtntxt1MouseEntered

    private void loginbtntxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtntxt1MouseExited
        loginbtn.setBackground(new Color(55, 41, 72));
        loginbtntxt1.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_loginbtntxt1MouseExited

    private void cancelarbtntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarbtntxtMouseEntered
        cancelarbtn.setBackground(new Color(37, 27, 55));
        cancelarbtntxt.setForeground(new Color(255, 202, 202));
    }//GEN-LAST:event_cancelarbtntxtMouseEntered

    private void cancelarbtntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarbtntxtMouseExited
        cancelarbtn.setBackground(new Color(55, 41, 72));
        cancelarbtntxt.setForeground(new Color(255, 236, 239));
    }//GEN-LAST:event_cancelarbtntxtMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Ingrese su nombre de usuario.")) {
        txtUsuario.setText("");
        txtUsuario.setForeground(Color.BLACK);
    }
        if (String.valueOf(pfContrasena.getPassword()).isEmpty()) {
        pfContrasena.setText("contrasena");
        pfContrasena.setForeground(Color.GRAY);
    }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void pfContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfContrasenaMousePressed
       if (String.valueOf(pfContrasena.getPassword()).equals("contrasena")) {
        pfContrasena.setText("");
        pfContrasena.setForeground(Color.BLACK);
       }
       if (txtUsuario.getText().isEmpty()) {
        txtUsuario.setText("Ingrese su nombre de usuario.");
        txtUsuario.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_pfContrasenaMousePressed

    private void loginbtntxt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtntxt1MousePressed


        if (String.valueOf(pfContrasena.getPassword()).equals(contrasena) && txtUsuario.getText().equals(usr)) {
            this.dispose();
            new Dashboard().setVisible(true);
 
        }else{
                        
            txtmsgError.setForeground(Color.red);

            }


        


    }//GEN-LAST:event_loginbtntxt1MousePressed

    private void pfContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfContrasenaActionPerformed

    private void loginbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMousePressed

    }//GEN-LAST:event_loginbtnMousePressed

    private void loginbtntxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtntxt1MouseClicked
         
        intentos--;
            if (intentos<0) {
                System.exit(0);
            } else {
            txtmsgError.setText("Usuario o contraseña incorrectos   Intentos restantes: "+ (intentos+1)+".");
            }
    }//GEN-LAST:event_loginbtntxt1MouseClicked

    private void btnAyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseEntered
        btnAyuda.setBackground(new Color (242,242,242));
        btnAyuda.setForeground(new Color (0,0,0));

    Font font = btnAyuda.getFont();
    Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
    attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    btnAyuda.setFont(font.deriveFont(attributes));

    }//GEN-LAST:event_btnAyudaMouseEntered

    private void btnAyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseExited
        btnAyuda.setBackground(new Color (242,242,242));
        btnAyuda.setForeground(new Color (102,102,102));

    Font font = btnAyuda.getFont();
    Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
    attributes.put(TextAttribute.UNDERLINE, -1);
    btnAyuda.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_btnAyudaMouseExited

    private void btnAyudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMousePressed
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
    }//GEN-LAST:event_btnAyudaMousePressed

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
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barrasuperior;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnAyuda;
    private javax.swing.JPanel cancelarbtn;
    private javax.swing.JLabel cancelarbtntxt;
    private javax.swing.JPanel closebtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel loginbtn;
    private javax.swing.JLabel loginbtntxt1;
    private javax.swing.JPasswordField pfContrasena;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel txtmsgError;
    // End of variables declaration//GEN-END:variables

    @Override
    public void guardarEnArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void recuperarDeArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    }
    

