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
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
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

        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Menu_Btn = new javax.swing.JButton();
        Home_Btn = new javax.swing.JButton();
        Employee_Btn = new javax.swing.JButton();
        Sales_Btn = new javax.swing.JButton();
        Payment_Btn = new javax.swing.JButton();
        About_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(38, 38, 38));
        jPanel5.setPreferredSize(new java.awt.Dimension(1187, 788));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee Dashboard");

        jPanel3.setBackground(new java.awt.Color(76, 76, 76));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PERSONAL DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee ID");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Birth");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Branch");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Employee.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                        .addComponent(jTextField1))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 25));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1267, Short.MAX_VALUE)
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
            .addGap(0, 788, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
