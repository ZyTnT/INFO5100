/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.OrderDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.RestaurantAdminRole.ManageRestaurantOrderJPanel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem business;
    private CustomerDirectory customerDirectory;
    private RestaurantDirectory restaurantDirectory;
    private DeliveryManDirectory deliveryManDirectory; 
    private OrderDirectory orderDirectory;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem business, CustomerDirectory customerDirectory,RestaurantDirectory restaurantDirectory,DeliveryManDirectory deliveryManDirectory, OrderDirectory orderDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.business.setOrderDirectory(new OrderDirectory());
        this.customerDirectory = customerDirectory;
        this.restaurantDirectory = restaurantDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.orderDirectory = orderDirectory;
        populateRestaurantTable();
    }
    
    public void populateRestaurantTable(){
        DefaultTableModel model = (DefaultTableModel) restaurantTable.getModel();
        model.setRowCount(0);
        for(Restaurant restaurant: restaurantDirectory.getRestaurants()){
            Object[] row = new Object[5];
            row[0] = restaurant.getRestaurantID();
            row[1] = restaurant.getName();
            row[2] = restaurant.getAddress();
            row[3] = restaurant.getManagerName();
            row[4] = restaurant.getPhoneNum();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        restaurantTable = new javax.swing.JTable();
        makeBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("Order Your Delicious Food");

        restaurantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Restaurant ID", "Restaurant Name", "Restaurant Address", "Restaurant Manager", "Restaurant Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(restaurantTable);

        makeBtn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        makeBtn.setForeground(new java.awt.Color(255, 0, 0));
        makeBtn.setText("Make a order");
        makeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeBtnActionPerformed(evt);
            }
        });

        viewBtn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        viewBtn.setText("View my order");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(makeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn)
                    .addComponent(makeBtn))
                .addContainerGap(302, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void makeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeBtnActionPerformed
        // TODO add your handling code here:
        int row = restaurantTable.getSelectedRow();
        int count = restaurantTable.getSelectedRowCount();
        if(count == 1){
           if(row >= 0){
            Restaurant restaurant = restaurantDirectory.getRestaurants().get(row);
            MakeOrderJPanel makeOrderJpanel = new MakeOrderJPanel(userProcessContainer,userAccount, business, customerDirectory, restaurant,deliveryManDirectory,orderDirectory);
            userProcessContainer.add("manageResturantInfoJPanel",makeOrderJpanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
           }
        }else{
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_makeBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        ViewOrderJPanel viewOrderJpanel = new ViewOrderJPanel(userProcessContainer,userAccount, business, customerDirectory, restaurantDirectory,deliveryManDirectory, orderDirectory);
        userProcessContainer.add("viewOrderJPanel",viewOrderJpanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_viewBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeBtn;
    private javax.swing.JTable restaurantTable;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
