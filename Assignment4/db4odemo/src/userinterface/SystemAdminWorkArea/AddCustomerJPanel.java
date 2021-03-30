/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 甄雨桐
 */
public class AddCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCustomerJPanel
     */
    public CustomerDirectory customerDirectory;
    public JPanel container;
    public EcoSystem system;
    
    public AddCustomerJPanel(JPanel container,EcoSystem system, CustomerDirectory customerDirectory) {
        initComponents();
        this.container = container;
        this.system = system;
        this.customerDirectory = customerDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        repeatPasswordText = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        customerNameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("Please input your information");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setText("User Name:");

        userNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel4.setText("Repeat Password:");

        jLabel5.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel5.setText("Customer Name:");

        jLabel6.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel7.setText("Phone:");

        jLabel8.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel8.setText("Address:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Picture/addCustomerPic.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        AddBtn.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 51, 51));
        AddBtn.setText("Add");
        AddBtn.setToolTipText("");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel10.setText("Create Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(AddBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phoneText)
                                            .addComponent(repeatPasswordText)
                                            .addComponent(customerNameText)
                                            .addComponent(addressText)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(userNameText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repeatPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(customerNameText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(phoneText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(backBtn))
                        .addComponent(jLabel6)
                        .addGap(276, 276, 276))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel9)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        String userName = userNameText.getText();
        String password = passwordText.getText();
        String repeatPassword = repeatPasswordText.getText();
        String customerName = customerNameText.getText();
        String phone = phoneText.getText();
        String address = addressText.getText();
        
        if(userName.isEmpty() || password.isEmpty() || repeatPassword.isEmpty() || customerName.isEmpty() || phone.isEmpty() || address.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input all information, some are empty!");
        }
        else if(!system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            JOptionPane.showMessageDialog(null, "User Name already exist!");
        }
        else if(!customerDirectory.isPhoneUnique(phone)){
            JOptionPane.showMessageDialog(null, "This phone number already exist!");
        }
        else if(!password.equals(repeatPassword)){
            JOptionPane.showMessageDialog(null, "Two password input are not equal!");
        }
        else{
            Customer customer = new Customer(customerName,phone,address);
            customerDirectory.addCustomer(customerName,phone,address);
            Employee employee = system.getEmployeeDirectory().createEmployee(customer.getCustomerID());
            
            UserAccount account = system.getUserAccountDirectory().createUserAccount(userName, password, employee, new CustomerRole());
            JOptionPane.showMessageDialog(null, "Customer added!");
            customerNameText.setText("");
            passwordText.setText("");
            repeatPasswordText.setText("");
            customerNameText.setText("");
            phoneText.setText("");
            addressText.setText("");
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
                container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageCustomerJPanel manageCustomersJPanel = (ManageCustomerJPanel) component;
        manageCustomersJPanel.populateTable();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField customerNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JPasswordField repeatPasswordText;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}