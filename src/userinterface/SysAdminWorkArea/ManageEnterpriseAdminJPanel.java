/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysAdminWorkArea;


import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Role.Admin;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        populateCountryBox();
    }

    private void populateJTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) enterpriseTable.getModel();
        defaultTableModel.setRowCount(0);
        CountryNetwork countryNetwork = (CountryNetwork)countryCombo1.getSelectedItem();
        if(countryNetwork!=null){
            for (StateNetwork stateNetwork : countryNetwork.getStateNetwork()) {
                for (Enterprise enterprise : stateNetwork.getEnterpriseList().getEnterpriseList()) {
                    for (UserAccount account : enterprise.getUserAccountList().getUserAccountList()) {
                        Object[] objects = new Object[3];
                        objects[0] = enterprise;
                        objects[1] = stateNetwork;
                        objects[2] = account;
                        defaultTableModel.addRow(objects);
                    }
                }
            }
        }
    }

    private void populateNetworkBox(){
        networkCombo.removeAllItems();
        CountryNetwork countryNetwork = (CountryNetwork)countryCombo.getSelectedItem();
        if(countryNetwork !=null){
            for(StateNetwork stateNetwork : countryNetwork.getStateNetwork()){
                networkCombo.addItem(stateNetwork);
            }
        }
    }
        
    
    private void populateCountryBox() {
        countryCombo.removeAllItems();
        if(ecoSystem.getCountryList()!=null){
            for (CountryNetwork countryNetwork : ecoSystem.getCountryList()) {
                countryCombo.addItem(countryNetwork);
                countryCombo1.addItem(countryNetwork);
            }
        }
    }
    
    private void populateEnterpriseBox(StateNetwork network){
        enterpriseCombo.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseList().getEnterpriseList()){
            enterpriseCombo.addItem(enterprise);
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
        networkLabel = new javax.swing.JLabel();
        networkCombo = new javax.swing.JComboBox();
        usernameLabel = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseCombo = new javax.swing.JComboBox();
        submitBtn = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        passwordPassword = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        enetrpriseLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        countryCombo = new javax.swing.JComboBox();
        countryLabe = new javax.swing.JLabel();
        countryCombo1 = new javax.swing.JComboBox();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "State", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 523, 95));

        networkLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        networkLabel.setText("Network");
        add(networkLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 120, -1));

        networkCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboActionPerformed(evt);
            }
        });
        add(networkCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 150, 40));

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        usernameLabel.setText("Username");
        add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));
        add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 190, 30));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        enterpriseLabel.setText("Enterprise");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 130, 40));

        enterpriseCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 150, 40));

        submitBtn.setBackground(new java.awt.Color(153, 153, 153));
        submitBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        passwordLabel.setText("Password");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, -1, -1));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 190, -1));

        nameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nameLabel.setText("Name");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));
        add(passwordPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 190, 30));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 110, 40));

        enetrpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        enetrpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enetrpriseLabel.setText("Manage Enterprise Admins");
        add(enetrpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 761, 41));

        countryLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        countryLabel.setText("Country:");
        add(countryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, 40));

        countryCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboActionPerformed(evt);
            }
        });
        add(countryCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 150, 40));

        countryLabe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        countryLabe.setText("Country:");
        add(countryLabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        countryCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryCombo1ActionPerformed(evt);
            }
        });
        add(countryCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 72, 180, 30));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void networkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboActionPerformed

        StateNetwork stateNetwork = (StateNetwork) networkCombo.getSelectedItem();
        if (stateNetwork != null){
            populateEnterpriseBox(stateNetwork);
        }
        
        
    }//GEN-LAST:event_networkComboActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        
        Enterprise enterprise = (Enterprise) enterpriseCombo.getSelectedItem();
        
        String username = usernameTxt.getText();
        String password = String.valueOf(passwordPassword.getPassword());
        String name = nameTxt.getText();
        
        Employee employee = enterprise.getEmployeeList().createEmployee(name);
        
        UserAccount userAccount = enterprise.getUserAccountList().createUserAccount(username, password, employee, new Admin());
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
        populateNetworkBox();
    }//GEN-LAST:event_countryComboActionPerformed

    private void countryCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryCombo1ActionPerformed
        populateJTable();
    }//GEN-LAST:event_countryCombo1ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int row = enterpriseTable.getSelectedRow();
        if(row >= 0){
            Enterprise enterprise = (Enterprise) enterpriseTable.getValueAt(row, 0);
            UserAccount userAccount = (UserAccount) enterpriseTable.getValueAt(row, 2);
            enterprise.getUserAccountList().deleteUserAccount(userAccount);
            JOptionPane.showMessageDialog(null, "Successfully deleted "+ userAccount.getUsername() +" !");
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a user account!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox countryCombo;
    private javax.swing.JComboBox countryCombo1;
    private javax.swing.JLabel countryLabe;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel enetrpriseLabel;
    private javax.swing.JComboBox enterpriseCombo;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox networkCombo;
    private javax.swing.JLabel networkLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordPassword;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
