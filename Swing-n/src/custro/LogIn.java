package custro;

import Class.Sql.LogInPass;
import static custro.DashBoard.setPhoneNo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {
    
    static Socket s;
    static ServerSocket ss;
    static InputStreamReader isr;
    static BufferedReader br;
    static String massage;

    
    
    public LogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logInMain = new javax.swing.JPanel();
        logInLogo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginForm = new javax.swing.JPanel();
        lableLogin = new javax.swing.JLabel();
        textUserName = new javax.swing.JTextField();
        textPass = new javax.swing.JPasswordField();
        btnLogIn = new javax.swing.JButton();
        exitLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        logInMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logInLogo.setBackground(new java.awt.Color(255, 102, 0));
        logInLogo.setEnabled(false);
        logInLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/custro/Icon/logInIcon.png"))); // NOI18N
        logInLogo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CusTro");
        logInLogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 170, 80));

        logInMain.add(logInLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 440));

        loginForm.setBackground(new java.awt.Color(255, 255, 255));

        lableLogin.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        lableLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableLogin.setLabelFor(lableLogin);
        lableLogin.setText("LogIn");

        textUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textUserName.setForeground(new java.awt.Color(102, 102, 102));
        textUserName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textUserName.setText("Enter User Name");
        textUserName.setToolTipText("User Name");
        textUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 102, 0)));

        textPass.setForeground(new java.awt.Color(102, 102, 102));
        textPass.setText("Enter Password");
        textPass.setToolTipText("Password");
        textPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 102, 0)));
        textPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPassActionPerformed(evt);
            }
        });

        btnLogIn.setBackground(new java.awt.Color(255, 102, 0));
        btnLogIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogIn.setText("Login");
        btnLogIn.setToolTipText("Login");
        btnLogIn.setBorderPainted(false);
        btnLogIn.setMargin(new java.awt.Insets(5, 16, 5, 16));
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnLogInActionPerformed(evt);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        btnLogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLogInKeyPressed(evt);
            }
        });

        exitLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitLogin.setForeground(new java.awt.Color(255, 102, 0));
        exitLogin.setText("X");
        exitLogin.setToolTipText("");
        exitLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginFormLayout = new javax.swing.GroupLayout(loginForm);
        loginForm.setLayout(loginFormLayout);
        loginFormLayout.setHorizontalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormLayout.createSequentialGroup()
                        .addComponent(lableLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormLayout.createSequentialGroup()
                        .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormLayout.createSequentialGroup()
                        .addComponent(btnLogIn)
                        .addGap(58, 58, 58))
                    .addComponent(exitLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        loginFormLayout.setVerticalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitLogin)
                .addGap(92, 92, 92)
                .addComponent(lableLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogIn)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        logInMain.add(loginForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 270, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logInMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logInMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPassActionPerformed

    private void exitLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLoginMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLoginMouseClicked

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_btnLogInActionPerformed
        String pass=null;
        DashBoard dash=new DashBoard();
        LogInPass logIn=new LogInPass(textUserName.getText());
        
        String passText=new String(textPass.getPassword());
            
            if(logIn.getUserPass().equals(passText)){
                this.dispose();
                dash.setLocationRelativeTo(null);
                dash.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, pass+"\n"+passText);
            }
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnLogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLogInKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogInKeyPressed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        LogIn login=new LogIn();        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });
        try{
            ss=new ServerSocket(9100);
            while(true){
                s=ss.accept();
                isr=new InputStreamReader(s.getInputStream());
                br=new BufferedReader(isr);
                massage=br.readLine();
                if(massage.length()>0){
                    if(massage.length()==14){
                        massage=massage.substring(massage.length() - 11);
                        setPhoneNo(massage);
                    }
                    else{
                        setPhoneNo(massage);
                    }
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel exitLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lableLogin;
    private javax.swing.JPanel logInLogo;
    private javax.swing.JPanel logInMain;
    private javax.swing.JPanel loginForm;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables
}
