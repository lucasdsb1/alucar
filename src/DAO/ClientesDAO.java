/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Clientes;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author l_dsb
 */
public class ClientesDAO {

    public boolean cadastraCli(Clientes c) {

        boolean check = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");

            PreparedStatement stmt = con.prepareStatement("insert into clientes (nome, endereco, dataNasc, sexo, cpf, estadocivil, rg, uf, cidade) values ((?),(?),(?),(?),(?),(?),(?),(?),(?))");
            stmt.setString(1, c.getNomeCli());
            stmt.setString(2, c.getEnderecoCli());
            stmt.setString(3, c.getDataCli());
            stmt.setString(4, c.getSexoCli());
            stmt.setString(5, c.getCpfCli());
            stmt.setString(6, c.getEstadocivilCli());
            stmt.setString(7, c.getRgCli());
            stmt.setString(8, c.getUfCli());
            stmt.setString(9, c.getCidadeCli());

            stmt.execute();
            con.close();
            check = true;

        } catch (Exception e) {

            Object[] options = {"Mostre-me o erro detalhado", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Algo deu errado! Tente novamente mais tarde.", "Erro!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

            if (choice == 0) {

                JOptionPane.showMessageDialog(null, e.getMessage());

            } else {

                System.exit(0);

            }

        }

        return check;

    }

    public List<Clientes> listaCli() {

        List<Clientes> cliente = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            PreparedStatement stmt = con.prepareStatement("select nome, endereco, dataNasc, sexo, cpf, estadocivil, rg, uf, cidade from clientes");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Clientes cli = new Clientes();

                cli.setNomeCli(rs.getString("nome"));
                cli.setCpfCli(rs.getString("cpf"));
                cli.setDataCli(rs.getString("dataNasc"));
                cliente.add(cli);

            }

        } catch (Exception e) {

            Object[] options = {"Mostre-me o erro detalhado", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Algo deu errado! Tente novamente mais tarde.", "Erro!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

            if (choice == 0) {

                JOptionPane.showMessageDialog(null, e.getMessage());

            } else {

                System.exit(0);

            }

        }

        return cliente;

    }
    
    public List<Clientes> buscaCli(String CPF) {
        
        List<Clientes> cliente = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            PreparedStatement stmt = con.prepareStatement("select nome, endereco, dataNasc, sexo, cpf, estadocivil, rg, uf, cidade from clientes where cpf = ?");
            stmt.setString(1, CPF);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Clientes cli = new Clientes();

                cli.setNomeCli(rs.getString("nome"));
                cli.setEnderecoCli(rs.getString("endereco"));
                cli.setDataCli(rs.getString("dataNasc"));
                cli.setSexoCli(rs.getString("sexo"));
                cli.setCpfCli(rs.getString("cpf"));
                cli.setEstadocivilCli(rs.getString("estadocivil"));
                cli.setRgCli(rs.getString("rg"));
                cli.setUfCli(rs.getString("uf"));
                cli.setCidadeCli(rs.getString("cidade"));
                cliente.add(cli);
                
            }
            

        } catch (Exception e) {

            Object[] options = {"Mostre-me o erro detalhado", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Algo deu errado! Tente novamente mais tarde.", "Erro!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

            if (choice == 0) {

                JOptionPane.showMessageDialog(null, e.getMessage());

            } else {

                System.exit(0);

            }

        }

        return cliente;

    }
    
    public boolean excluirCli(Clientes c) {
        
        boolean check = false;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
        
            PreparedStatement stmt = con.prepareStatement("delete from clientes where cpf = ?");
            stmt.setString(1, c.getCpfCli());
            stmt.execute();
            con.close();
            check = true;
            
        } catch (Exception e) {
            
            Object[] options = {"Mostre-me o erro detalhado", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Algo deu errado! Tente novamente mais tarde.", "Erro!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

            if (choice == 0) {

                JOptionPane.showMessageDialog(null, e.getMessage());

            } else {

                System.exit(0);

            }
            
        }
   
        return check;
        
    }
    
    public boolean alterarCli (Clientes c) {
        
        boolean check = false;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            
            PreparedStatement stmt = con.prepareStatement("update clientes set nome = ?, endereco = ?, dataNasc = ?, sexo = ?, estadocivil = ?, rg = ?, uf = ?, cidade = ? where cpf = ?");
            stmt.setString(1, c.getNomeCli());
            stmt.setString(2, c.getEnderecoCli());
            stmt.setString(3, c.getDataCli());
            stmt.setString(4, c.getSexoCli());
            stmt.setString(5, c.getEstadocivilCli());
            stmt.setString(6, c.getRgCli());
            stmt.setString(7, c.getUfCli());
            stmt.setString(8, c.getCidadeCli());
            stmt.setString(9, c.getCpfCli());
            stmt.execute();
            con.close();
            check = true;
            
        } catch (Exception e) {
            
            Object[] options = {"Mostre-me o erro detalhado", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Algo deu errado! Tente novamente mais tarde.", "Erro!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

            if (choice == 0) {

                JOptionPane.showMessageDialog(null, e.getMessage());

            } else {

                System.exit(0);

            }
            
        }
        
        return check;
        
    }

}
