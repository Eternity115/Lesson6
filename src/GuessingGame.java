
import javax.swing.JOptionPane;


public class GuessingGame extends javax.swing.JFrame {

    GuessMachine gm;
    int guess, totguess;
    
    public GuessingGame() {
        initComponents();
        gm = new GuessMachine();       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtguess = new javax.swing.JTextField();
        btnsub = new javax.swing.JButton();
        lblhint = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblguesses = new javax.swing.JLabel();
        btnplay = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel1.setText("Enter your guess from 1 to 100:");

        txtguess.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnsub.setBackground(new java.awt.Color(200, 220, 255));
        btnsub.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        btnsub.setText("Submit Guess");
        btnsub.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        lblhint.setBackground(new java.awt.Color(240, 250, 255));
        lblhint.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        lblhint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhint.setText("Submit Guess to Start Game");
        lblhint.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(200, 230, 255));
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel2.setText("Guesses so far:");

        lblguesses.setBackground(new java.awt.Color(255, 255, 255));
        lblguesses.setFont(new java.awt.Font("High Tower Text", 1, 14)); // NOI18N
        lblguesses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblguesses.setText("0");
        lblguesses.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblguesses.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblguesses, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblguesses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnplay.setBackground(new java.awt.Color(200, 220, 255));
        btnplay.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        btnplay.setText("Play Again");
        btnplay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnplay.setEnabled(false);
        btnplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblhint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtguess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtguess)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsub)
                    .addComponent(btnplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblhint, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
        // TODO add your handling code here:
        try{
           guess = Integer.parseInt(txtguess.getText()); 
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid Guess", "Error Message", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (gm.setGuess(guess)){
            lblhint.setText(gm.giveHint());
            totguess = gm.getNumGuesses();
            lblguesses.setText("" + String.valueOf(totguess));
        }
        else{
            lblhint.setText("Invalid Guess");
        }
        txtguess.setText("");
        txtguess.requestFocus();
        if (gm.hasWon()){
            btnsub.setEnabled(false);
            btnplay.setEnabled(true);
        }
        
        //read guess in from textbox
        //try to set guess:
        /*
        if (gm.setGuess(guess)){
            //send msg to label: gm.giveHint()
            //update number of guesses gm.NumGuesses();
        }
        else{
            //send msg to label: Invalid Guess
        }
        //housekeeping -> clear input text box, and put cursor back in box
        
        //if gm.hasWon() -> disable guess button
        
        //option -> Play Again Button (gm=new GuessMachine;)
        
        */
    }//GEN-LAST:event_btnsubActionPerformed

    private void btnplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayActionPerformed
        // TODO add your handling code here:
        gm = new GuessMachine();
        lblguesses.setText("0");
        lblhint.setText("Submit Guess to Start Game");
        btnsub.setEnabled(true);
        btnplay.setEnabled(false);
    }//GEN-LAST:event_btnplayActionPerformed

    
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
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnplay;
    private javax.swing.JButton btnsub;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblguesses;
    private javax.swing.JLabel lblhint;
    private javax.swing.JTextField txtguess;
    // End of variables declaration//GEN-END:variables
}
