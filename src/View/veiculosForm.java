/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classes.VeiculoUsado;
import Classes.Veiculo;
import DAO.VeiculoDAO;
import java.awt.Dimension;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l_dsb
 */
public class veiculosForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form veiculosForm
     */
    public veiculosForm() {
        initComponents();
        readListaVei();
        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oie_401942oYTgxgbD.png")));
    }
    
    public static boolean instanciaVeiculo = false;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabVeiculo = new javax.swing.JPanel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JFormattedTextField();
        btnBuscarPlaca = new javax.swing.JButton();
        lblRenavam = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        cmbModelo = new javax.swing.JComboBox<>();
        lblMotorizacao = new javax.swing.JLabel();
        cmbMotorizacao = new javax.swing.JComboBox<>();
        lblAvariado = new javax.swing.JLabel();
        cmbAvariado = new javax.swing.JComboBox<>();
        lblQuilometragem = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JFormattedTextField();
        lblFoto = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblContrato = new javax.swing.JLabel();
        txtRenavam = new javax.swing.JTextField();
        txtQuilometragem = new javax.swing.JTextField();
        txtContrato = new javax.swing.JTextField();
        tabListaVeiculo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaVeiculos = new javax.swing.JTable();
        txtBuscaPlaca = new javax.swing.JLabel();
        lblDica = new javax.swing.JLabel();
        btnBuscarLista = new javax.swing.JButton();
        btnAtualizarLista = new javax.swing.JButton();
        txtBuscar = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Veículos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblPlaca.setText(" Placa:");

        try {
            txtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnBuscarPlaca.setText("Buscar Placa");
        btnBuscarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPlacaActionPerformed(evt);
            }
        });

        lblRenavam.setText(" Renavam:");

        lblModelo.setText(" Modelo:");
        lblModelo.setToolTipText("");

        cmbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Palio", "Sandero", "Uno", "Argo", "Onix", "Virtus", "Gol", "Fluence", "Captur" }));
        cmbModelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbModeloItemStateChanged(evt);
            }
        });

        lblMotorizacao.setText(" Motorização:");

        cmbMotorizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "1.0", "1.4", "1.6", "1.8", "2.0" }));

        lblAvariado.setText(" Está avariado?");

        cmbAvariado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Sim", "Não" }));

        lblQuilometragem.setText(" Quilometragem:");

        lblAno.setText(" Ano de fabricação:");

        try {
            txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\l_dsb\\OneDrive\\Documentos\\NetBeansProjects\\Alucar\\Images\\oie_transparent.png")); // NOI18N

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar Campos");
        btnLimpar.setToolTipText("");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblContrato.setText(" Código de contrato:");

        txtContrato.setEditable(false);

        javax.swing.GroupLayout tabVeiculoLayout = new javax.swing.GroupLayout(tabVeiculo);
        tabVeiculo.setLayout(tabVeiculoLayout);
        tabVeiculoLayout.setHorizontalGroup(
            tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabVeiculoLayout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar))
                    .addGroup(tabVeiculoLayout.createSequentialGroup()
                        .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPlaca)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(lblRenavam)
                            .addComponent(lblQuilometragem)
                            .addComponent(txtRenavam)
                            .addComponent(txtQuilometragem))
                        .addGap(28, 28, 28)
                        .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabVeiculoLayout.createSequentialGroup()
                                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblModelo)
                                    .addComponent(cmbModelo, 0, 95, Short.MAX_VALUE)
                                    .addComponent(lblAvariado)
                                    .addComponent(cmbAvariado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAno)
                                    .addGroup(tabVeiculoLayout.createSequentialGroup()
                                        .addComponent(lblMotorizacao)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cmbMotorizacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(tabVeiculoLayout.createSequentialGroup()
                                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtContrato))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        tabVeiculoLayout.setVerticalGroup(
            tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscarPlaca)
                .addGap(18, 18, 18)
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(lblModelo)
                    .addComponent(lblMotorizacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMotorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRenavam)
                    .addComponent(lblAvariado)
                    .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAvariado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuilometragem)
                    .addComponent(lblContrato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gerencia de veículos", tabVeiculo);

        tableListaVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Placa", "Motorização", "Contrato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListaVeiculos.setToolTipText("");
        tableListaVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListaVeiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListaVeiculos);

        txtBuscaPlaca.setText(" Buscar pela PLACA:");

        lblDica.setText(" Dica: Um clique exibe a PLACA, dois cliques exibe os dados completos.");

        btnBuscarLista.setText("Buscar");
        btnBuscarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarListaActionPerformed(evt);
            }
        });

        btnAtualizarLista.setText("Atualizar Lista");
        btnAtualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarListaActionPerformed(evt);
            }
        });

        try {
            txtBuscar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout tabListaVeiculoLayout = new javax.swing.GroupLayout(tabListaVeiculo);
        tabListaVeiculo.setLayout(tabListaVeiculoLayout);
        tabListaVeiculoLayout.setHorizontalGroup(
            tabListaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
            .addGroup(tabListaVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabListaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabListaVeiculoLayout.createSequentialGroup()
                        .addComponent(lblDica)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tabListaVeiculoLayout.createSequentialGroup()
                        .addGroup(tabListaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscaPlaca)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabListaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        tabListaVeiculoLayout.setVerticalGroup(
            tabListaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabListaVeiculoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(tabListaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaPlaca)
                    .addComponent(btnAtualizarLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabListaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarLista)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(lblDica))
        );

        jTabbedPane1.addTab("Lista de veículos", tabListaVeiculo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Lista de veículos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        
        instanciaVeiculo = false;
        
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        VeiculoDAO dao = new VeiculoDAO();
        VeiculoUsado vu = new VeiculoUsado();

        if (txtPlaca.getText().isEmpty() || txtRenavam.getText().isEmpty() || txtAno.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Os campos 'Placa', 'Renavam' e 'Ano de fabricação' são obrigatórios!");

        } else {

            vu.setPlaca(txtPlaca.getText());

            if (!cmbModelo.getSelectedItem().equals("Selecione:")) {

                vu.setModelo(cmbModelo.getSelectedItem().toString());

            }

            vu.setRenavam(Long.parseLong(txtRenavam.getText()));

            if (!cmbMotorizacao.getSelectedItem().equals("Selecione:")) {

                vu.setMotorizacao(cmbMotorizacao.getSelectedItem().toString());

            }

            vu.setAnoFab(txtAno.getText());

            if (!cmbAvariado.getSelectedItem().equals("Selecione:")) {

                vu.setAvariado(cmbAvariado.getSelectedItem().toString());

            }

            if (!txtQuilometragem.getText().equals("")) {

                vu.setQuilometragem(Long.parseLong(txtQuilometragem.getText()));

            }
            
            if (dao.insertIntoDB(vu) == true) {

                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

            }

        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        limparcampos();
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnBuscarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPlacaActionPerformed
        
        String Placa = JOptionPane.showInputDialog("Digite a PLACA que deseja buscar: ");

        recebeBuscaVei(Placa);

        if (!txtPlaca.getText().isEmpty()) {

            btnExcluir.setEnabled(true);
            btnAtualizar.setEnabled(true);
            btnCadastrar.setEnabled(false);
            txtPlaca.setEnabled(false);
            txtRenavam.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_btnBuscarPlacaActionPerformed

    private void btnAtualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarListaActionPerformed
        
        readListaVei();
        
    }//GEN-LAST:event_btnAtualizarListaActionPerformed

    private void btnBuscarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarListaActionPerformed
        
        DefaultTableModel modelo = (DefaultTableModel) tableListaVeiculos.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {

            if (txtBuscar.getText().equals(modelo.getValueAt(i, 1))) {

                tableListaVeiculos.setRowSelectionInterval(i, i);

            }

        }
        
    }//GEN-LAST:event_btnBuscarListaActionPerformed

    private void tableListaVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListaVeiculosMouseClicked
        
        DefaultTableModel modelo = (DefaultTableModel) tableListaVeiculos.getModel();
        String line = modelo.getValueAt(tableListaVeiculos.getSelectedRow(), 1).toString();

        if (evt.getClickCount() == 2) {

            recebeBuscaVei(line);
            jTabbedPane1.setSelectedIndex(0);
            btnExcluir.setEnabled(true);
            btnAtualizar.setEnabled(true);
            btnCadastrar.setEnabled(false);
            txtPlaca.setEnabled(false);
            txtRenavam.setEnabled(false);

        } else if (evt.getClickCount() == 1) {

            txtBuscar.setText(line);

        }
        
    }//GEN-LAST:event_tableListaVeiculosMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        VeiculoUsado v = new VeiculoUsado();
        VeiculoDAO dao = new VeiculoDAO();

        int choice = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Exclusão", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {

            v.setPlaca(txtPlaca.getText());

            if (dao.deleteFromDB(v)) {

                JOptionPane.showMessageDialog(null, "Veículo excluido com sucesso!");

            }

            limparcampos();
        
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        VeiculoDAO dao = new VeiculoDAO();
        VeiculoUsado vu = new VeiculoUsado();


        int choice = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar?", "Alteração", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {

            vu.setPlaca(txtPlaca.getText());
            vu.setAnoFab(txtAno.getText());
            vu.setQuilometragem(Long.parseLong(txtQuilometragem.getText()));
            vu.setAvariado(cmbAvariado.getSelectedItem().toString());
            vu.setMotorizacao(cmbMotorizacao.getSelectedItem().toString());
            vu.setModelo(cmbModelo.getSelectedItem().toString());

            if (dao.alterIntoDB(vu) == true) {
                
                JOptionPane.showMessageDialog(null, "Veículo atualizado com sucesso!");

            }
            
        }
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void cmbModeloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbModeloItemStateChanged
        
        if (cmbModelo.getSelectedItem().equals("Selecione:")) {
            
            lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oie_401942oYTgxgbD.png")));
            
        } else if (cmbModelo.getSelectedItem().equals("Palio")) {
            
            lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oie_transparent.png")));
            
        } else if (cmbModelo.getSelectedItem().equals("Sandero")) {
            
            lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oie_3l5CglDkS0i8.png")));
            
        } else if (cmbModelo.getSelectedItem().equals("Uno")) {
            
            lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oie_rW2hF85Ww0Og.png")));
            
        } else if (cmbModelo.getSelectedItem().equals("Argo")) {
            
            lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oie_transparent (1).png")));
            
        } else if (cmbModelo.getSelectedItem().equals("Onix")) {
            
            lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oie_19ytcHrrWbLX.png")));
            
        } else if (cmbModelo.getSelectedItem().equals("Virtus")) {
            
            lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oie_vW4d9KAg1hBQ.png")));
            
        } else if (cmbModelo.getSelectedItem().equals("Gol")) {
            
            lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oie_1FTFRgOTVAMe.png")));
            
        } else if (cmbModelo.getSelectedItem().equals("Fluence")) {
            
            lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fluence.png")));
            
        } else if (cmbModelo.getSelectedItem().equals("Captur")) {
            
            lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oie_crGBzVLUhnyU.png")));
            
        }
    }//GEN-LAST:event_cmbModeloItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnAtualizarLista;
    private javax.swing.JButton btnBuscarLista;
    private javax.swing.JButton btnBuscarPlaca;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbAvariado;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JComboBox<String> cmbMotorizacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAvariado;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblDica;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotorizacao;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblQuilometragem;
    private javax.swing.JLabel lblRenavam;
    private javax.swing.JPanel tabListaVeiculo;
    private javax.swing.JPanel tabVeiculo;
    private javax.swing.JTable tableListaVeiculos;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JLabel txtBuscaPlaca;
    private javax.swing.JFormattedTextField txtBuscar;
    private javax.swing.JTextField txtContrato;
    private javax.swing.JFormattedTextField txtPlaca;
    private javax.swing.JTextField txtQuilometragem;
    private javax.swing.JTextField txtRenavam;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {

        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

    }
    
    public void readListaVei() {

        DefaultTableModel modelo = (DefaultTableModel) tableListaVeiculos.getModel();
        modelo.setNumRows(0);
        VeiculoDAO dao = new VeiculoDAO();

        for (Veiculo v : dao.listIntoDB()) {

            modelo.addRow(new Object[]{
                v.getModelo(),
                v.getPlaca(),
                v.getMotorizacao(),
                v.getCod_contrato()});

        }

    }
    
    public void recebeBuscaVei(String Placa) {

        VeiculoDAO dao = new VeiculoDAO();


        for (VeiculoUsado v : dao.searchIntoDB(Placa)) {

            txtPlaca.setText(v.getPlaca());
            txtRenavam.setText(Long.toString(v.getRenavam()));
            txtAno.setText(v.getAnoFab());
            txtQuilometragem.setText(Long.toString(v.getQuilometragem()));
            cmbMotorizacao.setSelectedItem(v.getMotorizacao());
            cmbAvariado.setSelectedItem(v.getAvariado());
            cmbModelo.setSelectedItem(v.getModelo());
            txtContrato.setText(Integer.toString(v.getCod_contrato()));

        }

    }
    
    public void limparcampos () {
        
        txtPlaca.setText(null);
        txtRenavam.setText(null);
        txtAno.setText(null);
        txtQuilometragem.setText(null);
        txtContrato.setText(null);
        cmbMotorizacao.setSelectedItem("Selecione:");
        cmbModelo.setSelectedItem("Selecione:");
        btnExcluir.setEnabled(false);
        btnAtualizar.setEnabled(false);
        btnCadastrar.setEnabled(true);
        txtPlaca.setEnabled(true);
        txtRenavam.setEnabled(true);
        
    }
        
}
