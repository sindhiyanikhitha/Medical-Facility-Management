/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.DB4OUtilConfig.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private JPanel userProcessContainer;
        private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    
    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;

        popOrganizationComboBox();
       // employeeJComboBox.removeAllItems();
        popData();
    }

    public void popOrganizationComboBox() {
        organizationCombo.removeAllItems();

        for (Organization organization : enterprise.getOrganizationList().getOrganizationList()) {
            organizationCombo.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeCombo.removeAllItems();
        
        for (Employee employee : organization.getEmployeeList().getEmployeeList()){
            employeeCombo.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleCombo.removeAllItems();
        for (Role role : organization.getSupportedRoles()){
            roleCombo.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationList().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountList().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userTable.getModel()).addRow(row);
            }
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

        createBtn = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        passwordLabel = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        employeeLabel = new javax.swing.JLabel();
        employeeCombo = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        organizationLabel = new javax.swing.JLabel();
        organizationCombo = new javax.swing.JComboBox();
        roleLabel = new javax.swing.JLabel();
        roleCombo = new javax.swing.JComboBox();
        UserLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createBtn.setBackground(new java.awt.Color(153, 153, 153));
        createBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 190, -1));

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        usernameLabel.setText("User Name");
        add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 375, 179));

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        passwordLabel.setText("Password");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));
        add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 190, -1));

        employeeLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        employeeLabel.setText("Employee");
        add(employeeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        employeeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 146, -1));

        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 100, 50));

        organizationLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        organizationLabel.setText("Organization");
        add(organizationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        organizationCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboActionPerformed(evt);
            }
        });
        add(organizationCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 146, -1));

        roleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        roleLabel.setText("Role");
        add(roleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 146, -1));

        UserLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        UserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserLabel.setText("Manage User Accounts");
        add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 380, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String userName = nameTxt.getText();
        String password = passwordTxt.getText();
        Organization organization = (Organization) organizationCombo.getSelectedItem();
        Employee employee = (Employee) employeeCombo.getSelectedItem();
        Role role = (Role) roleCombo.getSelectedItem();
        
        organization.getUserAccountList().createUserAccount(userName, password, employee, role);
        
        popData();
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void organizationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboActionPerformed
        Organization organization = (Organization) organizationCombo.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JComboBox employeeCombo;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox organizationCombo;
    private javax.swing.JLabel organizationLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JComboBox roleCombo;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JTable userTable;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
