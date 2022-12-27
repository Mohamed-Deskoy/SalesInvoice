/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sales.view;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import sales.controller.Controller;
import sales.model.InvoiceD;
import sales.model.InvoicesTableMod;

/**
 *
 * @author HP
 */
public class InvoiceFrameDec extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceFrameDec
     */
    public InvoiceFrameDec() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        invoiceTable.getSelectionModel().addListSelectionListener(controller);
        invoiceTable.setModel(getInvoicesTableModel());
        createInvBtn = new javax.swing.JButton();
        createInvBtn.addActionListener(controller);
        deleteInvoBtn = new javax.swing.JButton();
        deleteInvoBtn.addActionListener(controller);
        InvoiceNumjLabel1 = new javax.swing.JLabel();
        invoiceDatejLabel = new javax.swing.JLabel();
        cusName = new javax.swing.JLabel();
        invoiceTotal = new javax.swing.JLabel();
        InvoiceNumLab = new javax.swing.JLabel();
        InvoiceDLab = new javax.swing.JLabel();
        CusLabel = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        createlineBtn = new javax.swing.JButton();
        createlineBtn.addActionListener(controller);
        deletelineBtn = new javax.swing.JButton();
        deletelineBtn.addActionListener(controller);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadFileMenu = new javax.swing.JMenuItem();
        LoadFileMenu.addActionListener(controller);
        SaveFileMenu = new javax.swing.JMenuItem();
        SaveFileMenu.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoiceTable);

        createInvBtn.setText("Create New Invoice");
        createInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvBtnActionPerformed(evt);
            }
        });

        deleteInvoBtn.setText("Delete Invoice");
        deleteInvoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoBtnActionPerformed(evt);
            }
        });

        InvoiceNumjLabel1.setText("Invoice Number");

        invoiceDatejLabel.setText("Invoice Date");

        cusName.setText("Customer Name");

        invoiceTotal.setText("Invoice Total");

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(lineTable);

        createlineBtn.setText("Create Item");
        createlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createlineBtnActionPerformed(evt);
            }
        });

        deletelineBtn.setText("Delete Item");
        deletelineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletelineBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        LoadFileMenu.setText("LoadFile");
        jMenu1.add(LoadFileMenu);

        SaveFileMenu.setText("SaveDate");
        SaveFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileMenuActionPerformed(evt);
            }
        });
        jMenu1.add(SaveFileMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(createInvBtn)
                        .addGap(91, 91, 91)
                        .addComponent(deleteInvoBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cusName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InvoiceNumjLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(invoiceDatejLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InvoiceNumLab, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(InvoiceDLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(createlineBtn)
                        .addGap(94, 94, 94)
                        .addComponent(deletelineBtn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceNumjLabel1)
                            .addComponent(InvoiceNumLab))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceDatejLabel)
                            .addComponent(InvoiceDLab))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusName)
                            .addComponent(CusLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceTotal)
                            .addComponent(invoiceTotalLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createInvBtn)
                    .addComponent(deleteInvoBtn)
                    .addComponent(createlineBtn)
                    .addComponent(deletelineBtn))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createInvBtnActionPerformed

    private void SaveFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveFileMenuActionPerformed

    private void deletelineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletelineBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletelineBtnActionPerformed

    private void deleteInvoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvoBtnActionPerformed

    private void createlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createlineBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createlineBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceFrameDec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrameDec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrameDec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrameDec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrameDec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CusLabel;
    private javax.swing.JLabel InvoiceDLab;
    private javax.swing.JLabel InvoiceNumLab;
    private javax.swing.JLabel InvoiceNumjLabel1;
    private javax.swing.JMenuItem LoadFileMenu;
    private javax.swing.JMenuItem SaveFileMenu;
    private javax.swing.JButton createInvBtn;
    private javax.swing.JButton createlineBtn;
    private javax.swing.JLabel cusName;
    private javax.swing.JButton deleteInvoBtn;
    private javax.swing.JButton deletelineBtn;
    private javax.swing.JLabel invoiceDatejLabel;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel invoiceTotal;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTable;
    // End of variables declaration//GEN-END:variables
