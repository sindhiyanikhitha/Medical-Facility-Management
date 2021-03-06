/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Business.DiseaseList.DiseaseList;
import Business.Patient.Patient;
import Business.Patient.PatientList;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class ManagePatients extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatients
     */
    private JPanel userProcessContainer;
    private PatientList patientList;
    private DiseaseList diseaseList;
    
    public ManagePatients(JPanel userProcessContainer, PatientList patientList, DiseaseList diseaseList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patientList = patientList;
        this.diseaseList = diseaseList;
        populateTable();
        
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) patientDirectoryTable.getModel();
        
        model.setRowCount(0);
        
        int i =0;
    for(Patient patient: patientList.getPatientList()){
    Object[] row = new Object[5];
            row[0] = ++i;
            row[1] = patient;
            row[2] = patient.getPatientAge();
            row[3] = patient.getDisease();
            row[4] = patient.getPatientBloodGroup();
            
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
        patientDirectoryTable = new javax.swing.JTable();
        patientsLabel = new javax.swing.JLabel();
        addNewPatientBtn = new javax.swing.JButton();
        removePatientBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientDirectoryTable1 = new javax.swing.JTable();
        patientsLabel1 = new javax.swing.JLabel();
        addNewPatientBtn1 = new javax.swing.JButton();
        removePatientBtn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        patientDirectoryTable2 = new javax.swing.JTable();
        patientsLabel2 = new javax.swing.JLabel();
        addNewPatientBtn2 = new javax.swing.JButton();
        removePatientBtn2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        patientDirectoryTable3 = new javax.swing.JTable();
        patientsLabel3 = new javax.swing.JLabel();
        addNewPatientBtn3 = new javax.swing.JButton();
        removePatientBtn3 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDirectoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl No", "Patient Name", "Age", "Disease", "Blood Group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientDirectoryTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 91, 850, 144));

        patientsLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        patientsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientsLabel.setText("My Patients");
        add(patientsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 780, 41));

        addNewPatientBtn.setBackground(new java.awt.Color(153, 153, 153));
        addNewPatientBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addNewPatientBtn.setText("Add New Patient");
        addNewPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPatientBtnActionPerformed(evt);
            }
        });
        add(addNewPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        removePatientBtn.setBackground(new java.awt.Color(153, 153, 153));
        removePatientBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        removePatientBtn.setText("Remove Patient");
        removePatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePatientBtnActionPerformed(evt);
            }
        });
        add(removePatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDirectoryTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl No", "Patient Name", "Age", "Disease", "Blood Group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patientDirectoryTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 91, 850, 144));

        patientsLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        patientsLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientsLabel1.setText("My Patients");
        jPanel1.add(patientsLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 780, 41));

        addNewPatientBtn1.setBackground(new java.awt.Color(153, 153, 153));
        addNewPatientBtn1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addNewPatientBtn1.setText("Add New Patient");
        addNewPatientBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPatientBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(addNewPatientBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        removePatientBtn1.setBackground(new java.awt.Color(153, 153, 153));
        removePatientBtn1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        removePatientBtn1.setText("Remove Patient");
        removePatientBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePatientBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(removePatientBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDirectoryTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl No", "Patient Name", "Age", "Disease", "Blood Group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(patientDirectoryTable2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 91, 850, 144));

        patientsLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        patientsLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientsLabel2.setText("My Patients");
        jPanel2.add(patientsLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 780, 41));

        addNewPatientBtn2.setBackground(new java.awt.Color(153, 153, 153));
        addNewPatientBtn2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addNewPatientBtn2.setText("Add New Patient");
        addNewPatientBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPatientBtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(addNewPatientBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        removePatientBtn2.setBackground(new java.awt.Color(153, 153, 153));
        removePatientBtn2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        removePatientBtn2.setText("Remove Patient");
        removePatientBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePatientBtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(removePatientBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDirectoryTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl No", "Patient Name", "Age", "Disease", "Blood Group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(patientDirectoryTable3);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 91, 850, 144));

        patientsLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        patientsLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientsLabel3.setText("My Patients");
        jPanel3.add(patientsLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 780, 41));

        addNewPatientBtn3.setBackground(new java.awt.Color(153, 153, 153));
        addNewPatientBtn3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addNewPatientBtn3.setText("Add New Patient");
        addNewPatientBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPatientBtn3ActionPerformed(evt);
            }
        });
        jPanel3.add(addNewPatientBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        removePatientBtn3.setBackground(new java.awt.Color(153, 153, 153));
        removePatientBtn3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        removePatientBtn3.setText("Remove Patient");
        removePatientBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePatientBtn3ActionPerformed(evt);
            }
        });
        jPanel3.add(removePatientBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 110, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addNewPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewPatientBtnActionPerformed

        AddNewPatient addNewPatient = new AddNewPatient(userProcessContainer, patientList, diseaseList);
        userProcessContainer.add("AddNewPatient", addNewPatient);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addNewPatientBtnActionPerformed

    private void removePatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePatientBtnActionPerformed
    
       int selectedRow = patientDirectoryTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to remove this Patient account ?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION){
                Patient patient = (Patient)patientDirectoryTable.getValueAt(selectedRow, 1);
                
        JOptionPane.showMessageDialog(null,"Patient has been removed successfully!");
                
                patientList.removePatient(patient);
                populateTable();
            }
    
        
        
        
    }//GEN-LAST:event_removePatientBtnActionPerformed

    private void addNewPatientBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewPatientBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewPatientBtn1ActionPerformed

    private void removePatientBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePatientBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removePatientBtn1ActionPerformed

    private void addNewPatientBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewPatientBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewPatientBtn2ActionPerformed

    private void removePatientBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePatientBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removePatientBtn2ActionPerformed

    private void addNewPatientBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewPatientBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewPatientBtn3ActionPerformed

    private void removePatientBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePatientBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removePatientBtn3ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewPatientBtn;
    private javax.swing.JButton addNewPatientBtn1;
    private javax.swing.JButton addNewPatientBtn2;
    private javax.swing.JButton addNewPatientBtn3;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable patientDirectoryTable;
    private javax.swing.JTable patientDirectoryTable1;
    private javax.swing.JTable patientDirectoryTable2;
    private javax.swing.JTable patientDirectoryTable3;
    private javax.swing.JLabel patientsLabel;
    private javax.swing.JLabel patientsLabel1;
    private javax.swing.JLabel patientsLabel2;
    private javax.swing.JLabel patientsLabel3;
    private javax.swing.JButton removePatientBtn;
    private javax.swing.JButton removePatientBtn1;
    private javax.swing.JButton removePatientBtn2;
    private javax.swing.JButton removePatientBtn3;
    // End of variables declaration//GEN-END:variables
}
