package vaccinationsystem;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.IOException;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rdbCitizen = new javax.swing.JRadioButton();
        rdbPersonnel = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLoginID = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        BtnClear = new javax.swing.JButton();
        BtnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Account Type: ");

        buttonGroup1.add(rdbCitizen);
        rdbCitizen.setForeground(new java.awt.Color(255, 255, 255));
        rdbCitizen.setText("Citizen/Non-Citizen");
        rdbCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCitizenActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbPersonnel);
        rdbPersonnel.setForeground(new java.awt.Color(255, 255, 255));
        rdbPersonnel.setText("Personnel");
        rdbPersonnel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPersonnelActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login ID:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        txtLoginID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginIDActionPerformed(evt);
            }
        });

        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        BtnLogin.setText("Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbCitizen, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoginID, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdbCitizen)
                    .addComponent(rdbPersonnel))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLoginID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnClear)
                    .addComponent(BtnLogin))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCitizenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbCitizenActionPerformed

    private void txtLoginIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginIDActionPerformed

    private void rdbPersonnelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPersonnelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbPersonnelActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        txtLoginID.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        if(rdbCitizen.isSelected()){
            if(txtLoginID.getText().trim().isEmpty() && txtPassword.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this,"Login ID and Password fields are empty!");
            }else if(txtLoginID.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Login ID field is empty!");
            }else if(txtPassword.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Password field is empty!");
            }else{
                authentication(txtLoginID.getText(),txtPassword.getText(),"LoginCitizen.txt");
            }
        }else if(rdbPersonnel.isSelected()){
            if(txtLoginID.getText().trim().isEmpty() && txtPassword.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this,"Login ID and Password fields are empty!");
            }else if(txtLoginID.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Login ID field is empty!");
            }else if(txtPassword.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Password field is empty!");
            }else{
                authentication(txtLoginID.getText(),txtPassword.getText(),"LoginPersonnel.txt");
            }
        }
    }//GEN-LAST:event_BtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
            try{
                FileWriter fw = new FileWriter("LoginCitizen.txt",true);
                FileWriter fw2 = new FileWriter("LoginPersonnel.txt", true);
            }catch(IOException ex){
                System.out.println("Unable to create file due to " + ex);
            }
            
            String LoginID = "";
            String Password = "";
            String filepath = "LoginCitizen.txt";
            String filepath2 = "LoginPersonnel.txt";
    }
    
        public static Scanner S;
        
        public void authentication(String LoginID, String Password, String Filepath){
        boolean found = false;
        String tempID = txtLoginID.getText();
        String tempPassword = txtPassword.getText();
        
        try{
            S = new Scanner(new File(Filepath));
            S.useDelimiter("[;\n]");
            
            while (S.hasNext() && !found){
                tempID = S.next();
                tempPassword = S.next();
                
                if(tempID.trim().equals(LoginID.trim()) && tempPassword.trim().equals(Password.trim())){
                    found = true;
                }
            } if (found == true){
                Homepage a = new Homepage();
                a.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Authentication failed, credential invalid!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
}
        
        public void authentication2(String LoginID, String Password, String Filepath){
        boolean found = false;
        String tempID = txtLoginID.getText();
        String tempPassword = txtPassword.getText();
        
        try{
            S = new Scanner(new File(Filepath));
            S.useDelimiter("[;\n]");
            
            while (S.hasNext() && !found){
                tempID = S.next();
                tempPassword = S.next();
                
                if(tempID.trim().equals(LoginID.trim()) && tempPassword.trim().equals(Password.trim())){
                    found = true;
                }
            } if (found == true){
                PersonnelHomepage a = new PersonnelHomepage();
                a.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Authentication failed, credential invalid!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
}
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbCitizen;
    private javax.swing.JRadioButton rdbPersonnel;
    private javax.swing.JTextField txtLoginID;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
