
package packgraphicbillet;


public class GraphicBillet extends javax.swing.JFrame {

   
    public GraphicBillet() {
        initComponents();
    }
    private void nouveau(){
        txtnum.setText("");
        txtdate.setText(null);
        txtprix.setText(null);
        txtdes.setSelectedItem(null);
        txtnum.requestFocus();
        
    }
   private float calcule(String des){
          float p = 0.00f;
        if(des.compareTo("Paris")==0)
            p=650.00f;
        else if(des.compareTo("Madrid")==0)
            p=800.00f;
        else if(des.compareTo("London")==0)
            p=950.00f;
        return p;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        txtnum = new javax.swing.JTextField();
        txtprix = new javax.swing.JTextField();
        txtdes = new javax.swing.JComboBox<>();
        btnNouvu = new javax.swing.JButton();
        btnFerm = new javax.swing.JButton();
        btncalcul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setText("Gestion des billets de transport");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setText("Date de billet       :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Numéro billet      :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Destination           :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Prix à payer          :");

        txtdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });

        txtnum.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumActionPerformed(evt);
            }
        });

        txtprix.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtprix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprixActionPerformed(evt);
            }
        });

        txtdes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtdes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paris", "London", "Madrid" }));

        btnNouvu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnNouvu.setText("Nouveau");
        btnNouvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNouvuActionPerformed(evt);
            }
        });

        btnFerm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnFerm.setText("Fermer");
        btnFerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermActionPerformed(evt);
            }
        });

        btncalcul.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btncalcul.setText("Calculer");
        btncalcul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNouvu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFerm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncalcul, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNouvu))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncalcul))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnFerm)
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(273, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txtprixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprixActionPerformed

    private void btncalculActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculActionPerformed
        // TODO add your handling code here:
        String st= txtdes.getSelectedItem().toString() ;
        String p=String.valueOf(calcule(st));
        txtprix.setText(p);
        
      
    }//GEN-LAST:event_btncalculActionPerformed

    private void btnNouvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNouvuActionPerformed
        // TODO add your handling code here:
        nouveau();
    }//GEN-LAST:event_btnNouvuActionPerformed

    private void btnFermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnFermActionPerformed

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphicBillet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicBillet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicBillet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicBillet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicBillet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFerm;
    private javax.swing.JButton btnNouvu;
    private javax.swing.JButton btncalcul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtdate;
    private javax.swing.JComboBox<String> txtdes;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtprix;
    // End of variables declaration//GEN-END:variables
}
