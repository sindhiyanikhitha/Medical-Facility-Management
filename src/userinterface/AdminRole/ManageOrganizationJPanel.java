/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.DB4OUtilConfig.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.StateHealthDept;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationList;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Maps.MapBrowser;

/**
 *
 * @author Apurva
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationList directory;
    private JPanel userProcessContainer;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private StateNetwork stateNetwork;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationList directory, Enterprise enterprise, UserAccount userAccount, StateNetwork stateNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.stateNetwork = stateNetwork;
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationCombo.removeAllItems();
        for (Type type : Organization.Type.values()){
            if (!type.getValue().equals(Type.Admin.getValue()))
                organizationCombo.addItem(type);
        }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[4];
            row[0] = organization.getOrganizationID();
            row[1] = organization;
            row[2] = organization.getLocationCoordinates() == null ? null : organization.getLocationCoordinates().getLatitudeCoordinates();
            row[3] = organization.getLocationCoordinates() == null ? null : organization.getLocationCoordinates().getLongitudeCoordinates();
            
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
        organizationTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        organizationCombo = new javax.swing.JComboBox();
        OrganizationLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        manageOrganizationLabel = new javax.swing.JLabel();
        orgLocationBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Latitude", "Longitude"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationTable);
        if (organizationTable.getColumnModel().getColumnCount() > 0) {
            organizationTable.getColumnModel().getColumn(0).setResizable(false);
            organizationTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 540, 120));

        addBtn.setBackground(new java.awt.Color(153, 153, 153));
        addBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addBtn.setText("Add Organization");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        organizationCombo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        organizationCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboActionPerformed(evt);
            }
        });
        add(organizationCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 110, -1));

        OrganizationLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        OrganizationLabel.setText("Select Organization Type: ");
        add(OrganizationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, 30));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 110, 50));

        manageOrganizationLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        manageOrganizationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageOrganizationLabel.setText("Manage Organizations");
        add(manageOrganizationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 580, 40));

        orgLocationBtn.setBackground(new java.awt.Color(153, 153, 153));
        orgLocationBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        orgLocationBtn.setText("Set Location");
        orgLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgLocationBtnActionPerformed(evt);
            }
        });
        add(orgLocationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        refreshBtn.setBackground(new java.awt.Color(153, 153, 153));
        refreshBtn.setText("Refresh table");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        Type type = (Type) organizationCombo.getSelectedItem();
        StateHealthDept stateHealthDept = null;
        if(stateNetwork.getEnterpriseList().getStateHealthDeptEnterpriseList().size() > 0 ){
            stateHealthDept = stateNetwork.getEnterpriseList().getStateHealthDeptEnterpriseList().get(0);
        }
        //System.out.println(stateNetwork.getEnterprises().getStateHealthDeptEnterpriseList().get(0).getCountryName());
        if(!this.enterprise.approveOrgRequest(type, stateHealthDept, userAccount)){
            directory.createOrganization(type);
        }
        else{
            JOptionPane.showMessageDialog(null, "Request for creating an organization has been sent to State Health Department");
        }    
        populateTable();
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void organizationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationComboActionPerformed

    private void orgLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgLocationBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = organizationTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row !");
            return;
        }
        Organization org = (Organization)organizationTable.getValueAt(selectedRow, 1);
        MapBrowser mapBrowser = new MapBrowser(userProcessContainer, org);
        userProcessContainer.add("MapBrowser",mapBrowser);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_orgLocationBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OrganizationLabel;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageOrganizationLabel;
    private javax.swing.JButton orgLocationBtn;
    private javax.swing.JComboBox organizationCombo;
    private javax.swing.JTable organizationTable;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}
