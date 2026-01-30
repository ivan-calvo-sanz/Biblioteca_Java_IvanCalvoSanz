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

    // *************************************************************
    // VARIABLES DE ESTADO
    // *************************************************************
    private int contador = 0; // para el botón contador
    private boolean estadoAlternar = false; // para el botón Alternar ON/OFF

    // *************************************************************
    // FUNCIONES AUXILIARES (LOGICA DEL FORMULARIO)
    // *************************************************************
    // Activa o desactiva un botón y cambia su texto
    private void activarBoton(javax.swing.JButton boton, boolean activar) {
        boton.setEnabled(activar);
        boton.setText(activar ? "activado" : "desactivado");
    }

    // Mostrar mensaje simple
    private void mostrarMensaje(String texto) {
        JOptionPane.showMessageDialog(this, texto);
    }

    // Mostrar mensaje de warning
    private void mostrarWarning(String texto) {
        JOptionPane.showMessageDialog(this, texto, "Alerta", JOptionPane.WARNING_MESSAGE);
    }

    // Validar que un JTextField no esté vacío
    private boolean textoValido(javax.swing.JTextField campo) {
        return !campo.getText().isBlank();
    }

    // Limpiar JTextField y JLabel
    private void limpiarTexto(javax.swing.JTextField campo, javax.swing.JLabel label) {
        campo.setText("");
        label.setText("");
    }

    // Cambiar color seguro a un botón
    private void cambiarColorBoton(javax.swing.JButton boton, Color color) {
        boton.setOpaque(true);
        boton.setBorderPainted(false);
        boton.setBackground(color);
    }

    // Boton confirmar accion
    private void confirmarAccion() {
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {
            mostrarMensaje("Acción confirmada");
        } else {
            mostrarMensaje("Acción cancelada");
        }
    }

    // Alternar texto de un botón entre ON y OFF
    private void alternarTextoBoton(javax.swing.JButton boton) {
        estadoAlternar = !estadoAlternar; // cambia estado
        boton.setText(estadoAlternar ? "ON" : "OFF");
    }

    // Incrementa el contador y muestra mensaje
    private void incrementarContador() {
        contador++;
        mostrarMensaje("Has pulsado el botón " + contador + " veces");
        jLabel_contador.setText("Contador: " + contador);
    }

    // Cambia el color del botón de forma dinámica Si ya es rojo, cambia a verde; si no, a rojo
    private void cambiarColorDinamico(javax.swing.JButton boton) {
        Color colorActual = boton.getBackground();
        if (Color.RED.equals(colorActual)) {
            cambiarColorBoton(boton, Color.GREEN);
        } else {
            cambiarColorBoton(boton, Color.RED);
        }
    }

    // Resetar todos los botones al estado Inicial
    private void resetTodo() {
        contador = 0;
        estadoAlternar = false;
        jButton_alternar.setText("OFF");
        jLabel.setText("jLabel");
        jLabel_eliminar_mi_texto.setText("Vas a eliminar mi texto");
        jTextField_Cambia_Texto_jLabel.setText("");
        jTextField_eliminar_mi_texto.setText("");
        cambiarColorBoton(jButton_cambiar_color, Color.LIGHT_GRAY);
        cambiarColorBoton(jButton_colorDinamico, Color.LIGHT_GRAY);
        activarBoton(jButton_desactivar, true);
        mostrarMensaje("Todo ha sido reseteado");
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
        jButton_Confirmar = new javax.swing.JButton();
        jButton_alternar = new javax.swing.JButton();
        jButton_contador = new javax.swing.JButton();
        jButton_colorDinamico = new javax.swing.JButton();
        jButton_Resetear_Botones = new javax.swing.JButton();
        jLabel_contador = new javax.swing.JLabel();

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

        jButton_Confirmar.setText("Confirmar accion");
        jButton_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfirmarActionPerformed(evt);
            }
        });

        jButton_alternar.setText("OFF");
        jButton_alternar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alternarActionPerformed(evt);
            }
        });

        jButton_contador.setText("Contador");
        jButton_contador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_contadorActionPerformed(evt);
            }
        });

        jButton_colorDinamico.setText("Color Dinámico");
        jButton_colorDinamico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_colorDinamicoActionPerformed(evt);
            }
        });

        jButton_Resetear_Botones.setText("RESETEAR BOTONES");
        jButton_Resetear_Botones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Resetear_BotonesActionPerformed(evt);
            }
        });

        jLabel_contador.setText("jLabel_Contador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_cambiar_color)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton_colorDinamico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_contador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_alternar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_Confirmar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addComponent(jLabel_contador)))
                        .addContainerGap())
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_eliminar_mi_texto)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jButton_Resetear_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton_saludar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Texto_warning))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Resetear_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(jButton_Confirmar)
                .addGap(18, 18, 18)
                .addComponent(jButton_alternar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_contador)
                    .addComponent(jLabel_contador))
                .addGap(18, 18, 18)
                .addComponent(jButton_colorDinamico)
                .addContainerGap(138, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // *************************************************************
    // ACCIONES DEL FORMULARIO
    // *************************************************************
    /**
     * 01-Mostrar un mensaje en un nuevo Panel
     */
    private void jButton_saludarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saludarActionPerformed
        mostrarMensaje("Saludos a todos");
    }//GEN-LAST:event_jButton_saludarActionPerformed
    /**
     * 02-Mostrar un mensaje en un nuevo Panel con Simbolo de Warning
     */
    private void jButton_Texto_warningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Texto_warningActionPerformed
        mostrarWarning("Se borrarán todos los archivos");
    }//GEN-LAST:event_jButton_Texto_warningActionPerformed
    /**
     * 03-Desactivar un boton
     */
    private void jButton_desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_desactivarActionPerformed
        activarBoton(jButton_desactivar, false);
    }//GEN-LAST:event_jButton_desactivarActionPerformed
    /**
     * 04-Activar un boton
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        activarBoton(jButton_desactivar, true);
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * 05-Cambiar color fondo boton
     */
    private void jButton_cambiar_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cambiar_colorActionPerformed
        cambiarColorBoton(jButton_cambiar_color, Color.YELLOW);
    }//GEN-LAST:event_jButton_cambiar_colorActionPerformed
    /**
     * 06-Seleccionar texto de un JTextField y ponerlo en un jLabel
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!textoValido(jTextField_Cambia_Texto_jLabel)) {
            mostrarWarning("Introduce un texto primero");
            return;
        }
        jLabel.setText(jTextField_Cambia_Texto_jLabel.getText());
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * 07-Eliminar texto de un JTextField y de un jLabel
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiarTexto(jTextField_eliminar_mi_texto, jLabel_eliminar_mi_texto);
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * 08-Boton CONFIRMAR accion
     */
    private void jButton_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfirmarActionPerformed
        confirmarAccion();
    }//GEN-LAST:event_jButton_ConfirmarActionPerformed
    /**
     * 09-Botón Alternar ON/OFF
     */
    private void jButton_alternarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alternarActionPerformed
        alternarTextoBoton(jButton_alternar);
    }//GEN-LAST:event_jButton_alternarActionPerformed
    /**
     * 10-Boton cuenta las veces que se ha pulsado
     */
    private void jButton_contadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_contadorActionPerformed
        incrementarContador();
    }//GEN-LAST:event_jButton_contadorActionPerformed
    /**
     * 11-Boton modifica su color dinamicamente
     */
    private void jButton_colorDinamicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_colorDinamicoActionPerformed
        cambiarColorDinamico(jButton_colorDinamico);
    }//GEN-LAST:event_jButton_colorDinamicoActionPerformed
    /**
     * 12-RESETEAR Botones
     */
    private void jButton_Resetear_BotonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Resetear_BotonesActionPerformed
        resetTodo();
    }//GEN-LAST:event_jButton_Resetear_BotonesActionPerformed

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
    private javax.swing.JButton jButton_Confirmar;
    private javax.swing.JButton jButton_Resetear_Botones;
    private javax.swing.JButton jButton_Texto_warning;
    private javax.swing.JButton jButton_alternar;
    private javax.swing.JButton jButton_cambiar_color;
    private javax.swing.JButton jButton_colorDinamico;
    private javax.swing.JButton jButton_contador;
    private javax.swing.JButton jButton_desactivar;
    private javax.swing.JButton jButton_saludar;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel_contador;
    private javax.swing.JLabel jLabel_eliminar_mi_texto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Cambia_Texto_jLabel;
    private javax.swing.JTextField jTextField_eliminar_mi_texto;
    // End of variables declaration//GEN-END:variables
}
