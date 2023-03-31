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
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Deductions extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Deductions() {
        initComponents();

        conn = db.java_db();

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
                size.height / 2 - getHeight() / 2);

        //lbl_emp.setText(String.valueOf(Emp.empId).toString());
        lbl_emp.setText(String.valueOf(Emp.empname).toString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        Department = new javax.swing.JLabel();
        txt_dep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_design = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_doj = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_job = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Calculate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_deduction = new javax.swing.JTextField();
        r_amount = new javax.swing.JRadioButton();
        r_percentage = new javax.swing.JRadioButton();
        txt_percentage = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_sal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(876, 568));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/search.png"))); // NOI18N
        jLabel1.setLabelFor(txt_search);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 30, 30));

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
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 190, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Employee ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 20));

        txt_id.setBackground(new java.awt.Color(153, 153, 153));
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.setEnabled(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("First Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 20));

        txt_firstname.setBackground(new java.awt.Color(153, 153, 153));
        txt_firstname.setForeground(new java.awt.Color(255, 255, 255));
        txt_firstname.setEnabled(false);
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setLabelFor(txt_surname);
        jLabel4.setText("Surname:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        txt_surname.setBackground(new java.awt.Color(153, 153, 153));
        txt_surname.setForeground(new java.awt.Color(255, 255, 255));
        txt_surname.setEnabled(false);
        getContentPane().add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 170, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setLabelFor(txt_dob);
        jLabel5.setText("Date of Birth:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 80, 20));

        txt_dob.setBackground(new java.awt.Color(153, 153, 153));
        txt_dob.setForeground(new java.awt.Color(255, 255, 255));
        txt_dob.setEnabled(false);
        txt_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dobActionPerformed(evt);
            }
        });
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, 30));

        Department.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Department.setLabelFor(txt_dep);
        Department.setText("Department:");
        getContentPane().add(Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 80, 20));

        txt_dep.setBackground(new java.awt.Color(153, 153, 153));
        txt_dep.setForeground(new java.awt.Color(255, 255, 255));
        txt_dep.setEnabled(false);
        txt_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_depActionPerformed(evt);
            }
        });
        getContentPane().add(txt_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 170, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setLabelFor(txt_design);
        jLabel6.setText("Designation:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, 20));

        txt_design.setBackground(new java.awt.Color(153, 153, 153));
        txt_design.setForeground(new java.awt.Color(255, 255, 255));
        txt_design.setEnabled(false);
        getContentPane().add(txt_design, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 150, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setLabelFor(txt_status);
        jLabel7.setText("Status:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, 20));

        txt_status.setBackground(new java.awt.Color(153, 153, 153));
        txt_status.setForeground(new java.awt.Color(255, 255, 255));
        txt_status.setEnabled(false);
        getContentPane().add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 150, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setLabelFor(txt_doj);
        jLabel8.setText("Date Hired:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, 20));

        txt_doj.setBackground(new java.awt.Color(153, 153, 153));
        txt_doj.setForeground(new java.awt.Color(255, 255, 255));
        txt_doj.setEnabled(false);
        getContentPane().add(txt_doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 150, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setLabelFor(txt_job);
        jLabel9.setText("Job Title:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, 20));

        txt_job.setBackground(new java.awt.Color(153, 153, 153));
        txt_job.setForeground(new java.awt.Color(255, 255, 255));
        txt_job.setEnabled(false);
        getContentPane().add(txt_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 150, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("Basic Salary:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, 20));

        txt_salary.setBackground(new java.awt.Color(153, 153, 153));
        txt_salary.setForeground(new java.awt.Color(255, 255, 255));
        txt_salary.setEnabled(false);
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 150, 30));

        jDesktopPane1.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 190, 150));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setText("Logged in As:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        lbl_emp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_emp.setText("emp");
        getContentPane().add(lbl_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/deduc.png"))); // NOI18N
        jLabel19.setText("Employee Deduction Form");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 340, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/save_icon.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 90, 30));

        Clear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/erase-128.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 90, 30));

        Calculate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Calculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/cal_icon.png"))); // NOI18N
        Calculate.setText("Calculate");
        Calculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        getContentPane().add(Calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 190, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.lightGray));

        txt_deduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deductionActionPerformed(evt);
            }
        });

        r_amount.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        r_amount.setText("Amount");
        r_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amountActionPerformed(evt);
            }
        });

        r_percentage.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        r_percentage.setText("Percentage (%)");
        r_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentageActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setText("Updated Salary by:");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setText("Total Dedection:");

        lbl_total.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_total.setText("0.00");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setText("Salary After Deduction:");

        lbl_sal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_sal.setText("0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r_amount)
                        .addGap(47, 47, 47)
                        .addComponent(txt_deduction))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(r_percentage)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_total))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_sal)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(lbl_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_deduction, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(lbl_sal))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 520, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/mainmenu_bg.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 870, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

    private void txt_deductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_deductionActionPerformed

    private void txt_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_depActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_depActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased

        try {

            String sql = "SELECT * FROM staff_inform WHERE id=? ";

            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs = pst.executeQuery();

            String add1 = rs.getString("id");
            txt_id.setText(add1);

            String add2 = rs.getString("first_name");
            txt_firstname.setText(add2);

            String add3 = rs.getString("surname");
            txt_surname.setText(add3);

            String add4 = rs.getString("Dob");
            txt_dob.setText(add4);

            String add5 = rs.getString("Department");
            txt_dep.setText(add5);

            String add7 = rs.getString("Salary");
            txt_salary.setText(add7);

            String add8 = rs.getString("Status");
            txt_status.setText(add8);

            String add9 = rs.getString("Date_hired");
            txt_doj.setText(add9);

            String add10 = rs.getString("job_title");
            txt_job.setText(add10);

            String add17 = rs.getString("Designation");
            txt_design.setText(add17);

            byte[] image = rs.getBytes("Image");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH));
            img.setIcon(imageIcon);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Data");
        } finally {

            try {

                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void r_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentageActionPerformed
        r_percentage.setSelected(true);
        r_amount.setSelected(false);
        
        //r_amount.setEnabled(false);
        txt_deduction.setEnabled(false);
        txt_percentage.setEditable(true);
        txt_percentage.setEnabled(true);
        txt_deduction.setText("");
    }//GEN-LAST:event_r_percentageActionPerformed

    private void r_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amountActionPerformed
        r_amount.setSelected(true);
        r_percentage.setSelected(false);
        
        //r_percentage.setEnabled(false);
        txt_percentage.setEnabled(false);
        txt_deduction.setEditable(true);
        txt_deduction.setEnabled(true);
        txt_percentage.setText("");
    }//GEN-LAST:event_r_amountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?", "Add Record", JOptionPane.YES_NO_OPTION);
        if (p == 0) {

            String value3 = lbl_emp.getText();
            try {

                String sql = "INSERT INTO tbl_deductions (firstname,surname,salary,deduction_amount,emp_id,made_by) VALUES (?,?,?,?,?,'" + value3 + "')";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_firstname.getText());
                pst.setString(2, txt_surname.getText());
                pst.setString(3, txt_salary.getText());
                pst.setString(4, lbl_total.getText());
                pst.setString(5, txt_id.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "Data is saved successfully");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    rs.close();
                    pst.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
       
        int salary = Integer.parseInt(txt_salary.getText());

        if (r_percentage.isSelected() == true) {
            int percentage = Integer.parseInt(txt_percentage.getText());
            
            //calculate the total hours of overtime
            int total_percentage_deduction = salary / 100 * percentage;
            String x = String.valueOf(total_percentage_deduction);
            int sal = salary - total_percentage_deduction;
            lbl_total.setText(x);
            lbl_sal.setText(String.valueOf(sal));
        }
        if (r_amount.isSelected() == true) {
            int deduction = Integer.parseInt(txt_deduction.getText());
            
            //calculate the total hours of overtime
            int total_amount_deduction = salary - deduction;
            String s = String.valueOf(total_amount_deduction);

            lbl_sal.setText(s);
            lbl_total.setText(String.valueOf(deduction));
        }
    }//GEN-LAST:event_CalculateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        txt_id.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_dob.setText("");
        txt_dep.setText("");
        txt_status.setText("");
        txt_salary.setText("");
        txt_design.setText("");
        txt_job.setText("");
        txt_doj.setText("");
        lbl_total.setText("0.00");
        txt_percentage.setText("");
        txt_deduction.setText("");
        txt_search.setText("");
        lbl_sal.setText("0.00");
        img.setIcon(null);

    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(Deductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deductions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel Department;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_sal;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JRadioButton r_amount;
    private javax.swing.JRadioButton r_percentage;
    private javax.swing.JTextField txt_deduction;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_design;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_percentage;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