private ArrayList<InvoiceD> invoices;
    private Controller controller = new Controller(this);
    private InvoicesTableMod invoicesTableModel;

    public ArrayList<InvoiceD> getInvoices() {
        if (invoices == null) {
            invoices = new ArrayList<>();
        }
        return invoices;
    }

    public void setInvoices(ArrayList<InvoiceD> invoices) {
        this.invoices = invoices;
    }

    public JLabel getCusLabel() {
        return CusLabel;
    }

    public void setCusLabel(JLabel CusLabel) {
        this.CusLabel = CusLabel;
    }

    public JLabel getInvoiceDLab() {
        return InvoiceDLab;
    }

    public void setInvoiceDLab(JLabel InvoiceDLab) {
        this.InvoiceDLab = InvoiceDLab;
    }

    public JLabel getInvoiceNumLab() {
        return InvoiceNumLab;
    }

    public void setInvoiceNumLab(JLabel InvoiceNumLab) {
        this.InvoiceNumLab = InvoiceNumLab;
    }

    public JLabel getInvoiceNumjLabel1() {
        return InvoiceNumjLabel1;
    }

    public void setInvoiceNumjLabel1(JLabel InvoiceNumjLabel1) {
        this.InvoiceNumjLabel1 = InvoiceNumjLabel1;
    }

    public JMenuItem getLoadFileMenu() {
        return LoadFileMenu;
    }

    public void setLoadFileMenu(JMenuItem LoadFileMenu) {
        this.LoadFileMenu = LoadFileMenu;
    }

    public JMenuItem getSaveFileMenu() {
        return SaveFileMenu;
    }

    public void setSaveFileMenu(JMenuItem SaveFileMenu) {
        this.SaveFileMenu = SaveFileMenu;
    }

    public JButton getCreateInvBtn() {
        return createInvBtn;
    }

    public void setCreateInvBtn(JButton createInvBtn) {
        this.createInvBtn = createInvBtn;
    }

    public JButton getCreatelineBtn() {
        return createlineBtn;
    }

    public void setCreatelineBtn(JButton createlineBtn) {
        this.createlineBtn = createlineBtn;
    }

    public JLabel getCusName() {
        return cusName;
    }

    public void setCusName(JLabel cusName) {
        this.cusName = cusName;
    }

    public JButton getDeleteInvoBtn() {
        return deleteInvoBtn;
    }

    public void setDeleteInvoBtn(JButton deleteInvoBtn) {
        this.deleteInvoBtn = deleteInvoBtn;
    }

    public JButton getDeletelineBtn() {
        return deletelineBtn;
    }

    public void setDeletelineBtn(JButton deletelineBtn) {
        this.deletelineBtn = deletelineBtn;
    }

    public JLabel getInvoiceDatejLabel() {
        return invoiceDatejLabel;
    }

    public void setInvoiceDatejLabel(JLabel invoiceDatejLabel) {
        this.invoiceDatejLabel = invoiceDatejLabel;
    }

    public JTable getInvoiceTable() {
        return invoiceTable;
    }

    public void setInvoiceTable(JTable invoiceTable) {
        this.invoiceTable = invoiceTable;
    }

    public JLabel getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(JLabel invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public JLabel getjLabel8() {
        return invoiceTotalLabel;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.invoiceTotalLabel = jLabel8;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTable getLineTable() {
        return lineTable;
    }

    public void setLineTable(JTable lineTable) {
        this.lineTable = lineTable;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public InvoicesTableMod getInvoicesTableModel() {
        if (invoicesTableModel == null) {
            invoicesTableModel = new InvoicesTableMod(getInvoices());
        }
        return invoicesTableModel;
    }

    public void setInvoicesTableModel(InvoicesTableMod invoicesTableModel) {
        this.invoicesTableModel = invoicesTableModel;
    }

    public int getNextInvoiceNum() {
        int num = 0;

        for (InvoiceD invoice : getInvoices()) {
            if (invoice.getNumber() > num) {
                num = invoice.getNumber();
            }
        }

        return ++num;
    }

}
