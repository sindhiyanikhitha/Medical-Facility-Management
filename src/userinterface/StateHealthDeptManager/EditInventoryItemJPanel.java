/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateHealthDeptManager;

import Business.SupplierList.VaccineInventory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class EditInventoryItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditInventoryItemJPanel
     */
    JPanel userProcessContainer;
    VaccineInventory vaccineInventory;
    public EditInventoryItemJPanel(JPanel userProcessContainer,VaccineInventory vaccineInventory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.vaccineInventory = vaccineInventory;
        vaccineName.setText(vaccineInventory.toString());
        quantity.setValue(vaccineInventory.getQuantity());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inventoryLabel = new javax.swing.JLabel();
        vaccineLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        vaccineName = new javax.swing.JLabel();
        quantity = new javax.swing.JSpinner();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inventoryLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        inventoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventoryLabel.setText("Edit Inventory Item");
        add(inventoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 580, 41));

        vaccineLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        vaccineLabel.setText("Vaccine Name:");
        add(vaccineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 105, 170, 40));

        quantityLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        quantityLabel.setText("Quantity Available:");
        add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 230, 50));

        saveBtn.setBackground(new java.awt.Color(153, 153, 153));
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 150, 60));

        vaccineName.setText("<Vaccine Name>");
        add(vaccineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 230, 50));

        quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));
        add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 220, 40));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 110, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        vaccineInventory.setQuantity((int) quantity.getValue());
        JOptionPane.showMessageDialog(null,"Inventory Item has been modified successfully !");
       
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel inventoryLabel;
    private javax.swing.JSpinner quantity;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel vaccineLabel;
    private javax.swing.JLabel vaccineName;
    // End of variables declaration//GEN-END:variables
}
