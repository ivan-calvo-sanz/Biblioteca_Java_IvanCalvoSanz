package _60_Interfaces_Graficas_Swing;

import java.awt.Color;
import javax.swing.JOptionPane;

public class _3002_Swing_JLabel_Form extends javax.swing.JFrame {

    // *************************************************************
    // ABAJO DESPUES DE INICIAR EL FORMULARIO ESTAN LAS FUNCIONES
    // *************************************************************
    public _3002_Swing_JLabel_Form() {
        initComponents();
        // Estado inicial de los JLabel
        jLabel.setText("Etiqueta Inicial");
        jLabel.setForeground(Color.BLACK);
        jLabel_contador.setText("Cambios: 0");
    }

    // *************************************************************
    // VARIABLES DE ESTADO
    // *************************************************************
    private int contadorCambios = 0; // para contar cambios de texto
    private boolean estadoMayusculas = false; // alternar mayúsculas/minúsculas
    // *************************************************************
    // FUNCIONES AUXILIARES (LOGICA DEL FORMULARIO)
    // *************************************************************

    // Cambiar texto del JLabel
    private void cambiarTexto(String texto) {
        if (texto.isBlank()) {
            mostrarWarning("Introduce un texto primero");
            return;
        }
        jLabel.setText(texto);
        contadorCambios++;
        jLabel_contador.setText("Cambios: " + contadorCambios);
    }

    // Mostrar mensaje simple
    private void mostrarMensaje(String texto) {
        JOptionPane.showMessageDialog(this, texto);
    }

    // Mostrar mensaje warning
    private void mostrarWarning(String texto) {
        JOptionPane.showMessageDialog(this, texto, "Alerta", JOptionPane.WARNING_MESSAGE);
    }

    // Cambiar color del JLabel
    private void cambiarColor(Color color) {
        jLabel.setForeground(color);
    }

    // Alternar mayúsculas/minúsculas
    private void alternarMayusculas() {
        estadoMayusculas = !estadoMayusculas;
        String textoActual = jLabel.getText();
        jLabel.setText(estadoMayusculas ? textoActual.toUpperCase() : textoActual.toLowerCase());
    }

    // Resetear JLabel y contador
    private void resetTodo() {
        jLabel.setText("Etiqueta Inicial");
        jLabel.setForeground(Color.BLACK);
        jTextField.setText("");
        contadorCambios = 0;
        jLabel_contador.setText("Cambios: 0");
        estadoMayusculas = false;
        mostrarMensaje("JLabel reseteado");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jTextField = new javax.swing.JTextField();
        jButton_cambiarTexto = new javax.swing.JButton();
        jButton_cambiarColor = new javax.swing.JButton();
        jButton_alternar = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jLabel_contador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("FUNCIONES Swing JLabel"));

        jLabel.setText("Etiqueta Inicial");

        jTextField.setText("Introduce texto aquí");

        jButton_cambiarTexto.setText("Cambiar Texto");
        jButton_cambiarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cambiarTextoActionPerformed(evt);
            }
        });

        jButton_cambiarColor.setText("Cambiar Color");
        jButton_cambiarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cambiarColorActionPerformed(evt);
            }
        });

        jButton_alternar.setText("Mayúsculas/Minúsculas");
        jButton_alternar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alternarActionPerformed(evt);
            }
        });

        jButton_reset.setText("Reset JLabel");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        jLabel_contador.setText("Cambios: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_alternar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_cambiarColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_cambiarTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_contador))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_contador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(jButton_cambiarTexto)
                    .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_cambiarColor)
                .addGap(18, 18, 18)
                .addComponent(jButton_alternar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // *************************************************************
    // ACCIONES DEL FORMULARIO
    // *************************************************************

    /**
     * 01-Cambiar Texto
     */
    private void jButton_cambiarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cambiarTextoActionPerformed
        cambiarTexto(jTextField.getText());
    }//GEN-LAST:event_jButton_cambiarTextoActionPerformed
    /**
     * 02-Cambiar Color
     */
    private void jButton_cambiarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cambiarColorActionPerformed
        cambiarColor(Color.RED); // o cualquier color que quieras
    }//GEN-LAST:event_jButton_cambiarColorActionPerformed
    /**
     * 03-Alternar Mayusculas/Minusculas
     */
    private void jButton_alternarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alternarActionPerformed
        alternarMayusculas();
    }//GEN-LAST:event_jButton_alternarActionPerformed
    /**
     * 04-Resetear JLabel
     */
    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        resetTodo();
    }//GEN-LAST:event_jButton_resetActionPerformed

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
            java.util.logging.Logger.getLogger(_3002_Swing_JLabel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_3002_Swing_JLabel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_3002_Swing_JLabel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_3002_Swing_JLabel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _3002_Swing_JLabel_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_alternar;
    private javax.swing.JButton jButton_cambiarColor;
    private javax.swing.JButton jButton_cambiarTexto;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel_contador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables
}
