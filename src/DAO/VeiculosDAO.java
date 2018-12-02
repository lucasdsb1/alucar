/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Clientes;
import Classes.Veiculos;
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
public class VeiculosDAO {

    public List<Veiculos> listaVei() {

        List<Veiculos> veiculo = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alucar?serverTimezone=UTC", "root", "usbw");
            PreparedStatement stmt = con.prepareStatement("select nome, placa, motorizacao, cod_contrato from veiculo");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Veiculos vei = new Veiculos();

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

}
