/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.*;
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
public class ContratoDAO {
    
    public boolean insertIntoDBPF (ContratoPF aluguel) {
        
        boolean check = false;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            
            PreparedStatement stmt = con.prepareStatement("insert into aluguel (placa, cpf, fim_contrato, cod_tipo, valor_contrato) values ((?),(?),(?),(?),(?))");
            stmt.setString(1, aluguel.getPlacaVei());
            stmt.setString(2, aluguel.getCPFouCNPJCli());
            stmt.setString(3, aluguel.getDataFimContrato());
            stmt.setInt(4, aluguel.getCod_tipoContrato());
            stmt.setString(5, aluguel.getValor_contrato()); 
            stmt.execute();
            
            stmt = con.prepareStatement("select cod_contrato from aluguel where cpf = ?");
            stmt.setString(1, aluguel.getCPFouCNPJCli());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                aluguel.setCodContrato(rs.getInt("cod_contrato"));
                
            }
            
            stmt = con.prepareStatement("update veiculo set cod_contrato = ? where placa = ?");
            stmt.setInt(1, aluguel.getCodContrato());
            stmt.setString(2, aluguel.getPlacaVei());
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
    
    public boolean insertIntoDBAPP (ContratoAPP aluguel) {
        
        boolean check = false;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");

            PreparedStatement stmt = con.prepareStatement("insert into aluguel (placa, cpf, fim_contrato, cod_tipo, valor_contrato) values ((?),(?),(?),(?),(?))");
            stmt.setString(1, aluguel.getPlacaVei());
            stmt.setString(2, aluguel.getCPFouCNPJCli());
            stmt.setString(3, aluguel.getDataFimContrato());
            stmt.setInt(4, aluguel.getCod_tipoContrato());
            stmt.setString(5, aluguel.getValor_contrato()); 
            stmt.execute();
            
            stmt = con.prepareStatement("select cod_contrato from aluguel where cpf = ?");
            stmt.setString(1, aluguel.getCPFouCNPJCli());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                aluguel.setCodContrato(rs.getInt("cod_contrato"));
                
            }
            
            stmt = con.prepareStatement("update veiculo set cod_contrato = ? where placa = ?");
            stmt.setInt(1, aluguel.getCodContrato());
            stmt.setString(2, aluguel.getPlacaVei());
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
    
    public boolean insertIntoDBPJ (ContratoPJ aluguel) {
        
        boolean check = false;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");

            PreparedStatement stmt = con.prepareStatement("insert into aluguel (placa, cpf, fim_contrato, cod_tipo, valor_contrato) values ((?),(?),(?),(?),(?))");
            stmt.setString(1, aluguel.getPlacaVei());
            stmt.setString(2, aluguel.getCPFouCNPJCli());
            stmt.setString(3, aluguel.getDataFimContrato());
            stmt.setInt(4, aluguel.getCod_tipoContrato());
            stmt.setString(5, aluguel.getValor_contrato()); 
            stmt.execute();
            
            stmt = con.prepareStatement("select cod_contrato from aluguel where cpf = ?");
            stmt.setString(1, aluguel.getCPFouCNPJCli());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                aluguel.setCodContrato(rs.getInt("cod_contrato"));
                
            }
            
            stmt = con.prepareStatement("update veiculo set cod_contrato = ? where placa = ?");
            stmt.setInt(1, aluguel.getCodContrato());
            stmt.setString(2, aluguel.getPlacaVei());
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
    
    public boolean alterIntoDBPF (ContratoPF aluguel) {
        
        boolean check = false;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            
            PreparedStatement stmt = con.prepareStatement("update aluguel set placa = ?, fim_contrato = ?, valor_contrato = ? where cod_contrato = ?");
            stmt.setString(1, aluguel.getPlacaVei());
            stmt.setString(2, aluguel.getDataFimContrato());
            stmt.setString(3, aluguel.getValor_contrato());
            stmt.setInt(4, aluguel.getCodContrato());
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
    
    public boolean alterIntoDBPJ(ContratoPJ aluguel) {
        
        boolean check = false;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            
            PreparedStatement stmt = con.prepareStatement("update aluguel set placa = ?, fim_contrato = ?, valor_contrato = ? where cod_contrato = ?");
            stmt.setString(1, aluguel.getPlacaVei());
            stmt.setString(2, aluguel.getDataFimContrato());
            stmt.setString(3, aluguel.getValor_contrato());
            stmt.setInt(4, aluguel.getCodContrato());
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
    
    public boolean alterIntoDBAPP(ContratoAPP aluguel) {
        
        boolean check = false;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            
            PreparedStatement stmt = con.prepareStatement("update aluguel set placa = ?, fim_contrato = ?, valor_contrato = ? where cod_contrato = ?");
            stmt.setString(1, aluguel.getPlacaVei());
            stmt.setString(2, aluguel.getDataFimContrato());
            stmt.setString(3, aluguel.getValor_contrato());
            stmt.setInt(4, aluguel.getCodContrato());
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
    
    public List<VeiculoUsado> returnPlaca(String motorizacao, String modelo) {
                
        List<VeiculoUsado> veiculo = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            PreparedStatement stmt = con.prepareStatement("select placa from veiculo where motorizacao = ? and nome = ? and cod_contrato is null");
            stmt.setString(1, motorizacao);
            stmt.setString(2, modelo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                VeiculoUsado vei = new VeiculoUsado();

                vei.setPlaca(rs.getString("placa"));
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

    public List<ContratoAPP> searchIntoDB(String cod) {
        
        List<ContratoAPP> lista = new ArrayList<>();
        ContratoAPP aluguel = new ContratoAPP();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            PreparedStatement stmt = con.prepareStatement("select * from aluguel where cod_contrato = ?");
            stmt.setString(1, cod);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                
                aluguel.setCodContrato(rs.getInt("cod_contrato"));
                aluguel.setPlacaVei(rs.getString("placa"));
                aluguel.setCPFouCNPJCli(rs.getString("cpf"));
                aluguel.setDataFimContrato(rs.getString("fim_contrato"));
                aluguel.setCod_tipoContrato(rs.getInt("cod_tipo"));
                aluguel.setValor_contrato(rs.getString("valor_contrato"));
                lista.add(aluguel);
                
                
            }
            
            stmt = con.prepareStatement("select nome from clientes where cpf = ?");
            stmt.setString(1, aluguel.getCPFouCNPJCli());
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Cliente cli = new Cliente();
                
                cli.setNomeCli(rs.getString("nome"));
                
            }
            
            stmt = con.prepareStatement("select nome, motorizacao from veiculo where placa = ?");
            stmt.setString(1, aluguel.getPlacaVei());
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Veiculo vei = new Veiculo();
                
                vei.setModelo(rs.getString("nome"));
                vei.setMotorizacao(rs.getString("motorizacao"));
                
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

        return lista;
    
    
    }
}