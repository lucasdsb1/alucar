/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.VeiculoUsado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author l_dsb
 */
public class VeiculoDAO implements InterfaceCRUD<VeiculoUsado> {

    @Override
    public boolean insertIntoDB(VeiculoUsado v) {
        
        boolean check = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");

            PreparedStatement stmt = con.prepareStatement("insert into veiculo (placa, renavam, anofab, quilometragem, avariado, nome, motorizacao) values ((?),(?),(?),(?),(?),(?),(?))");
            stmt.setString(1, v.getPlaca());
            stmt.setLong(2, v.getRenavam());
            stmt.setString(3, v.getAnoFab());
            stmt.setLong(4, v.getQuilometragem());
            stmt.setString(5, v.getAvariado());
            stmt.setString(6, v.getModelo());
            stmt.setString(7, v.getMotorizacao());

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

    @Override
    public boolean alterIntoDB(VeiculoUsado v) {
        
        boolean check = false;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            
            PreparedStatement stmt = con.prepareStatement("update veiculo set anofab = ?, quilometragem = ?, avariado = ?, nome = ?, motorizacao = ? where placa = ?");
            stmt.setString(1, v.getAnoFab());
            stmt.setLong(2, v.getQuilometragem());
            stmt.setString(3, v.getAvariado());
            stmt.setString(4, v.getModelo());
            stmt.setString(5, v.getMotorizacao());
            stmt.setString(6, v.getPlaca());
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

    @Override
    public boolean deleteFromDB(VeiculoUsado v) {
        
        boolean check = false;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
        
            PreparedStatement stmt = con.prepareStatement("delete from veiculo where placa = ?");
            stmt.setString(1, v.getPlaca());
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

    @Override
    public List<VeiculoUsado> listIntoDB() {

        List<VeiculoUsado> veiculo = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            PreparedStatement stmt = con.prepareStatement("select nome, placa, motorizacao, cod_contrato from veiculo");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                VeiculoUsado vei = new VeiculoUsado();

                vei.setModelo(rs.getString("nome"));
                vei.setPlaca(rs.getString("placa"));
                vei.setMotorizacao(rs.getString("motorizacao"));
                veiculo.add(vei);

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

        return veiculo;
        
    }

    @Override
    public List<VeiculoUsado> searchIntoDB(String placa) {
        
        List<VeiculoUsado> veiculo = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            PreparedStatement stmt = con.prepareStatement("select placa, renavam, anofab, quilometragem, avariado, nome, motorizacao from veiculo where placa = ?");
            stmt.setString(1, placa);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                VeiculoUsado vei = new VeiculoUsado();

                vei.setPlaca(rs.getString("placa"));
                vei.setRenavam(rs.getLong("renavam"));
                vei.setAnoFab(rs.getString("anofab"));
                vei.setQuilometragem(rs.getLong("quilometragem"));
                vei.setAvariado(rs.getString("avariado"));
                vei.setModelo(rs.getString("nome"));
                vei.setMotorizacao(rs.getString("motorizacao"));
                veiculo.add(vei);
                
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

        return veiculo;
        
    }
    
}
