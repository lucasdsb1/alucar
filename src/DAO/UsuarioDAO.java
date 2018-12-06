package DAO;

import Classes.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public boolean fazerLogin(Usuario u) {

        boolean check = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");

            PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuarios WHERE login = ? and senha = ?");
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
            }

            con.close();

        } catch (Exception e) {
            
            Object[] options = {"Mostre-me o erro detalhado", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Conexão perdida! Tente novamente mais tarde.", "Erro!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

            if (choice == 0) {

                JOptionPane.showMessageDialog(null, e.getMessage());
                System.exit(0);

            }
            
            else {
                
                System.exit(0);
                
            }
        
        }

    return check ;

}

}
