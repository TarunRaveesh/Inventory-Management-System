/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Code;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author Tarun
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
        JButton [] btns = {Home_Btn, Employee_Btn, Payment_Btn, About_Btn, Sales_Btn, Menu_Btn};
        for (JButton btn : btns) {
            btn.setBackground(new Color(0, 0, 0));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(38, 38, 38));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(0, 0, 0));
                }
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Menu_Btn = new javax.swing.JButton();
        Home_Btn = new javax.swing.JButton();
        Employee_Btn = new javax.swing.JButton();
        Sales_Btn = new javax.swing.JButton();
        Payment_Btn = new javax.swing.JButton();
        About_Btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(50, 150));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 0));

        Menu_Btn.setBackground(new java.awt.Color(38, 38, 38));
        Menu_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Menu_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_menu_28px_2.png"))); // NOI18N
        Menu_Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Menu_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_BtnActionPerformed(evt);
            }
        });
        jPanel4.add(Menu_Btn);

        jPanel2.add(jPanel4);

        Home_Btn.setBackground(new java.awt.Color(38, 38, 38));
        Home_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Home_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_home_28px.png"))); // NOI18N
        Home_Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Home_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(Home_Btn);

        Employee_Btn.setBackground(new java.awt.Color(38, 38, 38));
        Employee_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_profile_28px.png"))); // NOI18N
        Employee_Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Employee_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(Employee_Btn);

        Sales_Btn.setBackground(new java.awt.Color(38, 38, 38));
        Sales_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Summer_Sales_28px.png"))); // NOI18N
        Sales_Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Sales_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sales_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(Sales_Btn);

        Payment_Btn.setBackground(new java.awt.Color(38, 38, 38));
        Payment_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_fast_cart_28px.png"))); // NOI18N
        Payment_Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Payment_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Payment_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(Payment_Btn);

        About_Btn.setBackground(new java.awt.Color(38, 38, 38));
        About_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_about_28px.png"))); // NOI18N
        About_Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        About_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(About_Btn);

        jPanel5.setBackground(new java.awt.Color(38, 38, 38));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("About");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(985, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(711, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_BtnActionPerformed

    private void Home_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Home_BtnActionPerformed

    private void Employee_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Employee_BtnActionPerformed

    private void Sales_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sales_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sales_BtnActionPerformed

    private void Payment_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payment_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Payment_BtnActionPerformed

    private void About_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_About_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_Btn;
    private javax.swing.JButton Employee_Btn;
    private javax.swing.JButton Home_Btn;
    private javax.swing.JButton Menu_Btn;
    private javax.swing.JButton Payment_Btn;
    private javax.swing.JButton Sales_Btn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
