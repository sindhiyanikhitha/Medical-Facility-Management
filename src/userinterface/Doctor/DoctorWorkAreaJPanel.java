/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Business.EcoSystem;
import Business.Enterprise.Hospital;
import Business.Network.StateNetwork;
import Business.Organization.ClinicOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryManagerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    ClinicOrg clinicOrg;
    Hospital enterprise;
    StateNetwork stateNetwork;
    EcoSystem ecoSystem;
    
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization clinicOrg, Hospital enterprise, StateNetwork stateNetwork, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.clinicOrg = (ClinicOrg) clinicOrg;
        this.enterprise = enterprise;
        this.stateNetwork = stateNetwork;
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

        DoctorLabel = new javax.swing.JLabel();
        myPatientsBtn = new javax.swing.JButton();
        myOrdersBtn = new javax.swing.JButton();
        myOrdersJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DoctorLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        DoctorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DoctorLabel.setText("Doctor Work Area");
        add(DoctorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 580, 41));

        myPatientsBtn.setBackground(new java.awt.Color(153, 153, 153));
        myPatientsBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        myPatientsBtn.setText("My Patients");
        myPatientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myPatientsBtnActionPerformed(evt);
            }
        });
        add(myPatientsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 268, 46));

        myOrdersBtn.setBackground(new java.awt.Color(153, 153, 153));
        myOrdersBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        myOrdersBtn.setText("My Orders");
        myOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myOrdersBtnActionPerformed(evt);
            }
        });
        add(myOrdersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 268, 46));

        myOrdersJButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        myOrdersJButton1.setText("My Orders");
        myOrdersJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myOrdersJButton1ActionPerformed(evt);
            }
        });
        add(myOrdersJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 268, 46));
    }// </editor-fold>//GEN-END:initComponents

    private void myPatientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myPatientsBtnActionPerformed
        // TODO add your handling code here:
        ManagePatients managePatients = new ManagePatients(userProcessContainer,enterprise.getPatientList(), ecoSystem.getDiseaseList());
        userProcessContainer.add("ManagePatients", managePatients);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_myPatientsBtnActionPerformed

    private void myOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myOrdersBtnActionPerformed
        // TODO add your handling code here:
        DoctorOrdersJPanel myOrdersJPanel = new DoctorOrdersJPanel(userProcessContainer, account, clinicOrg, enterprise, stateNetwork, ecoSystem.getVaccineList(), ecoSystem);
        userProcessContainer.add("MyOrdersJPanel", myOrdersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_myOrdersBtnActionPerformed

    private void myOrdersJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myOrdersJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myOrdersJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoctorLabel;
    private javax.swing.JButton myOrdersBtn;
    private javax.swing.JButton myOrdersJButton1;
    private javax.swing.JButton myPatientsBtn;
    // End of variables declaration//GEN-END:variables
}
