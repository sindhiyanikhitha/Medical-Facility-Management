/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateHealthDeptManager;

import Business.Enterprise.SupplierEnterprise;
import Business.Inventory.InventoryItem;
import Business.Organization.SupplierOrg;
import Business.UserAccount.UserAccount;
import Business.VaccineDirectory.VaccineList;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class ManageSupplierInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewSuppliersJPanel
     */
    JPanel userProcessContainer;
    VaccineList vaccineList;
    SupplierOrg supplierOrg;
    SupplierEnterprise supplierEnterprise;
    UserAccount account;
    public ManageSupplierInventoryJPanel(JPanel userProcessContainer, UserAccount account, VaccineList vaccineList, SupplierOrg supplierOrg, SupplierEnterprise supplierEnterprise) {
        initComponents();
        this. userProcessContainer = userProcessContainer;
        this.vaccineList = vaccineList;
        this.supplierOrg = supplierOrg;
        this.supplierEnterprise = supplierEnterprise;
        this.account = account;
        System.out.println("Print Out:");
        System.out.println(this.supplierOrg.getInventoryDirectory());
        populateJTable();
    }
    
    public void populateJTable(){
        DefaultTableModel model = (DefaultTableModel) supplierInventoryTable.getModel();
        model.setRowCount(0);
        int i=0;
        for (InventoryItem inventory: this.supplierOrg.getInventoryDirectory()){
            Object[] row = new Object[3];
            row[0] = ++i;
            row[1] = inventory;
            row[2] = inventory.getQuantity();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        supplierInventoryTable = new javax.swing.JTable();
        supplierLabel = new javax.swing.JLabel();
        addInventoryItemBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supplierInventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl No", "Vaccine Name"
            }
        ));
        jScrollPane1.setViewportView(supplierInventoryTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 600, 196));

        supplierLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        supplierLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supplierLabel.setText("Manage Supplier Inventory");
        add(supplierLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 580, 41));

        addInventoryItemBtn.setBackground(new java.awt.Color(153, 153, 153));
        addInventoryItemBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addInventoryItemBtn.setText("Add Item");
        addInventoryItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInventoryItemBtnActionPerformed(evt);
            }
        });
        add(addInventoryItemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 200, 50));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 110, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void addInventoryItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInventoryItemBtnActionPerformed
        AddInventoryItemJPanel addInventoryItemJPanel = new AddInventoryItemJPanel(userProcessContainer, account, vaccineList, this.supplierOrg);
        userProcessContainer.add("AddInventoryItemJPanel", addInventoryItemJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addInventoryItemBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInventoryItemBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable supplierInventoryTable;
    private javax.swing.JLabel supplierLabel;
    // End of variables declaration//GEN-END:variables
}
