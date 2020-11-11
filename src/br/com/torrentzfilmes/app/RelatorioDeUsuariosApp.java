/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.torrentzfilmes.app;

import br.com.torrentzfilmes.bll.UsuarioBll;
import br.com.torrentzfilmes.model.Contrato;
import br.com.torrentzfilmes.model.Usuario;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author roger
 */
public class RelatorioDeUsuariosApp extends javax.swing.JDialog {
    
    UsuarioBll usuBll = new UsuarioBll();

    /**
     * Creates new form RelatorioDeUsuarios
     */
    public RelatorioDeUsuariosApp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void imprimirRelatorioDeUsuarios(List<Usuario> listaUsuarios) throws Exception {
        DefaultTableModel model = (DefaultTableModel) jTableRelatorioUsuarios.getModel();
        model.setNumRows(0);
        usuBll.ordenaListaUsuarioa(listaUsuarios);
        for (int pos = 0; pos < listaUsuarios.size(); pos++) {
            String[] linha = new String[8];
            Usuario usu = listaUsuarios.get(pos);
            linha[0] = usu.getId() + "";
            linha[1] = usu.getNome().toUpperCase();
            linha[2] = usu.getCpf();
            linha[3] = usu.getEmail();
            linha[4] = usu.getSenha();
            linha[5] = usu.getPercCupom() + " %";
            SimpleDateFormat dataCupom = new SimpleDateFormat("dd/MM/yyyy");
            linha[6] = dataCupom.format(usu.getDataCupom());
            linha[7] = usu.getPerfil().toString();
            model.addRow(linha);
        }
        jTextFieldQuantRegistros.setText(listaUsuarios.size() + "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRelatorioUsuarios = new javax.swing.JPanel();
        jButtonPesquisarUsuarios = new javax.swing.JButton();
        jTextFieldDigitarDadosParaPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorioUsuarios = new javax.swing.JTable();
        jButtonFecharRelatorio = new javax.swing.JButton();
        jButtonListarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldQuantRegistros = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Usuário e Clientes Torrentz Filmes");
        setResizable(false);

        jPanelRelatorioUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonPesquisarUsuarios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jButtonPesquisarUsuarios.setText("Pesquisar");
        jButtonPesquisarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarUsuariosActionPerformed(evt);
            }
        });

        jTableRelatorioUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Nome", "Cpf", "Email", "Senha", "Desc.", "Data do Cupom", "Perfil"
            }
        ));
        jScrollPane1.setViewportView(jTableRelatorioUsuarios);
        if (jTableRelatorioUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableRelatorioUsuarios.getColumnModel().getColumn(0).setMinWidth(50);
            jTableRelatorioUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableRelatorioUsuarios.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableRelatorioUsuarios.getColumnModel().getColumn(2).setMinWidth(90);
            jTableRelatorioUsuarios.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTableRelatorioUsuarios.getColumnModel().getColumn(2).setMaxWidth(90);
            jTableRelatorioUsuarios.getColumnModel().getColumn(3).setMinWidth(150);
            jTableRelatorioUsuarios.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTableRelatorioUsuarios.getColumnModel().getColumn(3).setMaxWidth(150);
            jTableRelatorioUsuarios.getColumnModel().getColumn(4).setMinWidth(60);
            jTableRelatorioUsuarios.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTableRelatorioUsuarios.getColumnModel().getColumn(4).setMaxWidth(60);
            jTableRelatorioUsuarios.getColumnModel().getColumn(5).setMinWidth(80);
            jTableRelatorioUsuarios.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTableRelatorioUsuarios.getColumnModel().getColumn(5).setMaxWidth(80);
            jTableRelatorioUsuarios.getColumnModel().getColumn(6).setMinWidth(80);
            jTableRelatorioUsuarios.getColumnModel().getColumn(6).setPreferredWidth(80);
            jTableRelatorioUsuarios.getColumnModel().getColumn(6).setMaxWidth(80);
            jTableRelatorioUsuarios.getColumnModel().getColumn(7).setMinWidth(110);
            jTableRelatorioUsuarios.getColumnModel().getColumn(7).setPreferredWidth(110);
            jTableRelatorioUsuarios.getColumnModel().getColumn(7).setMaxWidth(110);
        }

        jButtonFecharRelatorio.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jButtonFecharRelatorio.setText("Fechar");
        jButtonFecharRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharRelatorioActionPerformed(evt);
            }
        });

        jButtonListarUsuario.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jButtonListarUsuario.setText("Listar");
        jButtonListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel1.setText("Quant.Registros");

        javax.swing.GroupLayout jPanelRelatorioUsuariosLayout = new javax.swing.GroupLayout(jPanelRelatorioUsuarios);
        jPanelRelatorioUsuarios.setLayout(jPanelRelatorioUsuariosLayout);
        jPanelRelatorioUsuariosLayout.setHorizontalGroup(
            jPanelRelatorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatorioUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRelatorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                    .addGroup(jPanelRelatorioUsuariosLayout.createSequentialGroup()
                        .addComponent(jButtonPesquisarUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDigitarDadosParaPesquisa))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRelatorioUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonListarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFecharRelatorio)))
                .addContainerGap())
        );
        jPanelRelatorioUsuariosLayout.setVerticalGroup(
            jPanelRelatorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatorioUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRelatorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisarUsuarios)
                    .addComponent(jTextFieldDigitarDadosParaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelRelatorioUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFecharRelatorio)
                    .addComponent(jButtonListarUsuario)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldQuantRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRelatorioUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRelatorioUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarUsuariosActionPerformed
        // TODO add your handling code here:
        try {
            imprimirRelatorioDeUsuarios(usuBll.pesquisarUsuario(jTextFieldDigitarDadosParaPesquisa.getText()));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonPesquisarUsuariosActionPerformed

    private void jButtonListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarUsuarioActionPerformed
        // TODO add your handling code here:
        try {
            imprimirRelatorioDeUsuarios(usuBll.getConsultaUsuarios());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonListarUsuarioActionPerformed

    private void jButtonFecharRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharRelatorioActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonFecharRelatorioActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioDeUsuariosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioDeUsuariosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioDeUsuariosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioDeUsuariosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RelatorioDeUsuariosApp dialog = new RelatorioDeUsuariosApp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFecharRelatorio;
    private javax.swing.JButton jButtonListarUsuario;
    private javax.swing.JButton jButtonPesquisarUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelRelatorioUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRelatorioUsuarios;
    private javax.swing.JTextField jTextFieldDigitarDadosParaPesquisa;
    private javax.swing.JTextField jTextFieldQuantRegistros;
    // End of variables declaration//GEN-END:variables
}
