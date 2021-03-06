/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Analytics;

import Business.EcoSystem;
import Business.Enterprise.Hospital;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Order.OrderRequest;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * @author HarshithaApurvaNikhitha
 */
public class Request_tracking_Analytics extends javax.swing.JPanel {

    /**
     * Creates new form Request_tracking_Analytics
     */

    JPanel userProcessContainer;
    EcoSystem ecoSystem;

    public Request_tracking_Analytics(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
    }


    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) RequestTrackingTable.getModel();

        model.setRowCount(0);
        int i = 0;
        for (CountryNetwork countryNetwork : ecoSystem.getCountryList()) {
            if (countryNetwork.getStateNetwork() != null) {
                for (StateNetwork stateNetwork : countryNetwork.getStateNetwork()) {
                    if (stateNetwork.getEnterpriseList() != null) {
                        for (Hospital hospital : stateNetwork.getEnterpriseList().getHospitalEnterpriseList()) {
                            if (hospital.getOrganizationList() != null) {
                                for (Organization organization : hospital.getOrganizationList().getOrganizationList()) {
                                    if (organization.getUserAccountList() != null) {
                                        for (UserAccount userAccount : organization.getUserAccountList().getUserAccountList()) {
                                            for (OrderRequest orderRequest : userAccount.getOrderQueue().getOrderRequests()) {
                                                Object[] row = new Object[7];
                                                row[0] = ++i;
                                                row[1] = countryNetwork.getNetworkName();
                                                row[2] = stateNetwork.getNetworkName();
                                                row[3] = orderRequest.getDestinationLocationCoordinates().getLatitudeCoordinates();
                                                row[4] = orderRequest.getDestinationLocationCoordinates().getLongitudeCoordinates();
                                                row[5] = orderRequest.getPatient().getDisease();
                                                row[6] = orderRequest.getVaccine().getVaccineName();


                                                model.addRow(row);
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }
                }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        RequestTrackingTable = new javax.swing.JTable();
        ReqTrackingLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RequestTrackingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No.", "Country", "State", "Latitude", "Longitude", "Disease", "Vaccine"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RequestTrackingTable);
        if (RequestTrackingTable.getColumnModel().getColumnCount() > 0) {
            RequestTrackingTable.getColumnModel().getColumn(0).setResizable(false);
            RequestTrackingTable.getColumnModel().getColumn(1).setResizable(false);
            RequestTrackingTable.getColumnModel().getColumn(2).setResizable(false);
            RequestTrackingTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 81, 816, 133));

        ReqTrackingLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        ReqTrackingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReqTrackingLabel.setText("Request Tracking Analytics");
        add(ReqTrackingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 561, 41));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdminRole/click-go-back-button.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 110, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReqTrackingLabel;
    private javax.swing.JTable RequestTrackingTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
