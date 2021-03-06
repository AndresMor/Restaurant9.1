/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Controlador;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sony
 */
public class StockView extends javax.swing.JFrame {
    Controlador controlador;
    /**
     * Creates new form StockView
     */
    public StockView() {
        controlador = new Controlador();
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

        agregarProductoView = new javax.swing.JFrame();
        TipoCombox = new javax.swing.JComboBox<>();
        TxtConfig = new javax.swing.JTextField();
        CantSpinner = new javax.swing.JSpinner();
        BtnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        BtnSend = new javax.swing.JButton();
        agregarPlatoView = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        botonesPanel = new javax.swing.JPanel();
        priceTxt = new javax.swing.JTextField();
        platoName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCrearPlato = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        TipoCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrediente", "Postre", "Bebida" }));
        TipoCombox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TipoComboxMouseClicked(evt);
            }
        });
        TipoCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoComboxActionPerformed(evt);
            }
        });

        CantSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        BtnAdd.setText("Agregar");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Nombre", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        BtnSend.setText("Finalizar");
        BtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregarProductoViewLayout = new javax.swing.GroupLayout(agregarProductoView.getContentPane());
        agregarProductoView.getContentPane().setLayout(agregarProductoViewLayout);
        agregarProductoViewLayout.setHorizontalGroup(
            agregarProductoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregarProductoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(agregarProductoViewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, agregarProductoViewLayout.createSequentialGroup()
                        .addComponent(TipoCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(CantSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BtnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        agregarProductoViewLayout.setVerticalGroup(
            agregarProductoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductoViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregarProductoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonesPanel.setLayout(new java.awt.GridLayout(0, 3));

        platoName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                platoNameMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel6.setText("Creación de Platos");

        btnCrearPlato.setText("Crear Plato");
        btnCrearPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlatoActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio:");

        jLabel8.setText("Nombre:");

        javax.swing.GroupLayout agregarPlatoViewLayout = new javax.swing.GroupLayout(agregarPlatoView.getContentPane());
        agregarPlatoView.getContentPane().setLayout(agregarPlatoViewLayout);
        agregarPlatoViewLayout.setHorizontalGroup(
            agregarPlatoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarPlatoViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregarPlatoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarPlatoViewLayout.createSequentialGroup()
                        .addComponent(btnCrearPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(agregarPlatoViewLayout.createSequentialGroup()
                        .addGroup(agregarPlatoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(agregarPlatoViewLayout.createSequentialGroup()
                                .addGroup(agregarPlatoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(agregarPlatoViewLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(11, 11, 11))
                                    .addComponent(jLabel8))
                                .addGap(52, 52, 52)
                                .addGroup(agregarPlatoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceTxt)
                                    .addComponent(platoName)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(botonesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        agregarPlatoViewLayout.setVerticalGroup(
            agregarPlatoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarPlatoViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(agregarPlatoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarPlatoViewLayout.createSequentialGroup()
                        .addComponent(platoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(agregarPlatoViewLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarPlatoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPlato)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        jLabel1.setText("  Nuevo Producto");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jLabel2.setText("  Eliminar Producto  ");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contract.png"))); // NOI18N
        jLabel3.setText("     Ver Registro");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        jLabel4.setText("  Agregar Plato");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jLabel5.setText("  Eliminar Plato");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        agregarProductoView.setVisible(true);
        agregarProductoView.setSize(400, 400);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void TipoComboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipoComboxMouseClicked

    }//GEN-LAST:event_TipoComboxMouseClicked

    private void TipoComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoComboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoComboxActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        int price = 0;
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        Object [] Filas = new Object[4];
        String m = String.valueOf(TipoCombox.getSelectedItem());
        String n = TxtConfig.getText();
        String l = CantSpinner.getValue().toString();
        Filas[0] = m;
        Filas[1] = n;
        Filas[2] = l;
        if (m.equals("Bebida") || m.equals("Postre")) {
            price = Integer.parseInt(JOptionPane.showInputDialog("Precio "));
        }
        Filas[3] = price;
        model.addRow(Filas);
        Table.setModel(model);
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSendActionPerformed
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int rows = Table.getRowCount();
        for (int i = 0; i < rows; i++) {    
            controlador.nuevoProducto(Table, i);           
        }        
        for (int i = 0; i < rows; i++) {
            model.removeRow(0);
        }
            controlador.setFtGeneralView(false);
        
        
    }//GEN-LAST:event_BtnSendActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        agregarPlatoView.setVisible(true);
        controlador.agregarBotonesPĺatoView(botonesPanel);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        this.dispose();
//        General g = new General();
//        g.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void platoNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_platoNameMouseClicked
//        info.setText("");
    }//GEN-LAST:event_platoNameMouseClicked

    private void btnCrearPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlatoActionPerformed
        String name = platoName.getText();
        String price = priceTxt.getText();
        controlador.nuevoPlato(botonesPanel,name,price);
//        if (!name.equals("")) {
//            int price = Integer.parseInt(pricetxt.getText());
//            int x = panel.getComponentCount();
//            for (int i = 0; i < LBotones.size(); i++) {
//                if (LBotones.get(i).isSelected()) {
//                    controlador.AgregarLista(LBotones.get(i).getName());
//                }
//            }
//            controlador.CrearArchivoPlatos(name, price);
//            panel.getComponents();
//            info.setText("Plato creado!");
//            PlatoName.setText("");
//            pricetxt.setText("");
//        }else{
//            info.setText("[Nombre Obligatorio]");
//        }

    }//GEN-LAST:event_btnCrearPlatoActionPerformed

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
            java.util.logging.Logger.getLogger(StockView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnSend;
    private javax.swing.JSpinner CantSpinner;
    private javax.swing.JTable Table;
    private javax.swing.JComboBox<String> TipoCombox;
    private javax.swing.JTextField TxtConfig;
    private javax.swing.JFrame agregarPlatoView;
    private javax.swing.JFrame agregarProductoView;
    private javax.swing.JPanel botonesPanel;
    private javax.swing.JButton btnCrearPlato;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField platoName;
    private javax.swing.JTextField priceTxt;
    // End of variables declaration//GEN-END:variables
}
