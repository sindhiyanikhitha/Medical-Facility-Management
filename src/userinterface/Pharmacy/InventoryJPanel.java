/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Pharmacy;

import Business.DiseaseList.DiseaseList;
import Business.Enterprise.Distributor;
import Business.Enterprise.SupplierEnterprise;
import Business.Inventory.InventoryItem;
import Business.Network.StateNetwork;
import Business.Order.OrderRequest;
import Business.Organization.PharmacyOrg;
import Business.UserAccount.UserAccount;
import Business.VaccineDirectory.Vaccine;
import Business.VaccineDirectory.VaccineList;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class InventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    VaccineList vaccineList;
    DiseaseList diseaseList;
    List<SupplierEnterprise> supplierEnterpriseList;
    PharmacyOrg pharmacyOrg;
    StateNetwork network;
    public InventoryJPanel(JPanel userProcessContainer, UserAccount account, VaccineList vaccineList, DiseaseList diseaseList, StateNetwork network, List<SupplierEnterprise> supplierEnterpriseList, PharmacyOrg pharmacyOrg) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.vaccineList = vaccineList;
        this.diseaseList = diseaseList;
        this.supplierEnterpriseList = supplierEnterpriseList;
        this.pharmacyOrg = pharmacyOrg;
        this.network = network;
        this.populateTable();
        this.popComboBox();
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
        inventoryTable = new javax.swing.JTable();
        vaccineRequestButton = new javax.swing.JButton();
        quantityLabel = new javax.swing.JLabel();
        qtySpinner = new javax.swing.JSpinner();
        vaccineLabel = new javax.swing.JLabel();
        vaccineCombo = new javax.swing.JComboBox();
        pharmacyLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl No", "Vaccine Name", "Quantity Available"
            }
        ));
        jScrollPane1.setViewportView(inventoryTable);

        vaccineRequestButton.setBackground(new java.awt.Color(153, 153, 153));
        vaccineRequestButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vaccineRequestButton.setText("Raise Request");
        vaccineRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineRequestButtonActionPerformed(evt);
            }
        });

        quantityLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quantityLabel.setText("Quantity:");

        vaccineLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vaccineLabel.setText("Vaccine:");

        pharmacyLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pharmacyLabel.setText("Pharmacy Inventory");

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
                        .addGap(316, 316, 316)
                        .addComponent(pharmacyLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(vaccineRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(299, 299, 299)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(vaccineLabel)
                                .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(vaccineCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qtySpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pharmacyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineLabel)
                    .addComponent(vaccineCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(vaccineRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void popComboBox(){
        if(vaccineList != null){
            for(Vaccine vaccine: vaccineList.getVaccineList()){
                vaccineCombo.addItem(vaccine);
            }
        }
    }
    public void populateTable(){
        DefaultTableModel defaultTableModel = (DefaultTableModel)inventoryTable.getModel();
        defaultTableModel.setRowCount(0);
        if(pharmacyOrg.getInventoryDirectory()!= null){
            for(InventoryItem inventoryItem : pharmacyOrg.getInventoryDirectory().getInventoryList()){
                Object[] row = new Object[3];
                row[0] = inventoryItem.getItemId();
                row[1] = inventoryItem;
                row[2] = inventoryItem.getQuantity();
                defaultTableModel.addRow(row);
            }
        }
    }
    
    private void vaccineRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineRequestButtonActionPerformed
        Distributor receiverEnterprise = null;
        if(qtySpinner.getValue().toString().matches("[A-Za-z]+")){
            JOptionPane.showMessageDialog(null, "Please enter valid quantity.");
            return;
        }
        int qty = (int)qtySpinner.getValue();
        Vaccine vaccine = (Vaccine) vaccineCombo.getSelectedItem();
        if(qty <= 0){
            JOptionPane.showMessageDialog(null, "Please enter valid quantity.");
            return;
        }
        if(this.network.getEnterpriseList().getDistributorEnterpriseList() != null && this.network.getEnterpriseList().getDistributorEnterpriseList().size() > 0){
            receiverEnterprise = this.network.getEnterpriseList().getDistributorEnterpriseList().get(0);
        }
        if(receiverEnterprise != null){
            OrderRequest request = receiverEnterprise.getOrderQueue().addOrderRequest();
            request.setQuantity(qty);
            request.setVaccine(vaccine);
            request.setOrderSender(account);
            OrderRequest newOrderRequest = request.createAndGetNewOrderRequest();
            newOrderRequest.setOrderSender(account);
            newOrderRequest.setOrderStatus("Request sent to distributor");
            OrderRequest userOrderRequest1 = account.getOrderQueue().addOrderRequest();
            userOrderRequest1.setQuantity(qty);
            userOrderRequest1.setVaccine(vaccine);
            userOrderRequest1.setOrderSender(account);
            userOrderRequest1.setOrderStatus("Request sent to distributor!");
            request.setOrderStatus("Request sent to distributor!");
            JOptionPane.showMessageDialog(null, "Request message sent");
        }
        else{
            JOptionPane.showMessageDialog(null, "Distributor not available");
        }
    }//GEN-LAST:event_vaccineRequestButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pharmacyLabel;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JComboBox vaccineCombo;
    private javax.swing.JLabel vaccineLabel;
    private javax.swing.JButton vaccineRequestButton;
    // End of variables declaration//GEN-END:variables
}