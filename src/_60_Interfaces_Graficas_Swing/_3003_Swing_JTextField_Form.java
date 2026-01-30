package _60_Interfaces_Graficas_Swing;

import javax.swing.JOptionPane;

public class _3003_Swing_JTextField_Form extends javax.swing.JFrame {

    // *************************************************************
    // ABAJO DESPUES DE INICIAR EL FORMULARIO ESTAN LAS FUNCIONES
    // *************************************************************
    public _3003_Swing_JTextField_Form() {
        initComponents();
    }

    // *************************************************************
    // VARIABLES DE ESTADO
    // *************************************************************
    private boolean bloqueado = false;
    private int contador = 0;

    // *************************************************************
    // FUNCIONES AUXILIARES (LOGICA DEL FORMULARIO)
    // *************************************************************
    // Mostrar mensaje
    private void mostrarMensaje(String texto) {
        JOptionPane.showMessageDialog(this, texto);
    }

// Validar texto
    private boolean textoValido(javax.swing.JTextField campo) {
        return !campo.getText().isBlank();
    }

// Limpiar JTextField
    private void limpiarCampo(javax.swing.JTextField campo) {
        campo.setText("");
    }

// Copiar texto entre campos
    private void copiarTexto(javax.swing.JTextField origen, javax.swing.JTextField destino) {
        destino.setText(origen.getText());
    }

// Bloquear / desbloquear campo
    private void alternarBloqueo(javax.swing.JTextField campo) {
        bloqueado = !bloqueado;
        campo.setEnabled(!bloqueado);
        jTextField_estado.setText(bloqueado ? "Campo BLOQUEADO" : "Campo ACTIVO");
    }

// Incrementar contador
    private void incrementarContador() {
        contador++;
        jLabel_contador.setText("Cambios: " + contador);
    }

// Reset general
    private void resetTodo() {
        bloqueado = false;
        contador = 0;
        jTextField_principal.setEnabled(true);
        jTextField_principal.setText("");
        jTextField_copiado.setText("");
        jTextField_estado.setText("");
        jLabel_contador.setText("Cambios: 0");
        mostrarMensaje("Formulario reseteado");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_principal = new javax.swing.JTextField();
        jTextField_copiado = new javax.swing.JTextField();
        jTextField_estado = new javax.swing.JTextField();
        jLabel_info = new javax.swing.JLabel();
        jLabel_contador = new javax.swing.JLabel();
        jButton_leer = new javax.swing.JButton();
        jButton_limpiar = new javax.swing.JButton();
        jButton_copiar = new javax.swing.JButton();
        jButton_bloquear = new javax.swing.JButton();
        jButton_contador = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("FUNCIONES Swing JTextField"));

        jTextField_principal.setText("Escribe algo aquí");

        jLabel_info.setText("Información:");

        jLabel_contador.setText("Cambios: 0");

        jButton_leer.setText("Leer Texto");
        jButton_leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_leerActionPerformed(evt);
            }
        });

        jButton_limpiar.setText("Limpiar");
        jButton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarActionPerformed(evt);
            }
        });

        jButton_copiar.setText("Copiar Texto");
        jButton_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_copiarActionPerformed(evt);
            }
        });

        jButton_bloquear.setText("Bloquear / Desbloquear");
        jButton_bloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bloquearActionPerformed(evt);
            }
        });

        jButton_contador.setText("Contador");
        jButton_contador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_contadorActionPerformed(evt);
            }
        });

        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_reset, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addComponent(jTextField_copiado)
                        .addComponent(jTextField_estado)))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_info)
                    .addComponent(jLabel_contador))
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_contador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_bloquear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_copiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_leer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_info)
                    .addComponent(jButton_leer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_copiado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_contador)
                    .addComponent(jButton_limpiar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_copiar))
                .addGap(18, 18, 18)
                .addComponent(jButton_bloquear)
                .addGap(18, 18, 18)
                .addComponent(jButton_contador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     * 01-Leer texto
     */
    private void jButton_leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_leerActionPerformed
        if (!textoValido(jTextField_principal)) {
            mostrarMensaje("El campo está vacío");
            return;
        }
        mostrarMensaje("Texto: " + jTextField_principal.getText());
    }//GEN-LAST:event_jButton_leerActionPerformed
    /**
     * 02-Limpiar
     */
    private void jButton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarActionPerformed
        limpiarCampo(jTextField_principal);
    }//GEN-LAST:event_jButton_limpiarActionPerformed
    /**
     * 03-Copiar Texto
     */
    private void jButton_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_copiarActionPerformed
        copiarTexto(jTextField_principal, jTextField_copiado);
    }//GEN-LAST:event_jButton_copiarActionPerformed
    /**
     * 04-Bloquear / Desbloquear
     */
    private void jButton_bloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bloquearActionPerformed
        alternarBloqueo(jTextField_principal);
    }//GEN-LAST:event_jButton_bloquearActionPerformed
    /**
     * 05-Contador
     */
    private void jButton_contadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_contadorActionPerformed
        incrementarContador();
    }//GEN-LAST:event_jButton_contadorActionPerformed
    /**
     * 06-Reset
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
            java.util.logging.Logger.getLogger(_3003_Swing_JTextField_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_3003_Swing_JTextField_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_3003_Swing_JTextField_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_3003_Swing_JTextField_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _3003_Swing_JTextField_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_bloquear;
    private javax.swing.JButton jButton_contador;
    private javax.swing.JButton jButton_copiar;
    private javax.swing.JButton jButton_leer;
    private javax.swing.JButton jButton_limpiar;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel_contador;
    private javax.swing.JLabel jLabel_info;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_copiado;
    private javax.swing.JTextField jTextField_estado;
    private javax.swing.JTextField jTextField_principal;
    // End of variables declaration//GEN-END:variables
}
