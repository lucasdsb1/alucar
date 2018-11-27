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

        boolean check = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            check = true;
            con.close();

        } catch (Exception e) {

            Object[] options = {"Mostre-me o erro detalhado", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Tempo de conexão excedido! Tente novamente mais tarde.", "Erro!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

            if (choice == 0) {

                JOptionPane.showMessageDialog(null, e.getMessage());

            }

            check = false;

        }

        if (check == true) {

            loginForm frame = new loginForm();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        }

    }

}
