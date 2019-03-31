/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateHealthDeptManager;

import Business.EcoSystem;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.SupplierOrg;
import Business.UserAccount.UserAccount;
import Business.VaccineDirectory.VaccineList;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class ManageSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSupplierJPanel
     */
    JPanel userProcessContainer;
    VaccineList vaccineList;
    SupplierOrg supplierOrg;
    SupplierEnterprise supplier;
    UserAccount account;
    StateNetwork stateNetwork;
    CountryNetwork countryNetwork;
    EcoSystem ecoSystem;
    public ManageSupplierJPanel(JPanel userProcessContainer, UserAccount account, VaccineList vaccineList, SupplierOrg supplierOrg, SupplierEnterprise supplier, StateNetwork stateNetwork, CountryNetwork countryNetwork, EcoSystem ecoSystem) {
        initComponents();
        this. userProcessContainer = userProcessContainer;
        this.vaccineList = vaccineList;
        this.supplierOrg = supplierOrg;
        this.supplier = supplier;
        this.account = account;
        this.stateNetwork = stateNetwork;
        this.countryNetwork = countryNetwork;
        this.ecoSystem = ecoSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supplierLabel = new javax.swing.JLabel();
        orderBtn = new javax.swing.JButton();
        inventoryBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));

        supplierLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        supplierLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supplierLabel.setText("Manage Supplier");

        orderBtn.setBackground(new java.awt.Color(153, 153, 153));
        orderBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        orderBtn.setText("Manage Order");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        inventoryBtn.setBackground(new java.awt.Color(153, 153, 153));
        inventoryBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inventoryBtn.setText("Manage Inventory");
        inventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryBtnActionPerformed(evt);
            }
        });

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(supplierLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inventoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(supplierLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        ManageSupplierOrderJPanel manageSupplierOrderJPanel = new ManageSupplierOrderJPanel(userProcessContainer, account, supplierOrg, supplier, stateNetwork, countryNetwork, this.ecoSystem);
        userProcessContainer.add("ManageSupplierOrderJPanel", manageSupplierOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_orderBtnActionPerformed

    private void inventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryBtnActionPerformed
        ManageSupplierInventoryJPanel manageSupplierInventoryJPanel = new ManageSupplierInventoryJPanel(userProcessContainer, account, vaccineList, supplierOrg, supplier);
        userProcessContainer.add("ManageSupplierInventoryJPanel", manageSupplierInventoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_inventoryBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JButton orderBtn;
    private javax.swing.JLabel supplierLabel;
    // End of variables declaration//GEN-END:variables
}