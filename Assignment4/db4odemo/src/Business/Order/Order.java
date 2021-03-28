package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;

public class Order extends WorkRequest {
    private String orderID;
    private Customer customer;
    private Restaurant restaurant;
    private DeliveryMan deliveryMan;
    private String item;
    private int quantity;

    public Order(Customer customer, Restaurant restaurant, DeliveryMan deliveryMan, String item){
        this.customer = customer;
        this.restaurant = restaurant;
        this.deliveryMan = deliveryMan;
        this.item = item;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
