/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
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
public class ManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuJPanel
     */
    private JPanel container;
    private EcoSystem system;
    private RestaurantDirectory restaurantDirectory;
    private UserAccount account;
    
    public ManageMenuJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.container = userProcessContainer;
        this.system = system;
        this.restaurantDirectory = restaurantDirectory;
        this.account = account;
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeleteBtn = new javax.swing.JButton();
        newItemText = new javax.swing.JTextField();
        AddMenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dishTable = new javax.swing.JTable();

        DeleteBtn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        AddMenuBtn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        AddMenuBtn.setForeground(new java.awt.Color(255, 0, 51));
        AddMenuBtn.setText("Add");
        AddMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMenuBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("Manage Menu");

        backBtn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Picture/ManageRestaurantInfoPic.jpg"))); // NOI18N

        dishTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Dish Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dishTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jLabel1))
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newItemText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(backBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newItemText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddMenuBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(DeleteBtn)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) dishTable.getModel();
        model.setRowCount(0);
        String restaurantId = account.getEmployee().getName();
        for(Restaurant restaurant : restaurantDirectory.getRestaurants()){
            if (restaurant.getRestaurantID().equals(restaurantId)){
                for(String Item: restaurant.getMenu()){
                    Object[] row = new Object[1];
                    row[0] = Item;
                    model.addRow(row);
                }
            }
            }
        
    }
    private void AddMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMenuBtnActionPerformed
        // TODO add your handling code here:
        String Item = newItemText.getText();
        String restaurantId = account.getEmployee().getName();
        for(Restaurant restaurant : restaurantDirectory.getRestaurants()){
            if (restaurant.getRestaurantID().equals(restaurantId)){
                restaurant.addMenu(Item);
            }
        }
        populateTable();
    }//GEN-LAST:event_AddMenuBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedIndex = dishTable.getSelectedRow();
        int count = dishTable.getSelectedRowCount();
        if(count == 1){
            if (selectedIndex >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Sure to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String restaurantId = account.getEmployee().getName();
                for(Restaurant restaurant : restaurantDirectory.getRestaurants()){
                    if (restaurant.getRestaurantID().equals(restaurantId)){
                        restaurant.getMenu().remove(selectedIndex);
                    }
                }
            }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Please select a row!!");
        }
        populateTable();
        
    }//GEN-LAST:event_DeleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMenuBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable dishTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField newItemText;
    // End of variables declaration//GEN-END:variables
}