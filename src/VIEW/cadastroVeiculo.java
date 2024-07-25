package VIEW;

import DAO.ConexaoDAO;
import DAO.cadastroVeiculoDAO;
import DTO.cadastroClienteDTO;
import DTO.cadastroVeiculoDTO;
import VIEW.cadastroUsuario;
import VIEW.cadastroCliente;
import VIEW.atualizacaoVeiculo;
import VIEW.atualizacaoUsuario;
import VIEW.atualizacaoCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Arizio
 */
public class cadastroVeiculo extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    /**
     * Creates new form cadastroVeiculo
     */
    public cadastroVeiculo() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cliente = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JFormattedTextField();
        txtAno = new javax.swing.JFormattedTextField();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        btnCadastrarVeiculo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbxClientelist = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnCadastro = new javax.swing.JMenu();
        MnCadastroCliente = new javax.swing.JMenuItem();
        MnCadastroVeiculo = new javax.swing.JMenuItem();
        MnCadastroUsuario = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        MnRelatorioCliente = new javax.swing.JMenuItem();
        MnRelatorioVeiculo = new javax.swing.JMenuItem();
        MnRelatorioUsuario = new javax.swing.JMenuItem();
        MenuAtualizar = new javax.swing.JMenu();
        MnAtualizarCliente = new javax.swing.JMenuItem();
        MnAtualizarVeiculo = new javax.swing.JMenuItem();
        MnAtualizarUsuario = new javax.swing.JMenuItem();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro Veículo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Placa:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ano:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Modelo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Marca:");

        Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cliente.setText("CPF");

        try {
            txtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-#U##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        btnCadastrarVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadastrarVeiculo.setText("Cadastrar");
        btnCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbxClientelist.setEditable(true);
        cbxClientelist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxClientelist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClientelistActionPerformed(evt);
            }
        });

        MnCadastro.setText("Cadastro");

        MnCadastroCliente.setText("Cliente");
        MnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCadastroClienteActionPerformed(evt);
            }
        });
        MnCadastro.add(MnCadastroCliente);

        MnCadastroVeiculo.setText("Veículo");
        MnCadastroVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCadastroVeiculoActionPerformed(evt);
            }
        });
        MnCadastro.add(MnCadastroVeiculo);

        MnCadastroUsuario.setText("Usuário");
        MnCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCadastroUsuarioActionPerformed(evt);
            }
        });
        MnCadastro.add(MnCadastroUsuario);

        jMenuBar1.add(MnCadastro);

        MenuRelatorio.setText("Relatório");

        MnRelatorioCliente.setText("Cliente");
        MnRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRelatorioClienteActionPerformed(evt);
            }
        });
        MenuRelatorio.add(MnRelatorioCliente);

        MnRelatorioVeiculo.setText("Veículo");
        MnRelatorioVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRelatorioVeiculoActionPerformed(evt);
            }
        });
        MenuRelatorio.add(MnRelatorioVeiculo);

        MnRelatorioUsuario.setText("Usuário");
        MnRelatorioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRelatorioUsuarioActionPerformed(evt);
            }
        });
        MenuRelatorio.add(MnRelatorioUsuario);

        jMenuBar1.add(MenuRelatorio);

        MenuAtualizar.setText("Atualizar");

        MnAtualizarCliente.setText("Cliente");
        MnAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAtualizarClienteActionPerformed(evt);
            }
        });
        MenuAtualizar.add(MnAtualizarCliente);

        MnAtualizarVeiculo.setText("Veículo");
        MnAtualizarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAtualizarVeiculoActionPerformed(evt);
            }
        });
        MenuAtualizar.add(MnAtualizarVeiculo);

        MnAtualizarUsuario.setText("Usuário");
        MnAtualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAtualizarUsuarioActionPerformed(evt);
            }
        });
        MenuAtualizar.add(MnAtualizarUsuario);

        jMenuBar1.add(MenuAtualizar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btnCadastrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxClientelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente)
                    .addComponent(cbxClientelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(btnCadastrarVeiculo))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCadastroClienteActionPerformed
        // Botão do menu para ir a tela cadastroCliente
        cadastroCliente cdCliente = new cadastroCliente();
        this.dispose();
        cdCliente.setVisible(true);
    }//GEN-LAST:event_MnCadastroClienteActionPerformed

    private void MnCadastroVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCadastroVeiculoActionPerformed
        // Botão do menu para ir a tela cadastroVeiculo
        cadastroVeiculo cdVeiculo = new cadastroVeiculo();
        this.dispose();
        cdVeiculo.setVisible(true);
    }//GEN-LAST:event_MnCadastroVeiculoActionPerformed

    private void MnCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCadastroUsuarioActionPerformed
        // Botão do menu para ir a tela cadastroUsuario
        cadastroUsuario cdUsuario = new cadastroUsuario();
        this.dispose();
        cdUsuario.setVisible(true);
    }//GEN-LAST:event_MnCadastroUsuarioActionPerformed

    private void MnRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRelatorioClienteActionPerformed
        // Botão do menu para ir a tela relatorioCliente
        GerenciarCliente rlCliente = new GerenciarCliente();
        this.dispose();
        rlCliente.setVisible(true);
    }//GEN-LAST:event_MnRelatorioClienteActionPerformed

    private void MnRelatorioVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRelatorioVeiculoActionPerformed
        // Botão do menu para ir a tela relatorioVeiculo
        GerenciarVeiculo rlVeiculo = new GerenciarVeiculo();
        this.dispose();
        rlVeiculo.setVisible(true);
    }//GEN-LAST:event_MnRelatorioVeiculoActionPerformed

    private void MnRelatorioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRelatorioUsuarioActionPerformed
        // Botão do menu para ir a tela relatorioUsuario
        GerenciarUsuario rlUsuario = new GerenciarUsuario();
        this.dispose();
        rlUsuario.setVisible(true);
    }//GEN-LAST:event_MnRelatorioUsuarioActionPerformed

    private void MnAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAtualizarClienteActionPerformed
        // Botão do menu para ir a tela atualizarCliente
        atualizacaoCliente atCliente = new atualizacaoCliente();
        this.dispose();
        atCliente.setVisible(true);
    }//GEN-LAST:event_MnAtualizarClienteActionPerformed

    private void MnAtualizarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAtualizarVeiculoActionPerformed
        // Botão do menu para ir a tela atualizarVeiculo
        atualizacaoVeiculo atVeiculo = new atualizacaoVeiculo();
        this.dispose();
        atVeiculo.setVisible(true);
    }//GEN-LAST:event_MnAtualizarVeiculoActionPerformed

    private void MnAtualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAtualizarUsuarioActionPerformed
        // Botão do menu para ir a tela atualizarUsuario
        atualizacaoUsuario atUsuario = new atualizacaoUsuario();
        this.dispose();
        atUsuario.setVisible(true);
    }//GEN-LAST:event_MnAtualizarUsuarioActionPerformed

    private void btnCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVeiculoActionPerformed
        // Chamando o método cadastraVeiculo
        cadastraVeiculo();

        //Chamando o método para limpar a tela
        limparCampos();

    }//GEN-LAST:event_btnCadastrarVeiculoActionPerformed

    private void cbxClientelistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClientelistActionPerformed
        // TODO add your handling code here:
        listarClienteCBX();
    }//GEN-LAST:event_cbxClientelistActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cliente;
    private javax.swing.JMenu MenuAtualizar;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenuItem MnAtualizarCliente;
    private javax.swing.JMenuItem MnAtualizarUsuario;
    private javax.swing.JMenuItem MnAtualizarVeiculo;
    private javax.swing.JMenu MnCadastro;
    private javax.swing.JMenuItem MnCadastroCliente;
    private javax.swing.JMenuItem MnCadastroUsuario;
    private javax.swing.JMenuItem MnCadastroVeiculo;
    private javax.swing.JMenuItem MnRelatorioCliente;
    private javax.swing.JMenuItem MnRelatorioUsuario;
    private javax.swing.JMenuItem MnRelatorioVeiculo;
    private javax.swing.JButton btnCadastrarVeiculo;
    private javax.swing.JComboBox<String> cbxClientelist;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JFormattedTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    //Método para cadastrar Veiculos
    private void cadastraVeiculo() {
        String Placa, Modelo, Marca, Ano, idCPF;

        Placa = txtPlaca.getText().toUpperCase();
        Modelo = txtModelo.getText().toUpperCase();
        Marca = txtMarca.getText().toUpperCase();
        Ano = txtAno.getText();
        idCPF = cbxClientelist.getSelectedItem().toString();

        cadastroVeiculoDTO objCadastroVeiculo = new cadastroVeiculoDTO();

        objCadastroVeiculo.setPlaca(Placa);
        objCadastroVeiculo.setModelo(Modelo);
        objCadastroVeiculo.setMarca(Marca);
        objCadastroVeiculo.setAno(Ano);
        objCadastroVeiculo.setIdCPF(idCPF);

        cadastroVeiculoDAO objCadastroVeiculoDAO = new cadastroVeiculoDAO();
        objCadastroVeiculoDAO.cadastrarVeiculo(objCadastroVeiculo);

        JOptionPane.showMessageDialog(null, "Cadastro Feito com sucesso");
    }

    //Método para listar os clientes que ja estão cadastrados para porder cadastrar o seu veiculo em seus nomes
    public void listarClienteCBX() {

        conn = new ConexaoDAO().conectaBD();
        String sql = "SELECT Nome from cadastroCliente ORDER BY Nome;";

        try {
            String Nome;

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarClienteCBX cadastroVeiculoDAO" + erro.getMessage());          
        }
    }

    // Método para limpara os campos após o cadastro
    private void limparCampos() {
        txtPlaca.setText("");
        txtAno.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        cbxClientelist.setSelectedItem("");
    }

}
