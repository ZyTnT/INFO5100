/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yutong Zhen
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    private CustomerDirectory customerDirectory;
    public JPanel container;
    public EcoSystem system;
    
    public ManageCustomerJPanel(JPanel userProcessContainer, EcoSystem system, CustomerDirectory customerDirectory) {
        initComponents();
        this.customerDirectory = customerDirectory;
        this.container = userProcessContainer;
        this.system = system;
        //customerDirectory.addCustomer("AA", "BB", "CC");
        populateTable();
    }
    
    public ManageCustomerJPanel() {
        initComponents();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) CustomerInfojTable.getModel();
        model.setRowCount(0);
        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            for (Customer customer : customerDirectory.getCustomers()) {
                if (customer.getName().equalsIgnoreCase(ua.getUsername())) {
                    Object[] row = new Object[2];
                    row[0] = customer.getCustomerID();
                    row[1] = customer.getName();
                    model.addRow(row);
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
        CustomerInfojTable = new javax.swing.JTable();
        idText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        phoneNumText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        savaBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        CustomerInfojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CustomerID", "name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CustomerInfojTable);

        idText.setEditable(false);

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 51, 51));
        AddBtn.setText("Add Customer");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        viewBtn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        viewBtn.setText("Change Detail");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel1.setText("Customer ID");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel3.setText("Phone Number");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel4.setText("Address");

        backBtn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel5.setText("Manage Customers");

        savaBtn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        savaBtn.setForeground(new java.awt.Color(255, 51, 51));
        savaBtn.setText("Save");
        savaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savaBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(savaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(phoneNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(viewBtn)
                    .addComponent(jButton1))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumText)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(savaBtn))
                .addGap(243, 243, 243))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int selectedIndex = CustomerInfojTable.getSelectedRow();
        if(selectedIndex<0){
            JOptionPane.showMessageDialog(this, "Pleas select a row!");
            return;
        }
        DefaultTableModel model  = (DefaultTableModel)CustomerInfojTable.getModel();
        Customer customer = customerDirectory.getCustomers().get(selectedIndex);
        nameText.setText(customer.getName());
        idText.setText(customer.getCustomerID());
        phoneNumText.setText(customer.getPhoneNum());
        addressText.setText(customer.getAddress());
    }//GEN-LAST:event_viewBtnActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        AddCustomerJPanel createCustomersJPanel = new AddCustomerJPanel(container, system, customerDirectory);
        container.add(createCustomersJPanel);
        layout.next(container);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void savaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savaBtnActionPerformed
        // TODO add your handling code here:
        int selectedIndex = CustomerInfojTable.getSelectedRow();
        if(selectedIndex<0){
            JOptionPane.showMessageDialog(this, "Pleas select a row!");
            return;
        }
        DefaultTableModel model  = (DefaultTableModel)CustomerInfojTable.getModel();
        Customer customer = customerDirectory.getCustomers().get(selectedIndex);
        customer.setName(nameText.getText());
        customer.setAddress(addressText.getText());
        customer.setPhoneNum(phoneNumText.getText());
        populateTable();
    }//GEN-LAST:event_savaBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedIndex = CustomerInfojTable.getSelectedRow();
        int count = CustomerInfojTable.getSelectedRowCount();
        if(count == 1){
            if (selectedIndex >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Sure to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                customerDirectory.deleteCustomer(customerDirectory.getCustomers().get(selectedIndex).getCustomerID(), CustomerInfojTable.getSelectedRow(), system);
                populateTable();
            }
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTable CustomerInfojTable;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneNumText;
    private javax.swing.JButton savaBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
