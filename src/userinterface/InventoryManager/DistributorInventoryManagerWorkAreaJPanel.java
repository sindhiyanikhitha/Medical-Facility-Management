/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryManager;

import Business.EcoSystem;
import Business.Enterprise.Distributor;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.InventoryManagementOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class DistributorInventoryManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DistributorInventoryManagerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    InventoryManagementOrg inventoryManagementOrg;
    Distributor distributor;
    StateNetwork stateNetwork;
    CountryNetwork countryNetwork;
    EcoSystem ecoSystem;
    
    public DistributorInventoryManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization inventoryManagementOrg,
                                                     Distributor distributor, StateNetwork stateNetwork, CountryNetwork countryNetwork, EcoSystem ecoSystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.inventoryManagementOrg = (InventoryManagementOrg) inventoryManagementOrg;
        this.distributor = distributor;
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

        distributorLabel = new javax.swing.JLabel();
        viewInventoryBtn = new javax.swing.JButton();
        processOrderRequestsBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        distributorLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        distributorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distributorLabel.setText("Distributor Work Area");
        add(distributorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 580, 41));

        viewInventoryBtn.setBackground(new java.awt.Color(153, 153, 153));
        viewInventoryBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewInventoryBtn.setText("View Inventory");
        viewInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInventoryBtnActionPerformed(evt);
            }
        });
        add(viewInventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 268, 46));

        processOrderRequestsBtn.setBackground(new java.awt.Color(153, 153, 153));
        processOrderRequestsBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        processOrderRequestsBtn.setText("Process Order Requests");
        processOrderRequestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processOrderRequestsBtnActionPerformed(evt);
            }
        });
        add(processOrderRequestsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 290, 46));
    }// </editor-fold>//GEN-END:initComponents

    private void viewInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInventoryBtnActionPerformed
        // TODO add your handling code here:
        ViewDistributorInventoryJPanel viewDistributorInventoryJPanel = new ViewDistributorInventoryJPanel(userProcessContainer, userAccount, inventoryManagementOrg.getInventoryDirectory(), inventoryManagementOrg, ecoSystem.getSupplierEnterprisesFromAllCountries(), stateNetwork, countryNetwork,this.ecoSystem);
        userProcessContainer.add("ViewDistributorInventoryJPanel", viewDistributorInventoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_viewInventoryBtnActionPerformed

    private void processOrderRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processOrderRequestsBtnActionPerformed
        // TODO add your handling code here:
        ProcessDistributorOrdersJPanel processDistributorOrdersJPanel = new ProcessDistributorOrdersJPanel(userProcessContainer, userAccount, inventoryManagementOrg, distributor, stateNetwork, ecoSystem.getAllDistributorEnterpriseOrderRequestFromAllCountries());
        userProcessContainer.add("ProcessDistributorOrdersJPanel", processDistributorOrdersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processOrderRequestsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel distributorLabel;
    private javax.swing.JButton processOrderRequestsBtn;
    private javax.swing.JButton viewInventoryBtn;
    // End of variables declaration//GEN-END:variables
}