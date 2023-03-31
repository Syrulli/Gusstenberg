package employee.payroll;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class empsalary extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public empsalary() {
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

        icon_search = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        lbl_firstname = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        lb_emp_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_surname = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        lbl_dob = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_dep = new javax.swing.JTextField();
        lbl_salaray = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_doj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_job = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_design = new javax.swing.JTextField();
        btn_genslip = new javax.swing.JButton();
        img_pane = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        title_genslip = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(898, 499));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/search.png"))); // NOI18N
        icon_search.setLabelFor(txt_search);
        getContentPane().add(icon_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 30, 30));

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 180, 30));

        lbl_firstname.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_firstname.setText("First Name:");
        getContentPane().add(lbl_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txt_firstname.setEnabled(false);
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, 30));

        lb_emp_id.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lb_emp_id.setLabelFor(txt_id);
        lb_emp_id.setText("Employee ID:");
        getContentPane().add(lb_emp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 80, -1));

        txt_id.setEnabled(false);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 170, 30));

        lbl_surname.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_surname.setText("Surname:");
        getContentPane().add(lbl_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        txt_surname.setEnabled(false);
        getContentPane().add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, 30));

        lbl_dob.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_dob.setText("Date of Birth:");
        getContentPane().add(lbl_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 80, -1));

        txt_dob.setEnabled(false);
        txt_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dobActionPerformed(evt);
            }
        });
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 170, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Department:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        txt_dep.setEnabled(false);
        getContentPane().add(txt_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 170, 30));

        lbl_salaray.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_salaray.setText("Salaray:");
        getContentPane().add(lbl_salaray, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        txt_salary.setEnabled(false);
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 170, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Status:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        txt_status.setEnabled(false);
        getContentPane().add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 170, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Date Hired:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        txt_doj.setEnabled(false);
        getContentPane().add(txt_doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 170, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Job Title:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        txt_job.setEnabled(false);
        getContentPane().add(txt_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 170, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Designation:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        txt_design.setEnabled(false);
        getContentPane().add(txt_design, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 170, 30));

        btn_genslip.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_genslip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/genslip.png"))); // NOI18N
        btn_genslip.setText("Generate Slip");
        btn_genslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genslipActionPerformed(evt);
            }
        });
        getContentPane().add(btn_genslip, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 180, 40));

        img_pane.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout img_paneLayout = new javax.swing.GroupLayout(img_pane);
        img_pane.setLayout(img_paneLayout);
        img_paneLayout.setHorizontalGroup(
            img_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(img_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        img_paneLayout.setVerticalGroup(
            img_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(img_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(img_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 180, 150));

        title_genslip.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        title_genslip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/genslip.png"))); // NOI18N
        title_genslip.setText("Generate Salary Slip");
        getContentPane().add(title_genslip, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 390, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/genslip_bg.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 284, 110, 220));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/genslip_bg.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 284, -1, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_genslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genslipActionPerformed
        String value = txt_firstname.getText();
        String value0 = txt_surname.getText();
        String value1 = txt_id.getText();    
        String value2 = txt_design.getText();
        String value3 = txt_dep.getText();

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(value + " " + value0 + "-Salary Slip" + ".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath();

            try {
                String sql = "SELECT * FROM tbl_deductions WHERE emp_id = '" + value1 + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                String val = rs.getString(5);
                String reason = rs.getString(6);
                rs.close();
                pst.close();                
                
                String sq = "SELECT * FROM tbl_allowance WHERE emp_id = '" + value1 + "'";
                pst = conn.prepareStatement(sq);
                rs = pst.executeQuery();

                int calcTotal = Integer.parseInt(txt_salary.getText());
                float x = Float.valueOf(rs.getString(9));
                int v = Integer.parseInt(val);
                float total = calcTotal + x - v;

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                myDocument.open();

                myDocument.add(new Paragraph("PAY SLIP", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add((new Paragraph("EMPLOYEE DETAILS", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD))));
                myDocument.add((new Paragraph("Name of Employee: " + value + " " + value0, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN))));
                myDocument.add((new Paragraph("Designation: " + value2, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN))));
                myDocument.add((new Paragraph("Department: " + value3, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN))));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("SALARY", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD)));
                myDocument.add(new Paragraph("Basic Salary: $" + calcTotal, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Overtime: " + rs.getString(2) + " Hours", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Medical: $" + rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Bonus: $" + rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Other: $" + rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("DEDUCTION", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD)));
                myDocument.add(new Paragraph("Deduction Details: " + reason, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Total Deductions : $" + val, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("TOTAL PAYMENT", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD)));
                myDocument.add(new Paragraph("Total Earnings: " + rs.getString(9), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Net Pay : " + total, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));

                myDocument.newPage();
                myDocument.close();
                JOptionPane.showMessageDialog(null, "Report was successfully generated");

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
    }//GEN-LAST:event_btn_genslipActionPerformed

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

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
            java.util.logging.Logger.getLogger(empsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empsalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_genslip;
    private javax.swing.JLabel icon_search;
    private javax.swing.JLabel img;
    private javax.swing.JDesktopPane img_pane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_emp_id;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_firstname;
    private javax.swing.JLabel lbl_salaray;
    private javax.swing.JLabel lbl_surname;
    private javax.swing.JLabel title_genslip;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_design;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
