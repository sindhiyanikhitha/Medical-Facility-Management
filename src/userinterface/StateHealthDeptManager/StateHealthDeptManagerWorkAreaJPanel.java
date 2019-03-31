/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateHealthDeptManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.StateHealthDept;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.SHDOrg;
import Business.UserAccount.UserAccount;
import Business.VaccineDirectory.VaccineList;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class StateHealthDeptManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StateHealthDeptManagerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    SHDOrg shdOrg;
    StateHealthDept stateHealthDept;
    StateNetwork stateNetwork;
    VaccineList vaccineList;
    EcoSystem ecoSystem;
    
    public StateHealthDeptManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization shdOrg, Enterprise stateHealthDept, StateNetwork stateNetwork, VaccineList vaccineList, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.shdOrg = (SHDOrg) shdOrg;
        this.stateHealthDept = (StateHealthDept) stateHealthDept;
        this.stateNetwork = stateNetwork;
        this.vaccineList = vaccineList;
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

        healthLabel = new javax.swing.JLabel();
        manageOrdersBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        healthLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        healthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        healthLabel.setText("State Health Department Work Area");
        add(healthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 580, 41));

        manageOrdersBtn.setBackground(new java.awt.Color(153, 153, 153));
        manageOrdersBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageOrdersBtn.setText("Manage Order Approvals");
        manageOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersBtnActionPerformed(evt);
            }
        });
        add(manageOrdersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 330, 46));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 110, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersBtnActionPerformed
        // TODO add your handling code here:
        ManageOrderApprovalsJPanel manageOrderApprovalsJPanel = new ManageOrderApprovalsJPanel(userProcessContainer, userAccount, shdOrg, stateHealthDept, stateNetwork);
        userProcessContainer.add("ManageOrderApprovalsJPanel", manageOrderApprovalsJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrdersBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel healthLabel;
    private javax.swing.JButton manageOrdersBtn;
    // End of variables declaration//GEN-END:variables
}
