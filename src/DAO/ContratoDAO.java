/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Contrato;
import Classes.ContratoAPP;
import Classes.ContratoPF;
import Classes.ContratoPJ;
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
public class ContratoDAO {

    public boolean insertIntoDB (Contrato aluguel) {
        
        boolean check = false;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");

            PreparedStatement stmt = con.prepareStatement("insert into aluguel (placa, cpf, fim_contrato) values ((?),(?),(?))");
            stmt.setString(1, aluguel.getPlacaVei());
            stmt.setString(2, aluguel.getCPFouCNPJCli());
            stmt.setString(3, aluguel.getDataFimContrato());

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
    
    public boolean insertIntoDBPF (ContratoPF aluguel) {
        
        boolean check = false;
        int cod_contrato = 0;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");

            PreparedStatement stmt = con.prepareStatement("update aluguel set cod_tipo = ?, valor_contrato = ? where placa = ?");
            stmt.setInt(1, aluguel.getCod_tipoContrato());
            stmt.setString(2, aluguel.getValor_contrato());
            stmt.setString(3, aluguel.getPlacaVei()); 
            stmt.execute();
            
            stmt = con.prepareStatement("select cod_contrato from aluguel where cpf = ?");
            stmt.setString(1, aluguel.getCPFouCNPJCli());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                cod_contrato = rs.getInt("cod_contrato");
                
            }
            
            stmt = con.prepareStatement("update veiculo set cod_contrato = ? where placa = ?");
            stmt.setInt(1, cod_contrato);
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
        int cod_contrato = 0;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");

            PreparedStatement stmt = con.prepareStatement("update aluguel set cod_tipo = ?, valor_contrato = ? where placa = ?");
            stmt.setInt(1, aluguel.getCod_tipoContrato());
            stmt.setString(2, aluguel.getValor_contrato());
            stmt.setString(3, aluguel.getPlacaVei());
            stmt.execute();
            
            stmt = con.prepareStatement("select cod_contrato from aluguel where cpf = ?");
            stmt.setString(1, aluguel.getCPFouCNPJCli());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                cod_contrato = rs.getInt("cod_contrato");
                
            }
            
            stmt = con.prepareStatement("update veiculo set cod_contrato = ? where placa = ?");
            stmt.setInt(1, cod_contrato);
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
        int cod_contrato = 0;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");

            PreparedStatement stmt = con.prepareStatement("update aluguel set cod_tipo = ?, valor_contrato = ? where placa = ?");
            stmt.setInt(1, aluguel.getCod_tipoContrato());
            stmt.setString(2, aluguel.getValor_contrato());
            stmt.setString(3, aluguel.getPlacaVei());
            stmt.execute();
            
            stmt = con.prepareStatement("select cod_contrato from aluguel where cpf = ?");
            stmt.setString(1, aluguel.getCPFouCNPJCli());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                cod_contrato = rs.getInt("cod_contrato");
                
            }
            
            stmt = con.prepareStatement("update veiculo set cod_contrato = ? where placa = ?");
            stmt.setInt(1, cod_contrato);
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
    

    public boolean alterIntoDB(Contrato aluguel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean deleteFromDB(Contrato aluguel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Contrato> listIntoDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Contrato> searchIntoDB(String T) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    
}
