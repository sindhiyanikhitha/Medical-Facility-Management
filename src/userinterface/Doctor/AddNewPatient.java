/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Business.DiseaseList.Disease;
import Business.DiseaseList.DiseaseList;
import Business.Patient.Patient;
import Business.Patient.PatientList;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Apurva
 */
public class AddNewPatient extends javax.swing.JPanel {

    /**
     * Creates new form AddNewPatient
     */
    private JPanel userProcessContainer;
    private DiseaseList diseaseList;
    private PatientList patientList;
    
    public AddNewPatient(JPanel userProcessContainer, PatientList patientList, DiseaseList diseaseList) {
        initComponents();
        
    this.userProcessContainer = userProcessContainer;
    this.diseaseList = diseaseList;
    this.patientList = patientList;
    populateDiseaseJComboBox();
    }
    
    private void populateDiseaseJComboBox(){
        diseaseListCombo.removeAllItems();
        for(Disease disease : diseaseList.getDiseaseList()){
            diseaseListCombo.addItem(disease);
    
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

        patientLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        bloodLabel = new javax.swing.JLabel();
        diseaseListCombo = new javax.swing.JComboBox();
        createPatientBtn = new javax.swing.JButton();
        patientAgeSpinner = new javax.swing.JSpinner();
        patientNameTxt = new javax.swing.JTextField();
        diseaseLabel = new javax.swing.JLabel();
        bloodGroupCombo = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        patientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientLabel.setText("Create New Patient");
        add(patientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 590, 41));

        nameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nameLabel.setText("Patient Name :");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 160, 40));

        ageLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ageLabel.setText("Patient Age:");
        add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 160, 40));

        bloodLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bloodLabel.setText("Blood Group:");
        add(bloodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 160, 40));

        diseaseListCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        diseaseListCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseaseListComboActionPerformed(evt);
            }
        });
        add(diseaseListCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 210, 40));

        createPatientBtn.setBackground(new java.awt.Color(153, 153, 153));
        createPatientBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        createPatientBtn.setText("Create Patient");
        createPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientBtnActionPerformed(evt);
            }
        });
        add(createPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 190, 50));

        patientAgeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));
        add(patientAgeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 210, 40));
        add(patientNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 210, 40));

        diseaseLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        diseaseLabel.setText("Disease:");
        add(diseaseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 160, 40));

        bloodGroupCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        bloodGroupCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupComboActionPerformed(evt);
            }
        });
        add(bloodGroupCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 210, 40));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 429, 110, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void diseaseListComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseaseListComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diseaseListComboActionPerformed

    private void createPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientBtnActionPerformed
        // TODO add your handling code here:
        Patient  patient = patientList.addNewPatient();
        patient.setPatientName(patientNameTxt.getText());
        patient.setPatientAge((Integer)patientAgeSpinner.getValue());
        patient.setDisease((Disease)diseaseListCombo.getSelectedItem());
        patient.setPatientBloodGroup((String)bloodGroupCombo.getSelectedItem());
        JOptionPane.showMessageDialog(null,"Patient Added successfully");
    }//GEN-LAST:event_createPatientBtnActionPerformed

    private void bloodGroupComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroupComboActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox bloodGroupCombo;
    private javax.swing.JLabel bloodLabel;
    private javax.swing.JButton createPatientBtn;
    private javax.swing.JLabel diseaseLabel;
    private javax.swing.JComboBox diseaseListCombo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JSpinner patientAgeSpinner;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JTextField patientNameTxt;
    // End of variables declaration//GEN-END:variables
}
