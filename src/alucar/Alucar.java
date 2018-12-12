package alucar;

import View.loginForm;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Alucar {

    public static void main(String[] args) {

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        
        JOptionPane.showMessageDialog(null,"É necessário configurar o banco de dados na inicialização. Clique em *Configurar BD* na tela de login.");
        loginForm frame = new loginForm();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
