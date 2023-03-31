package employee.payroll;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import net.proteanit.sql.DbUtils;

public class Allowance extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Allowance() {
        initComponents();
        conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,size.height / 2 - getHeight() / 2);
        Update_table();
        // lbl_emp.setText(String.valueOf(Emp.empId).toString());
        lbl_emp.setText(String.valueOf(Emp.empname).toString());

    }

    private void Update_table(){
        try {
            String sql = "SELECT * FROM tbl_allowance";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_allowance.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_empid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_dep = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_allowance = new javax.swing.JTable();
        txt_overtime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_med = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_bonus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_other = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_hw = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_rate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1009, 628));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/search.png"))); // NOI18N
        jLabel1.setLabelFor(txt_search);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 30, 30));

        txt_search.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 200, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setLabelFor(txt_empid);
        jLabel2.setText("Employee ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        txt_empid.setBackground(new java.awt.Color(228, 228, 228));
        txt_empid.setEnabled(false);
        txt_empid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_empidActionPerformed(evt);
            }
        });
        getContentPane().add(txt_empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setLabelFor(txt_firstname);
        jLabel3.setText("First Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        txt_firstname.setBackground(new java.awt.Color(228, 228, 228));
        txt_firstname.setEnabled(false);
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setLabelFor(txt_surname);
        jLabel4.setText("Surname:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        txt_surname.setBackground(new java.awt.Color(228, 228, 228));
        txt_surname.setEnabled(false);
        txt_surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_surnameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setLabelFor(txt_dob);
        jLabel5.setText("Date of Birth:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        txt_dob.setBackground(new java.awt.Color(228, 228, 228));
        txt_dob.setEnabled(false);
        txt_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dobActionPerformed(evt);
            }
        });
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 140, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setLabelFor(txt_salary);
        jLabel6.setText("Basic Salary:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        txt_salary.setBackground(new java.awt.Color(228, 228, 228));
        txt_salary.setEnabled(false);
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 140, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setLabelFor(txt_dep);
        jLabel7.setText("Department:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        txt_dep.setBackground(new java.awt.Color(228, 228, 228));
        txt_dep.setEnabled(false);
        getContentPane().add(txt_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 140, 30));

        table_allowance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_allowance);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 860, 180));

        txt_overtime.setBackground(new java.awt.Color(228, 228, 228));
        txt_overtime.setText("0");
        txt_overtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_overtimeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_overtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 150, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setLabelFor(txt_overtime);
        jLabel8.setText("Overtime:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setLabelFor(txt_med);
        jLabel9.setText("Medical:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        txt_med.setBackground(new java.awt.Color(228, 228, 228));
        txt_med.setText("0");
        getContentPane().add(txt_med, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 150, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setLabelFor(txt_bonus);
        jLabel10.setText("Bonus:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        txt_bonus.setBackground(new java.awt.Color(228, 228, 228));
        txt_bonus.setText("0");
        txt_bonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bonusActionPerformed(evt);
            }
        });
        getContentPane().add(txt_bonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 150, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setText("Other:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        txt_other.setBackground(new java.awt.Color(228, 228, 228));
        txt_other.setText("0");
        txt_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_otherActionPerformed(evt);
            }
        });
        getContentPane().add(txt_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 150, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setLabelFor(txt_hw);
        jLabel12.setText("Total Overtime:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        txt_hw.setBackground(new java.awt.Color(228, 228, 228));
        txt_hw.setText("0");
        txt_hw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hwActionPerformed(evt);
            }
        });
        getContentPane().add(txt_hw, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 150, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setLabelFor(txt_rate);
        jLabel13.setText("Rate Per Hour:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        txt_rate.setBackground(new java.awt.Color(228, 228, 228));
        txt_rate.setText("0");
        getContentPane().add(txt_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 150, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setLabelFor(lbl_total);
        jLabel14.setText("Total Amount:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, -1, 30));

        lbl_total.setText("0.00");
        getContentPane().add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, -1, 30));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/save_icon.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 90, 40));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/cal_icon.png"))); // NOI18N
        jButton2.setText("Calculate");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 200, 40));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/erase-128.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 90, 40));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setLabelFor(lbl_emp);
        jLabel16.setText("Logged in As:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        lbl_emp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_emp.setText("emp");
        getContentPane().add(lbl_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, -1, -1));

        jDesktopPane1.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 200, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_empidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_empidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empidActionPerformed

    private void txt_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_surnameActionPerformed

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

    private void txt_overtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_overtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_overtimeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            int value = Emp.empId;
            String value1 = txt_salary.getText();
            String value2 = txt_bonus.getText();
            String value3 = txt_med.getText();
            String value4 = txt_other.getText();
            String value5 = txt_rate.getText();
            String value6 = txt_hw.getText();
            String value7 = lbl_total.getText();
            String value8 = txt_empid.getText();
            String value9 = txt_firstname.getText();
            String value10 = txt_surname.getText();

            String sql = "INSERT INTO tbl_allowance (created_by,emp_id,overtime,medical,bonus,other,salary,rate,total_allowance,firstname,surname) VALUES ('" + value + "','" + value8 + "','" + value6 + "','" + value3 + "','" + value2 + "','" + value4 + "','" + value1 + "','" + value5 + "','" + value7 + "','" + value9 + "','" + value10 + "')";

            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Allowance Added");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {
                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
        Update_table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_bonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bonusActionPerformed

    private void txt_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_otherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_otherActionPerformed

    private void txt_hwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hwActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        try {

            String sql = "SELECT * FROM staff_inform WHERE id=? ";

            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs = pst.executeQuery();

            String add1 = rs.getString("id");
            txt_empid.setText(add1);

            String add2 = rs.getString("first_name");
            txt_firstname.setText(add2);

            String add3 = rs.getString("surname");
            txt_surname.setText(add3);

            String add4 = rs.getString("Dob");
            txt_dob.setText(add4);

            String add5 = rs.getString("Salary");
            txt_salary.setText(add5);

            String add6 = rs.getString("Department");
            txt_dep.setText(add6);
            
            byte[] image = rs.getBytes("Image");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH));
            img.setIcon(imageIcon);

           

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        } finally {

            try {
                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int salary = Integer.parseInt(txt_salary.getText());
        int overtime = Integer.parseInt(txt_overtime.getText());

        double eight = 8;
        double days = 25;
        double dbop = 0;
        double overtimeRate = 1.5;

        //calculate the total hours of overtime
        double Total_Overtime = overtime * overtimeRate;
        String x = String.valueOf(Total_Overtime);
        txt_hw.setText(x);

        //calculate overall overtime 
        dbop = salary / days / eight;
        String s = String.valueOf(dbop);
        txt_rate.setText(s);

        int med = Integer.parseInt(txt_med.getText());
        int bonus = Integer.parseInt(txt_bonus.getText());
        int other = Integer.parseInt(txt_other.getText());
        int f = med + bonus + other;
        double calc = Total_Overtime * dbop + f;
        String c = String.valueOf(calc);
        lbl_total.setText(c);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txt_empid.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_salary.setText("");
        txt_dob.setText("");
        txt_dep.setText("");
        txt_med.setText("0");
        txt_bonus.setText("0");
        txt_other.setText("0");
        txt_hw.setText("0");
        txt_rate.setText("0");
        txt_overtime.setText("0");
        lbl_total.setText("0.00");
        txt_search.setText(""); 
        img.setIcon(null);

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Allowance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTable table_allowance;
    private javax.swing.JTextField txt_bonus;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_empid;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_hw;
    private javax.swing.JTextField txt_med;
    private javax.swing.JTextField txt_other;
    private javax.swing.JTextField txt_overtime;
    private javax.swing.JTextField txt_rate;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
