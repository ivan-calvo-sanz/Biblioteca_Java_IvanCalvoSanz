package _60_Interfaces_Graficas_Swing;

import java.awt.Color;
import javax.swing.JOptionPane;

public class _3001_Swing_Button_Form extends javax.swing.JFrame {

    // *************************************************************
    // ABAJO DESPUES DE INICIAR EL FORMULARIO ESTAN LAS FUNCIONES
    // *************************************************************
    public _3001_Swing_Button_Form() {
        // Inicializar los componentes del Formulario
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton_saludar = new javax.swing.JButton();
        jButton_Texto_warning = new javax.swing.JButton();
        jButton_desactivar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton_cambiar_color = new javax.swing.JButton();
        jTextField_Cambia_Texto_jLabel = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField_eliminar_mi_texto = new javax.swing.JTextField();
        jLabel_eliminar_mi_texto = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("FUNCIONES Swing Boton"));
        jPanel1.setToolTipText("");

        jButton_saludar.setText("Saludar");
        jButton_saludar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saludarActionPerformed(evt);
            }
        });

        jButton_Texto_warning.setText("Texto warning");
        jButton_Texto_warning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Texto_warningActionPerformed(evt);
            }
        });

        jButton_desactivar.setText("Desactivar Boton");
        jButton_desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_desactivarActionPerformed(evt);
            }
        });

        jButton1.setText("Activar Boton");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_cambiar_color.setText("Cambia Color Fondo");
        jButton_cambiar_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cambiar_colorActionPerformed(evt);
            }
        });

        jTextField_Cambia_Texto_jLabel.setText("Introduce Nombre");

        jButton2.setText("Cambia texto jLabel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel.setText("jLabel");

        jButton3.setText("Elimina Texto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField_eliminar_mi_texto.setText("Vas a eliminar mi texto");

        jLabel_eliminar_mi_texto.setText("Vas a eliminar mi texto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_cambiar_color)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_eliminar_mi_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton_desactivar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jButton_saludar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton_Texto_warning, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_Cambia_Texto_jLabel)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_eliminar_mi_texto))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton_saludar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Texto_warning)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_desactivar)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jButton_cambiar_color)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel)
                    .addComponent(jTextField_Cambia_Texto_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jTextField_eliminar_mi_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_eliminar_mi_texto))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 01-Mostrar un mensaje en un nuevo Panel
     */
    private void jButton_saludarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saludarActionPerformed
        JOptionPane.showMessageDialog(null, "Saludos a todos");
    }//GEN-LAST:event_jButton_saludarActionPerformed
    /**
     * 02-Mostrar un mensaje en un nuevo Panel con Simbolo de Warning
     */
    private void jButton_Texto_warningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Texto_warningActionPerformed
        JOptionPane.showMessageDialog(null, "Se borrarán todos los archivos", "Alerta", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton_Texto_warningActionPerformed
    /**
     * 03-Desactivar un boton
     */
    private void jButton_desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_desactivarActionPerformed
        jButton_desactivar.setText("desactivado");
        jButton_desactivar.setEnabled(false);
    }//GEN-LAST:event_jButton_desactivarActionPerformed
    /**
     * 04-Activar un boton
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton_desactivar.setText("activado");
        jButton_desactivar.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * 05-Cambiar color fondo boton
     */
    private void jButton_cambiar_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cambiar_colorActionPerformed
        jButton_cambiar_color.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jButton_cambiar_colorActionPerformed
    /**
     * 06-Seleccionar texto de un JTextField y ponerlo en un jLabel
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nombe = jTextField_Cambia_Texto_jLabel.getText();
        jLabel.setText(nombe);
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * 07-Eliminar texto de un JTextField y de un jLabel
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField_eliminar_mi_texto.setText("");
        jLabel_eliminar_mi_texto.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(_3001_Swing_Button_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_3001_Swing_Button_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_3001_Swing_Button_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_3001_Swing_Button_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _3001_Swing_Button_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_Texto_warning;
    private javax.swing.JButton jButton_cambiar_color;
    private javax.swing.JButton jButton_desactivar;
    private javax.swing.JButton jButton_saludar;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel_eliminar_mi_texto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Cambia_Texto_jLabel;
    private javax.swing.JTextField jTextField_eliminar_mi_texto;
    // End of variables declaration//GEN-END:variables
}
