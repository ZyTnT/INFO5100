package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;

public class Order {
    private String orderID;
    private String customerID;
    private String restaurantID;
    private String deliveryManID;
    private String item;

    public Order(String customerID, String restaurantID, String deliveryManID, String item){
        this.customerID = customerID;
        this.restaurantID = restaurantID;
        this.deliveryManID = deliveryManID;
        this.item = item;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getDeliveryManID() {
        return deliveryManID;
    }

    public void setDeliveryManID(String deliveryManID) {
        this.deliveryManID = deliveryManID;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
