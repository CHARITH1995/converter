/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cconvert;

/**
 *
 * @author charyth
 */
public class cconverters extends javax.swing.JFrame {

   double usDollar=154.23;
   double indianrupee=1.23;
   double ukponds=230.56;
   double canadadollar = 56.34;
   double brazildollar = 45.67;
   
    public cconverters() {
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

        jLabel1 = new javax.swing.JLabel();
        jcombocurrency = new javax.swing.JComboBox<>();
        jlblconvert = new javax.swing.JLabel();
        jtxtconvert = new javax.swing.JTextField();
        jbtnsubmit = new javax.swing.JButton();
        jbtnreset = new javax.swing.JButton();
        jbtnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel1.setText("currency converter");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jcombocurrency.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jcombocurrency.setForeground(new java.awt.Color(102, 0, 51));
        jcombocurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose one...", "USA", "Brazil", "Canada", "UK", "India", " " }));
        jcombocurrency.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcombocurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombocurrencyActionPerformed(evt);
            }
        });

        jlblconvert.setDisplayedMnemonic(' ');
        jlblconvert.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jlblconvert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblconvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jlblconvert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jtxtconvert.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jtxtconvert.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtconvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtconvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtconvertActionPerformed(evt);
            }
        });

        jbtnsubmit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnsubmit.setText("submit");
        jbtnsubmit.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsubmitActionPerformed(evt);
            }
        });

        jbtnreset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnreset.setText("reset");
        jbtnreset.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });

        jbtnexit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnexit.setText("exit");
        jbtnexit.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcombocurrency, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtconvert, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcombocurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jlblconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        jcombocurrency.getAccessibleContext().setAccessibleName("select currency");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcombocurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombocurrencyActionPerformed

    }//GEN-LAST:event_jcombocurrencyActionPerformed

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
       System.exit(1);
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
           jtxtconvert.setText(null);  
           jlblconvert.setText(null);
           jcombocurrency.setSelectedItem("choose one...");
    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jtxtconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtconvertActionPerformed
      
    }//GEN-LAST:event_jtxtconvertActionPerformed

    private void jbtnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsubmitActionPerformed
           double slrupees = Double.parseDouble(jtxtconvert.getText());
       if(jcombocurrency.getSelectedItem().equals("USA")){
           String value=String.format("$ % .2f",slrupees /usDollar);
           jlblconvert.setText(value);
       }
        if(jcombocurrency.getSelectedItem().equals("India")){
           String value=String.format("I % .2f",slrupees /indianrupee);
           jlblconvert.setText(value);
       }
         if(jcombocurrency.getSelectedItem().equals("UK")){
           String value=String.format("# % .2f",slrupees /ukponds);
           jlblconvert.setText(value);
       }
          if(jcombocurrency.getSelectedItem().equals("Canada")){
           String value=String.format("* % .2f",slrupees /canadadollar);
           jlblconvert.setText(value);
       }
           if(jcombocurrency.getSelectedItem().equals("Brazil")){
           String value=String.format("@ % .2f",slrupees /brazildollar);
           jlblconvert.setText(value);
       }               
    }//GEN-LAST:event_jbtnsubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cconverters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JButton jbtnsubmit;
    private javax.swing.JComboBox<String> jcombocurrency;
    private javax.swing.JLabel jlblconvert;
    private javax.swing.JTextField jtxtconvert;
    // End of variables declaration//GEN-END:variables
}
