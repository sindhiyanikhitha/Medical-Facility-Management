/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysAdminWorkArea;

import Business.EcoSystem;
import Business.Network.CountryNetwork;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class ManageCountryJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    /**
     * Creates new form ManageCountryJPanel
     */


  public  ManageCountryJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;

        populateCountryJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        countryTable = new javax.swing.JTable();
        entercountryLabel = new javax.swing.JLabel();
        addNetworkBtn = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        countryLabel = new javax.swing.JLabel();
        deleteNetworkBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        countryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(countryTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 108, 480, 91));

        entercountryLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        entercountryLabel.setText("Enter Country:");
        jPanel1.add(entercountryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        addNetworkBtn.setBackground(new java.awt.Color(153, 153, 153));
        addNetworkBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addNetworkBtn.setText("Add New Country");
        addNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addNetworkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 250, 50));

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 200, 40));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 120, -1));

        countryLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        countryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        countryLabel.setText("Manage Country");
        jPanel1.add(countryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 761, 41));

        deleteNetworkBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteNetworkBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        deleteNetworkBtn.setText("Delete Country");
        deleteNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNetworkBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteNetworkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void addNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkBtnActionPerformed

        String countryName = nameTxt.getText();

        if (!countryName.matches("^[a-zA-Z]+$")) {
            JOptionPane.showMessageDialog(null, "Country name should contain only letters", "Info", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ecoSystem.createAndAddCountry(countryName);
        JOptionPane.showMessageDialog(null,"Country added successfully");

        populateCountryJTable();
    }//GEN-LAST:event_addNetworkBtnActionPerformed
private void populateCountryJTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) countryTable.getModel();

        defaultTableModel.setRowCount(0);
        for (CountryNetwork country : ecoSystem.getCountryList()) {
            Object[] row = new Object[1];
            row[0] = country;
            defaultTableModel.addRow(row);
        }
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        userinterface.SysAdminWorkArea.SystemAdminWorkAreaJPanel sysAdminwjp = (userinterface.SysAdminWorkArea.SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateJTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNetworkBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = countryTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;

        }

        CountryNetwork countryNetwork = (CountryNetwork) countryTable.getValueAt(selectedRow, 0);
        ecoSystem.getCountryList().remove(countryNetwork);
        JOptionPane.showMessageDialog(null,"Country removed successfully");
        populateCountryJTable();

    }//GEN-LAST:event_deleteNetworkBtnActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNetworkBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTable countryTable;
    private javax.swing.JButton deleteNetworkBtn;
    private javax.swing.JLabel entercountryLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    // End of variables declaration//GEN-END:variables
}
