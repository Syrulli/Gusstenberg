package employee.payroll;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.*;

public class addEmployee extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public addEmployee() {
        initComponents();
        conn = db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
                size.height / 2 - getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_doj = new javax.swing.JTextField();
        txt_design = new javax.swing.JTextField();
        txt_pc = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_job = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_dep = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add_employee = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        r_female = new javax.swing.JRadioButton();
        txt_search = new javax.swing.JTextField();
        r_male = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(740, 511));
        setName(""); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id.setBackground(new java.awt.Color(228, 228, 228));
        txt_id.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 145, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Surname:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Date of Birth:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        txt_email.setBackground(new java.awt.Color(228, 228, 228));
        txt_email.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 145, 30));

        txt_dob.setBackground(new java.awt.Color(228, 228, 228));
        txt_dob.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_dob.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 145, 30));

        txt_firstname.setBackground(new java.awt.Color(228, 228, 228));
        txt_firstname.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_firstname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 145, 30));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setText("Employee ID:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setText("First Name:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        txt_address.setBackground(new java.awt.Color(228, 228, 228));
        txt_address.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_address.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 145, 30));

        txt_tel.setBackground(new java.awt.Color(228, 228, 228));
        txt_tel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_tel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 145, 30));

        txt_surname.setBackground(new java.awt.Color(228, 228, 228));
        txt_surname.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_surname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 145, 30));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel37.setText("Email:");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel38.setText("Contact:");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel39.setText("Address 1:");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        txt_doj.setBackground(new java.awt.Color(228, 228, 228));
        txt_doj.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_doj.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_doj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dojActionPerformed(evt);
            }
        });
        getContentPane().add(txt_doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 145, 30));

        txt_design.setBackground(new java.awt.Color(228, 228, 228));
        txt_design.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_design.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txt_design, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 145, 30));

        txt_pc.setBackground(new java.awt.Color(228, 228, 228));
        txt_pc.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_pc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pcActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 145, 30));

        txt_status.setBackground(new java.awt.Color(228, 228, 228));
        txt_status.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_status.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_statusActionPerformed(evt);
            }
        });
        getContentPane().add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 145, 30));

        txt_job.setBackground(new java.awt.Color(228, 228, 228));
        txt_job.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_job.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobActionPerformed(evt);
            }
        });
        getContentPane().add(txt_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 145, 30));

        txt_salary.setBackground(new java.awt.Color(228, 228, 228));
        txt_salary.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_salary.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 145, 30));

        txt_dep.setBackground(new java.awt.Color(228, 228, 228));
        txt_dep.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_dep.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txt_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 145, 30));

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel45.setText("Date Hired:");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setText("Post Code:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, 30));

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel46.setText("Basic Salary:");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel47.setText("Job Title:");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel48.setText("Status:");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Department:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        add_employee.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        add_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/add_icon.png"))); // NOI18N
        add_employee.setText(" Add Employee");
        add_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employeeActionPerformed(evt);
            }
        });
        getContentPane().add(add_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 210, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Designation:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/erase-128.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 100, 30));

        jDesktopPane1.add(img);
        img.setBounds(10, 10, 190, 120);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 210, 140));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/search.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, -1, 30));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/attach.png"))); // NOI18N
        jButton3.setText("Attach");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 100, 30));

        r_female.setBackground(new java.awt.Color(242, 242, 242));
        r_female.setText("Female");
        r_female.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_femaleActionPerformed(evt);
            }
        });
        getContentPane().add(r_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, 30));

        txt_search.setBackground(new java.awt.Color(228, 228, 228));
        txt_search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 210, 30));

        r_male.setBackground(new java.awt.Color(242, 242, 242));
        r_male.setText("Male");
        r_male.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });
        getContentPane().add(r_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/addIcon.png"))); // NOI18N
        jLabel1.setText("Add Employee Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 44));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 226, -1, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/add_emp.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(765, 650));
        jLabel7.setMinimumSize(new java.awt.Dimension(765, 650));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 270, 560, 270));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/update_icon.png"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 100, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/del.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 100, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/add_emp.png"))); // NOI18N
        jLabel10.setText("Up");
        jLabel10.setMaximumSize(new java.awt.Dimension(765, 650));
        jLabel10.setMinimumSize(new java.awt.Dimension(765, 650));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 660, 310));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employeeActionPerformed

        int add_rd = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (add_rd == 0) {

            try {
                String sql = "INSERT INTO staff_inform "
                        + "(first_name,surname,Dob,Email,"
                        + "Telephone,Address,Department,"
                        + "Image,Salary,Gender,"
                        + "Post_code, Designation,Status,job_title,Date_hired) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_firstname.getText());
                pst.setString(2, txt_surname.getText());
                pst.setString(3, txt_dob.getText());
                pst.setString(4, txt_email.getText());
                pst.setString(5, txt_tel.getText());
                pst.setString(6, txt_address.getText());
                pst.setString(7, txt_dep.getText());
                pst.setBytes(8, person_image);
                pst.setString(9, txt_salary.getText());
                pst.setString(10, gender);
                pst.setString(11, txt_pc.getText());
                pst.setString(12, txt_design.getText());
                pst.setString(13, txt_status.getText());
                pst.setString(14, txt_job.getText());
                pst.setString(15, txt_doj.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "Data is saved successfully");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            try {
                // func automatic add Username & Password
                String sq = "SELECT * FROM staff_inform WHERE (id) NOT IN (SELECT id FROM Users)";
                pst = conn.prepareStatement(sq);
                rs = pst.executeQuery();

                while (rs.next()) {
                    String add1 = rs.getString("id");
                    String add2 = rs.getString("first_name");
                    String add3 = rs.getString("Dob");
                    String result = add3.replace("/", "");
                    String add4 = rs.getString("Department");
                    
                    String sql = "INSERT INTO Users(division,username,password,emp_id) VALUES ('"+add4+"','"+add2+"','"+result+"','"+add1+"')";
                    
                    pst = conn.prepareStatement(sql);
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(null, "User account has been created successfully!: " + "Username: "+add2+"Password: "+result);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                
            }finally{
                try {
                    rs.close();
                    pst.close();

                } catch (Exception e) {
                    //JOptionPane.showMessageDialog(null, e);  => RECOMMENT PAG NEED
                }
            }
        }
    }//GEN-LAST:event_add_employeeActionPerformed

    private void txt_pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pcActionPerformed

    private void txt_dojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dojActionPerformed

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salaryActionPerformed

    private void txt_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jobActionPerformed

    private void txt_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_statusActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txt_id.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_tel.setText("");
        txt_dob.setText("");
        txt_email.setText("");
        txt_address.setText("");
        txt_dep.setText("");
        txt_status.setText("");
        txt_salary.setText("");
        txt_pc.setText("");
        txt_job.setText("");
        txt_doj.setText("");
        txt_design.setText("");
        img.setIcon(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setIcon(imageIcon);

        try {

            File image = new File(filename);
            FileInputStream fix = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            byte[] buf = new byte[1024];

            for (int number; (number = fix.read(buf)) != -1;) {
                bos.write(buf, 0, number);
            }
            person_image = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        try {

            String sql = "SELECT * FROM staff_inform WHERE id=?";

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

            String add5 = rs.getString("Email");
            txt_email.setText(add5);

            String add6 = rs.getString("Telephone");
            txt_tel.setText(add6);

            String add7 = rs.getString("Address");
            txt_address.setText(add7);

            String add8 = rs.getString("Department");
            txt_dep.setText(add8);

            String add9 = rs.getString("Salary");
            txt_salary.setText(add9);

            String add10 = rs.getString("Post_code");
            txt_pc.setText(add10);

            String add11 = rs.getString("Status");
            txt_status.setText(add11);

            String add12 = rs.getString("Date_hired");
            txt_doj.setText(add12);

            String add13 = rs.getString("job_title");
            txt_job.setText(add13);

            String add14 = rs.getString("Designation");
            txt_design.setText(add14);

            byte[] image = rs.getBytes("Image");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH));
            img.setIcon(imageIcon);

        } catch (Exception e) {

        } finally {

            try {
                rs.close();
                pst.close();
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_maleActionPerformed
        gender = "Male";
        r_male.setSelected(true);
        r_female.setSelected(false);
    }//GEN-LAST:event_r_maleActionPerformed

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_femaleActionPerformed
        gender = "Female";
        r_female.setSelected(true);
        r_male.setSelected(false);
    }//GEN-LAST:event_r_femaleActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int delete_rd = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (delete_rd == 0) {

            try {
                String sql = "DELETE FROM staff_inform WHERE id=? ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_id.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Deleted");
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int update_rd = JOptionPane.showConfirmDialog(null, "Are you sure you want to update record?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (update_rd == 0) {

            try {
                String value1 = txt_firstname.getText();
                String value2 = txt_surname.getText();
                String value3 = txt_dob.getText();
                String value4 = txt_id.getText();
                String value5 = txt_email.getText();
                String value6 = txt_tel.getText();
                String value7 = txt_address.getText();
                String value8 = txt_dep.getText();
                String value9 = txt_pc.getText();
                String value10 = txt_design.getText();
                String value11 = txt_status.getText();
                String value12 = txt_salary.getText();
                String value13 = txt_job.getText();
                String value14 = txt_doj.getText();

                String sql = "UPDATE staff_inform SET id='" + value4 + "',first_name='" + value1 + "', surname='" + value2 + "', "
                        + "Dob='" + value3 + "',Email='" + value5 + "',Telephone='" + value6 + "',"
                        + "Address='" + value7 + "',Department='" + value8 + "', Post_code ='" + value9 + "', "
                        + "Designation ='" + value10 + "', Status ='" + value11 + "', Salary ='" + value12 + "', job_title ='" + value13 + "', Date_Hired ='" + value14 + "'   "
                        + " WHERE id='" + value4 + "' ";

                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");

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
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_employee;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_design;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_pc;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables

    private String gender;
    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;

}
