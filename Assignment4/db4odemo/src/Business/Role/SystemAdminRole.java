/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system,CustomerDirectory customerDirectory,
            RestaurantDirectory restaurantDirectory,
            DeliveryManDirectory deliveryManDirectory,
            OrderDirectory orderDirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system, customerDirectory, restaurantDirectory, deliveryManDirectory,orderDirectory);
    }
    
}
