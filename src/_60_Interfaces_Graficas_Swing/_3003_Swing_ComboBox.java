package _60_Interfaces_Graficas_Swing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;

public class _3003_Swing_ComboBox {

    public static void main(String[] args) {
    }

// FUNCIONES Swing ComboBox
// 01-ComboBox      rellenar un ComboBox
// 
// 
/*
    *************************************************************
    01-ComboBox      rellenar un ComboBox
    *************************************************************
     */
    public static void rellenar_jComboBox_Sexo(Connection miConexion, JComboBox jComboBox_Sexo) {
        String sql = "SELECT * FROM sexo";
        try (Statement st = miConexion.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            // vacio el ComboBox
            jComboBox_Sexo.removeAllItems();

            while (rs.next()) {
                int id = rs.getInt("id");
                String sexo = rs.getString("sexo");
                // añado el Item al ComboBox
                jComboBox_Sexo.addItem(sexo);
                // añao el valor al ComboBox
                jComboBox_Sexo.putClientProperty(sexo, id);
            }
            System.out.println("ComboBox " + jComboBox_Sexo.getSelectedItem() + " rellenado correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al rellenar el ComboBox: " + jComboBox_Sexo.getSelectedItem());
            System.err.println("Error SELECT: " + ex.getMessage());
        }
    }

}
