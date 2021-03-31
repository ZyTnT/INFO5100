package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;

import java.util.ArrayList;

public class OrderDirectory {
    ArrayList<Order> orders = new ArrayList<>();

    public Order addOrder(Customer customer, Restaurant restaurant, String item, int quantity){
        Order order = new Order(("O" + (orders.size()+1)), customer, restaurant, item, quantity);
        orders.add(order);
        return order;
    }

    public void deleteOrder(String orderID){
        for(Order order: orders){
            if(order.getOrderID().equalsIgnoreCase(orderID)){
                orders.remove(order);
            }
        }
    }

    public Order getOrder(String orderID){
        for(Order order: orders){
            if(order.getOrderID().equalsIgnoreCase(orderID)){
                return order;
            }
        }
        return null;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}
