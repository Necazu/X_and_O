/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x.si.pkg0;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Necazu
 */
public class conturi extends javax.swing.JFrame {

    public conturi() {
        initComponents();  
    }
    
      public conturi( String n) {
        initComponents();
        afisare1.setText(n);
    }
      
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        afisare1 = new javax.swing.JLabel();
        tnume1 = new javax.swing.JTextField();
        aplica = new javax.swing.JButton();
        afisare3 = new javax.swing.JLabel();
        anulare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 171, 70));
        jLabel1.setText("X & O");

        afisare1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        afisare1.setForeground(new java.awt.Color(162, 171, 70));
        afisare1.setText("Nume vechi:");

        tnume1.setBackground(new java.awt.Color(43, 56, 22));
        tnume1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tnume1.setForeground(new java.awt.Color(166, 179, 37));

        aplica.setBackground(new java.awt.Color(43, 56, 22));
        aplica.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        aplica.setForeground(new java.awt.Color(174, 194, 118));
        aplica.setText("Schimba nume");
        aplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicaActionPerformed(evt);
            }
        });

        afisare3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        afisare3.setForeground(new java.awt.Color(162, 171, 70));
        afisare3.setText("Nume vechi:");

        anulare.setBackground(new java.awt.Color(43, 56, 22));
        anulare.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        anulare.setForeground(new java.awt.Color(174, 194, 118));
        anulare.setText("Anuleaza");
        anulare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anulareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tnume1)
                    .addComponent(aplica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(afisare3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(afisare1))
                    .addComponent(anulare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(afisare1)
                    .addComponent(afisare3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tnume1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aplica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anulare)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicaActionPerformed
        // TODO add your handling code here:
           
        String n2=afisare1.getText();
        {
       
            try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                        Statement stm= con.createStatement();
                        String n1=afisare1.getText();
                        String nou1=tnume1.getText();
                  
                        String sql="update topuri set nume='"+nou1+"' where nume='"+n1+"'";

                         int rs =stm.executeUpdate(sql);
                          if(rs==1)
                    {
                        UIManager UI=new UIManager();
                        UI.put("OptionPane.background",new Color(32, 40, 79));
                        UI.put("Panel.background",new Color(32, 40, 79));
                        UI.put("OptionPane.messageForeground", new Color(249,224,174));
                        UI.put("Button.background",new Color(43,56,22));
                        UI.put("Button.foreground", new Color(249,224,174));

                        setVisible(false);
                        new frame0().setVisible(true);  
                    }
   
                    }catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        } 
                    
        }
       
    }//GEN-LAST:event_aplicaActionPerformed

    private void anulareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anulareActionPerformed
        // TODO add your handling code here:
                        UIManager UI=new UIManager();
                        UI.put("OptionPane.background",new Color(32, 40, 79));
                        UI.put("Panel.background",new Color(32, 40, 79));
                        UI.put("OptionPane.messageForeground", new Color(249,224,174));
                        UI.put("Button.background",new Color(43,56,22));
                        UI.put("Button.foreground", new Color(249,224,174));
                        setVisible(false);
                        new frame0().setVisible(true);  
    }//GEN-LAST:event_anulareActionPerformed

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
            java.util.logging.Logger.getLogger(conturi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conturi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conturi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conturi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conturi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afisare1;
    private javax.swing.JLabel afisare3;
    private javax.swing.JButton anulare;
    private javax.swing.JButton aplica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tnume1;
    // End of variables declaration//GEN-END:variables
}
