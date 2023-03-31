package employee.payroll;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Toolkit;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainMenu extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public MainMenu() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
                size.height / 2 - getHeight() / 2);
        lbl_emp.setText(String.valueOf(Emp.empname).toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        btn_emp_manager = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_allowance = new javax.swing.JButton();
        btn_update_salary = new javax.swing.JButton();
        btn_deduc = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        emp_rp = new javax.swing.JMenuItem();
        emp_total_allowance = new javax.swing.JMenuItem();
        emp_total_deduc = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        audit_trial_submenu = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(733, 503));
        setName("mainmenu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(733, 503));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/logout.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Logged In As:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        lbl_emp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_emp.setText("emp");
        getContentPane().add(lbl_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        btn_emp_manager.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_emp_manager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/emp_icon.png"))); // NOI18N
        btn_emp_manager.setText("Employee Manager");
        btn_emp_manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emp_managerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_emp_manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 160, 40));

        btn_search.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/search.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 130, 40));

        btn_allowance.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_allowance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/allowance.png"))); // NOI18N
        btn_allowance.setText("Allowance");
        btn_allowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_allowanceActionPerformed(evt);
            }
        });
        getContentPane().add(btn_allowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 130, 40));

        btn_update_salary.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_update_salary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/update_icon.png"))); // NOI18N
        btn_update_salary.setText("Update Salary");
        btn_update_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 160, 40));

        btn_deduc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_deduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/deduc.png"))); // NOI18N
        btn_deduc.setText("Deduction");
        btn_deduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deducActionPerformed(evt);
            }
        });
        getContentPane().add(btn_deduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 130, 40));

        jButton7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/payment.png"))); // NOI18N
        jButton7.setText("Payment");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/mainmenu_bg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 630));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 503));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 503));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 730, 500));

        jMenu4.setText("Employee");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Reports");

        emp_rp.setText("Employees RP");
        emp_rp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_rpActionPerformed(evt);
            }
        });
        jMenu5.add(emp_rp);

        emp_total_allowance.setText("Employee Total Allowance RP");
        emp_total_allowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_total_allowanceActionPerformed(evt);
            }
        });
        jMenu5.add(emp_total_allowance);

        emp_total_deduc.setText("Employee Total Deduction RP");
        emp_total_deduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_total_deducActionPerformed(evt);
            }
        });
        jMenu5.add(emp_total_deduc);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Audit");

        audit_trial_submenu.setText("Audit Trial");
        audit_trial_submenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audit_trial_submenuActionPerformed(evt);
            }
        });
        jMenu6.add(audit_trial_submenu);

        jMenuBar2.add(jMenu6);

        jMenu7.setText("About");
        jMenuBar2.add(jMenu7);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login x = new login();
        x.setVisible(true);
        this.dispose();
        
        try{
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String values = dateString;


             int value = Emp.empId;
             String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged Out')";
             pst=conn.prepareStatement(reg);
             pst.execute();
             this.dispose();
        
        }catch(Exception e){
        
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
           
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void emp_total_allowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_total_allowanceActionPerformed

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employee Allowance Report.pdf"));

        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult == JFileChooser.APPROVE_OPTION) {

            String filePath = dialog.getSelectedFile().getPath();

            try {

                String sql = "SELECT * FROM tbl_allowance";

                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(11);
                myDocument.open();

                float[] columnWidths = new float[]{3, 7, 7, 5, 5, 9, 6, 5, 8, 8, 8};
                table.setWidths(columnWidths);

                table.setWidthPercentage(100);

                myDocument.add(new Paragraph("Employees Allowance List", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Overtime", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Medical", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Bonus", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Other", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Employee ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Rate", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Allowance", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("First Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Surname", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));

                while (rs.next()) {

                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(9), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(11), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                }

                myDocument.add(table);
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
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
    }//GEN-LAST:event_emp_total_allowanceActionPerformed

    private void emp_rpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_rpActionPerformed

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employees Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath();

            try {
                String sql = "SELECT * FROM staff_inform";

                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(13);
                myDocument.open();

                float[] columnWidths = new float[]{3, 8, 7, 5, 5, 9, 8, 9, 6, 6, 6, 8, 8};
                table.setWidths(columnWidths);

                table.setWidthPercentage(100); // set table width to 100 only nigga

                myDocument.add(new Paragraph("Employees List", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("First Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Surname", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Date of Birth", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Email", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Telephone", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Address", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Department", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Gender", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Status", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Date Hired", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Job Title", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));

                while (rs.next()) {
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(11), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(16), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(17), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(18), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                }

                myDocument.add(table);
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
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
    }//GEN-LAST:event_emp_rpActionPerformed

    private void emp_total_deducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_total_deducActionPerformed
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employee Deduction Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath();

            try {

                String sql = "SELECT * FROM tbl_deductions";

                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(8);
                myDocument.open();

                float[] columnWidths = new float[]{3, 7, 7, 5, 5, 9, 6, 5};
                table.setWidths(columnWidths);

                table.setWidthPercentage(100); //set table width to 100%

                myDocument.add(new Paragraph("Employees Deduction List", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("First Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Surname", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Deduction Amount", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Deduction Reason", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Employee ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Created By", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));

                while (rs.next()) {
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));

                }

                myDocument.add(table);
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.close();
                JOptionPane.showMessageDialog(null, "Report was successfully generated");

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);

            }finally{
                try {
                    rs.close();
                    pst.close();
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_emp_total_deducActionPerformed

    private void btn_emp_managerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emp_managerActionPerformed
       addEmployee x = new addEmployee();
       x.setVisible(true);
    }//GEN-LAST:event_btn_emp_managerActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        addEmployee x = new addEmployee();
         x.setVisible(true);
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_allowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_allowanceActionPerformed
       Allowance x = new Allowance();
       x.setVisible(true);
    }//GEN-LAST:event_btn_allowanceActionPerformed

    private void btn_update_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_salaryActionPerformed
       updateSalary x = new updateSalary();
       x.setVisible(true);
    }//GEN-LAST:event_btn_update_salaryActionPerformed

    private void btn_deducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deducActionPerformed
       Deductions x = new Deductions();
       x.setVisible(true);
    }//GEN-LAST:event_btn_deducActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       empsalary x = new empsalary();
       x.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void audit_trial_submenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audit_trial_submenuActionPerformed
       audit x = new audit();
       x.setVisible(true);
    }//GEN-LAST:event_audit_trial_submenuActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem audit_trial_submenu;
    private javax.swing.JButton btn_allowance;
    private javax.swing.JButton btn_deduc;
    private javax.swing.JButton btn_emp_manager;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update_salary;
    private javax.swing.JMenuItem emp_rp;
    private javax.swing.JMenuItem emp_total_allowance;
    private javax.swing.JMenuItem emp_total_deduc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_emp;
    // End of variables declaration//GEN-END:variables
}
