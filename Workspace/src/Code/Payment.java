package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;

public class Payment extends javax.swing.JFrame {
    public Payment() {
        initComponents();
        JButton [] btns = {Home_Btn, Employee_Btn, Payment_Btn, About_Btn, Stock_Btn, Menu_Btn};
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Menu_Btn = new javax.swing.JButton();
        Home_Btn = new javax.swing.JButton();
        Employee_Btn = new javax.swing.JButton();
        Stock_Btn = new javax.swing.JButton();
        Payment_Btn = new javax.swing.JButton();
        About_Btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        card_no = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        exp_date = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        mode_of_pay = new javax.swing.JComboBox<>();
        amount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Pay_Btn = new javax.swing.JButton();
        Invoice_Btn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Invoice = new javax.swing.JTextArea();
        Download_Btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment Page");
        setLocation(new java.awt.Point(325, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(60, 150));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        Menu_Btn.setBackground(new java.awt.Color(38, 38, 38));
        Menu_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Menu_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_menu_28px_2.png"))); // NOI18N
        Menu_Btn.setPreferredSize(new java.awt.Dimension(50, 50));
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
        Home_Btn.setPreferredSize(new java.awt.Dimension(50, 50));
        Home_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(Home_Btn);

        Employee_Btn.setBackground(new java.awt.Color(38, 38, 38));
        Employee_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_profile_28px.png"))); // NOI18N
        Employee_Btn.setPreferredSize(new java.awt.Dimension(50, 50));
        Employee_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(Employee_Btn);

        Stock_Btn.setBackground(new java.awt.Color(38, 38, 38));
        Stock_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_fast_cart_28px.png"))); // NOI18N
        Stock_Btn.setPreferredSize(new java.awt.Dimension(50, 50));
        Stock_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(Stock_Btn);

        Payment_Btn.setBackground(new java.awt.Color(38, 38, 38));
        Payment_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Summer_Sales_28px.png"))); // NOI18N
        Payment_Btn.setPreferredSize(new java.awt.Dimension(50, 50));
        Payment_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Payment_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(Payment_Btn);

        About_Btn.setBackground(new java.awt.Color(38, 38, 38));
        About_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_about_28px.png"))); // NOI18N
        About_Btn.setPreferredSize(new java.awt.Dimension(50, 50));
        About_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(About_Btn);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 796));

        jPanel5.setBackground(new java.awt.Color(38, 38, 38));
        jPanel5.setPreferredSize(new java.awt.Dimension(1190, 788));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Payment Page");

        jPanel1.setBackground(new java.awt.Color(76, 76, 76));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");

        username.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mode of Payment");

        card_no.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        card_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card_noActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Card No.");

