/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        populateJTable();
        populateCountryJComboBox();
    }

    private void populateJTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) enterpriseTable.getModel();
        defaultTableModel.setRowCount(0);
        for (CountryNetwork countryNetwork : ecoSystem.getCountryList()) {
            for (StateNetwork stateNetwork : countryNetwork.getStateNetwork()) {
                for (Enterprise enterprise : stateNetwork.getEnterpriseList().getEnterpriseList()) {
                    Object[] row = new Object[4];
                    row[0] = enterprise;
                    row[1] = countryNetwork;
                    row[2] = stateNetwork;
                    row[3] = enterprise.getEnterpriseTypeEnum().getValue();
                    defaultTableModel.addRow(row);
                }
            }
        }
    }
    
    private void populateStateJComboBox(CountryNetwork country) {
        stateCombo.removeAllItems();
        if(country!= null){
            for(StateNetwork stateNetwork : country.getStateNetwork()) {
                stateCombo.addItem(stateNetwork);
            }
        }
    }

    private void populateCountryJComboBox() {
        countryCombo.removeAllItems();
        enterpriseTypeCombo.removeAllItems();
        for (CountryNetwork countryNetwork : ecoSystem.getCountryList()) {
            countryCombo.addItem(countryNetwork);
        }
        for (Enterprise.EnterpriseTypeEnum type : Enterprise.EnterpriseTypeEnum.values()) {
            enterpriseTypeCombo.addItem(type);
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
        enterpriseTable = new javax.swing.JTable();
        stateLabel = new javax.swing.JLabel();
        stateCombo = new javax.swing.JComboBox();
        nameLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        enterpriseTypeCombo = new javax.swing.JComboBox();
        submitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        countryCombo = new javax.swing.JComboBox();
        countryLabel = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Country", "State", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 94, 760, 100));

        stateLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        stateLabel.setText("State:");
        add(stateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 150, 40));

        stateCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(stateCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 150, 40));

        nameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nameLabel.setText("Enterprise Name:");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 200, 40));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 200, 40));

        typeLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        typeLabel.setText("Enterprise Type:");
        add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 200, 30));

        enterpriseTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 150, 40));

        submitBtn.setBackground(new java.awt.Color(153, 153, 153));
        submitBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 120, 50));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 110, 50));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("Manage Enterprises");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 761, 41));

        countryCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboActionPerformed(evt);
            }
        });
        add(countryCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 150, 40));

        countryLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        countryLabel.setText("Country:");
        add(countryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, 40));

        deleteBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        CountryNetwork countryNetwork = (CountryNetwork)countryCombo.getSelectedItem();
        StateNetwork stateNetwork = (StateNetwork) stateCombo.getSelectedItem();
        Enterprise.EnterpriseTypeEnum type = (Enterprise.EnterpriseTypeEnum) enterpriseTypeCombo.getSelectedItem();
        if (stateNetwork == null || type == null||countryNetwork ==null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        String name = nameTxt.getText();
        Enterprise enterprise = stateNetwork.getEnterpriseList().createAndAddEnterprise(name, type);
        if(enterprise != null)
            JOptionPane.showMessageDialog(null, "Successfully created "+enterprise.getOrgName()+"!");
        else
            JOptionPane.showMessageDialog(null, "Enterprise could not be inserted!");
        populateJTable();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        userinterface.SysAdminWorkArea.SystemAdminWorkAreaJPanel sysAdminwjp = (userinterface.SysAdminWorkArea.SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateJTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void countryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboActionPerformed
        // TODO add your handling code here:
        CountryNetwork country = (CountryNetwork)countryCombo.getSelectedItem();
        populateStateJComboBox(country);
    }//GEN-LAST:event_countryComboActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int row = enterpriseTable.getSelectedRow();
        if(row >= 0){
            StateNetwork stateNetwork = (StateNetwork) enterpriseTable.getValueAt(row, 2);
            Enterprise enterprise = (Enterprise) enterpriseTable.getValueAt(row, 0);
            stateNetwork.getEnterpriseList().deleteEnterprise(enterprise);
            JOptionPane.showMessageDialog(null, "Successfully removed "+ enterprise.getOrgName() +"!");
            populateJTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select an enterprise");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox countryCombo;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JComboBox enterpriseTypeCombo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox stateCombo;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
