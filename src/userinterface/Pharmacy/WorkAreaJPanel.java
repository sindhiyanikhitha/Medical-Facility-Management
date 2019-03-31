/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Pharmacy;

import Business.EcoSystem;
import Business.Enterprise.Pharmacy;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.PharmacyOrg;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class WorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    PharmacyOrg pharmacyOrg;
    Pharmacy pharmacy;
    StateNetwork stateNetwork;
    CountryNetwork countryNetwork;
    EcoSystem ecoSystem;
    public WorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, PharmacyOrg pharmacyOrg, Pharmacy pharmacy, StateNetwork stateNetwork, CountryNetwork countryNetwork, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.pharmacyOrg = pharmacyOrg;
        this.pharmacy = pharmacy;
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

        pharmacyLabel = new javax.swing.JLabel();
        manageInventoryBtn = new javax.swing.JButton();
        manageIncomingOrderBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));

        pharmacyLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pharmacyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pharmacyLabel.setText("Pharmacy WorkArea");

        manageInventoryBtn.setBackground(new java.awt.Color(153, 153, 153));
        manageInventoryBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageInventoryBtn.setText("Manage Inventory");
        manageInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInventoryBtnActionPerformed(evt);
            }
        });

        manageIncomingOrderBtn.setBackground(new java.awt.Color(153, 153, 153));
        manageIncomingOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageIncomingOrderBtn.setText("Manage Incoming Order");
        manageIncomingOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageIncomingOrderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageInventoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageIncomingOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(353, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pharmacyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(pharmacyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(manageIncomingOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(manageInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageIncomingOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageIncomingOrderBtnActionPerformed
        IncomingOrderJPanel incomingOrderJPanel = new IncomingOrderJPanel(userProcessContainer,
                userAccount, pharmacyOrg, pharmacy, stateNetwork, countryNetwork, ecoSystem);
        userProcessContainer.add("IncomingOrderJPanel", incomingOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageIncomingOrderBtnActionPerformed

    private void manageInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInventoryBtnActionPerformed
        InventoryJPanel inventoryJPanel = new InventoryJPanel(this.userProcessContainer, userAccount, ecoSystem.getVaccineList(), ecoSystem.getDiseaseList(), stateNetwork, ecoSystem.getSupplierEnterprisesFromAllCountries(), pharmacyOrg);
        userProcessContainer.add("InventoryJPanel", inventoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageInventoryBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageIncomingOrderBtn;
    private javax.swing.JButton manageInventoryBtn;
    private javax.swing.JLabel pharmacyLabel;
    // End of variables declaration//GEN-END:variables
}