/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classes.Veiculos;
import DAO.VeiculosDAO;
import java.awt.Dimension;
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
        txtRenavam = new javax.swing.JFormattedTextField();
        lblModelo = new javax.swing.JLabel();
        cmbModelo = new javax.swing.JComboBox<>();
        lblMotorizacao = new javax.swing.JLabel();
        cmbMotorizacao = new javax.swing.JComboBox<>();
        lblAvariado = new javax.swing.JLabel();
        cmbAvariado = new javax.swing.JComboBox<>();
        lblQuilometragem = new javax.swing.JLabel();
        txtQuilometragem = new javax.swing.JFormattedTextField();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtContrato = new javax.swing.JFormattedTextField();
        lblContrato = new javax.swing.JLabel();
        tabListaVeiculo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaVeiculos = new javax.swing.JTable();

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

        lblRenavam.setText(" Renavam:");

        try {
            txtRenavam.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblModelo.setText(" Modelo:");
        lblModelo.setToolTipText("");

        cmbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Palio", "Sandero", "Uno", "Argo", "Onix", "Virtus", "Gol", "Fluence", "Captur" }));

        lblMotorizacao.setText(" Motorização:");

        cmbMotorizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "1.0", "1.4", "1.6", "1.8", "2.0" }));

        lblAvariado.setText(" Está avariado?");

        cmbAvariado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Sim", "Não" }));

        lblQuilometragem.setText(" Quilometragem:");

        try {
            txtQuilometragem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblAno.setText(" Ano de fabricação:");

        try {
            txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\l_dsb\\OneDrive\\Documentos\\NetBeansProjects\\Alucar\\Images\\oie_transparent.png")); // NOI18N

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar Campos");
        btnLimpar.setToolTipText("");

        btnExcluir.setText("Excluir");

        btnAtualizar.setText("Atualizar");

        btnCadastrar.setText("Cadastrar");

        try {
            txtContrato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblContrato.setText(" Código de contrato:");

        javax.swing.GroupLayout tabVeiculoLayout = new javax.swing.GroupLayout(tabVeiculo);
        tabVeiculo.setLayout(tabVeiculoLayout);
        tabVeiculoLayout.setHorizontalGroup(
            tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtQuilometragem)
                                .addComponent(lblPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPlaca)
                                .addComponent(lblRenavam, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRenavam, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                            .addComponent(lblQuilometragem))
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
                                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtContrato, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContrato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAvariado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuilometragem)
                    .addComponent(lblContrato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(tabVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        lblPlaca.getAccessibleContext().setAccessibleName(" Placa:");

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
        jScrollPane1.setViewportView(tableListaVeiculos);

        javax.swing.GroupLayout tabListaVeiculoLayout = new javax.swing.GroupLayout(tabListaVeiculo);
        tabListaVeiculo.setLayout(tabListaVeiculoLayout);
        tabListaVeiculoLayout.setHorizontalGroup(
            tabListaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        tabListaVeiculoLayout.setVerticalGroup(
            tabListaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabListaVeiculoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscarPlaca;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbAvariado;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JComboBox<String> cmbMotorizacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAvariado;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotorizacao;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblQuilometragem;
    private javax.swing.JLabel lblRenavam;
    private javax.swing.JPanel tabListaVeiculo;
    private javax.swing.JPanel tabVeiculo;
    private javax.swing.JTable tableListaVeiculos;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JFormattedTextField txtContrato;
    private javax.swing.JFormattedTextField txtPlaca;
    private javax.swing.JFormattedTextField txtQuilometragem;
    private javax.swing.JFormattedTextField txtRenavam;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {

        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

    }
    
    public void readListaVei() {

        DefaultTableModel modelo = (DefaultTableModel) tableListaVeiculos.getModel();
        modelo.setNumRows(0);
        VeiculosDAO vdao = new VeiculosDAO();

        for (Veiculos v : vdao.listaVei()) {

            modelo.addRow(new Object[]{
                v.getModelo(),
                v.getPlaca(),
                v.getMotorizacao(),});

        }

    }
        
}