        exp_date.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        exp_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exp_dateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Expiration Date");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CVV");

        cvv.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });

        mode_of_pay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mode_of_pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credit Card", "Debit Card", "UPI" }));

        amount.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Payment Amount");

        Pay_Btn.setBackground(new java.awt.Color(0, 123, 255));
        Pay_Btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Pay_Btn.setText("Pay");
        Pay_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pay_BtnActionPerformed(evt);
            }
        });

        Invoice_Btn.setBackground(new java.awt.Color(255, 193, 7));
        Invoice_Btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Invoice_Btn.setText("Generate Invoice");
        Invoice_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Invoice_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Pay_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Invoice_Btn))
                    .addComponent(amount)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card_no)
                    .addComponent(mode_of_pay, javax.swing.GroupLayout.Alignment.LEADING, 0, 398, Short.MAX_VALUE)
                    .addComponent(cvv)
                    .addComponent(exp_date, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mode_of_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exp_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pay_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Invoice_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel7.setBackground(new java.awt.Color(38, 38, 38));
        jPanel7.setPreferredSize(new java.awt.Dimension(450, 720));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Visa.jpg"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Mastercard.jpg"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/GPay.jpg"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/UPI.jpg"))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(76, 76, 76));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Invoice");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        Invoice.setEditable(false);
        Invoice.setBackground(new java.awt.Color(250, 249, 249));
        Invoice.setColumns(20);
        Invoice.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Invoice.setRows(5);
        jScrollPane6.setViewportView(Invoice);

        Download_Btn.setBackground(new java.awt.Color(102, 255, 51));
        Download_Btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Download_Btn.setText("Download");
        Download_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Download_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Download_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Download_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Minion.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_BtnActionPerformed
        
    }//GEN-LAST:event_Menu_BtnActionPerformed

    private void Home_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_BtnActionPerformed
        dispose();
    	Home ah = new Home();
          ah.setTitle("Home");
          ah.setVisible(true);
    }//GEN-LAST:event_Home_BtnActionPerformed

    private void Employee_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_BtnActionPerformed
        dispose();
    	Employee ah = new Employee();
          ah.setTitle("Employee Dashboard");
          ah.setVisible(true);
    }//GEN-LAST:event_Employee_BtnActionPerformed

    private void Stock_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_BtnActionPerformed
        dispose();
    	Stock ah = new Stock();
          ah.setTitle("Stock");
          ah.setVisible(true);
    }//GEN-LAST:event_Stock_BtnActionPerformed

    private void Payment_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payment_BtnActionPerformed
        dispose();
    	Payment ah = new Payment();
          ah.setTitle("Payment Page");
          ah.setVisible(true);
    }//GEN-LAST:event_Payment_BtnActionPerformed

    private void About_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_BtnActionPerformed
        dispose();
    	About ah = new About();
          ah.setTitle("About");
          ah.setVisible(true);
    }//GEN-LAST:event_About_BtnActionPerformed

    private void Pay_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pay_BtnActionPerformed

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/IMS", "postgres", "tarun2875");
               
            String Username = username.getText();
            String Amount = amount.getText();
            String Mode = mode_of_pay.getSelectedItem().toString();        
            String CardNo = card_no.getText();
            String ExpDate = exp_date.getText();
            String CVV = cvv.getText();
        
            String query = "INSERT INTO Payment VALUES('" + Username + "','" + Amount + "','" + Mode + "','" +
                    CardNo + "','" + ExpDate + "' ,'" + CVV + "')";

            Statement sta = connection.createStatement();
            int x = sta.executeUpdate(query);
            
            if (x == 0) {
                JOptionPane.showMessageDialog(Pay_Btn, "Something went wrong, Try Again...");
                
            } else {
                JOptionPane.showMessageDialog(Pay_Btn, "Payment Successful");
            }
            connection.close();
            
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }//GEN-LAST:event_Pay_BtnActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        
    }//GEN-LAST:event_amountActionPerformed

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        
    }//GEN-LAST:event_cvvActionPerformed

    private void exp_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exp_dateActionPerformed
        
    }//GEN-LAST:event_exp_dateActionPerformed

    private void card_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card_noActionPerformed
        
    }//GEN-LAST:event_card_noActionPerformed

    private void Invoice_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Invoice_BtnActionPerformed
                Invoice.setText(
                      "----------------------"
                    + "------- INVOICE ------"
                    + "----------------------\n");
  
                Invoice.setText(Invoice.getText()
                              + "Username: "
                              + username.getText()
                              + "\n");
                Invoice.setText(Invoice.getText()
                              + "Payment Amount: "
                              + amount.getText()
                              + "\n");
                Invoice.setText(Invoice.getText()
                              + "Mode of Payment: "
                              + mode_of_pay.getSelectedItem()
                                    .toString()
                              + "\n");
                Invoice.setText(Invoice.getText()
                              + "Card No.: "
                              + card_no.getText()
                              + "\n");
                Invoice.setText(Invoice.getText()
                              + "Expiration Date: "
                              + exp_date.getText()
                              + "\n");
                Invoice.setText(Invoice.getText()
                              + "CVV: "
                              + cvv.getText()
                              + "\n");
                
                JOptionPane.showMessageDialog(
                    Invoice, "DATA SAVED SUCCESSFULLY");
    }//GEN-LAST:event_Invoice_BtnActionPerformed

    private void Download_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Download_BtnActionPerformed
        if (evt.getSource() == Download_Btn) {
                    try {
                        FileWriter fw = new FileWriter("C:\\Users\\Tarun\\Downloads\\Invoice.txt", true);
                        fw.write(Invoice.getText());
                        fw.close();
                        JOptionPane.showMessageDialog(Download_Btn, "Invoice Downloaded");
                    }
                    catch (Exception ae) {
                        System.out.println(ae);
                    }
                }
    }//GEN-LAST:event_Download_BtnActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_Btn;
    private javax.swing.JButton Download_Btn;
    private javax.swing.JButton Employee_Btn;
    private javax.swing.JButton Home_Btn;
    private javax.swing.JTextArea Invoice;
    private javax.swing.JButton Invoice_Btn;
    private javax.swing.JButton Menu_Btn;
    private javax.swing.JButton Pay_Btn;
    private javax.swing.JButton Payment_Btn;
    private javax.swing.JButton Stock_Btn;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField card_no;
    private javax.swing.JTextField cvv;
    private javax.swing.JTextField exp_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> mode_of_pay;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
