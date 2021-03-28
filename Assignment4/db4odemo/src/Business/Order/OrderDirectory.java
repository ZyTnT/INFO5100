package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;

import java.util.ArrayList;

public class OrderDirectory {
    ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Customer customer, Restaurant restaurant, DeliveryMan deliveryMan, String item){
        Order order = new Order(customer, restaurant, deliveryMan, item);
        order.setOrderID("O" + orders.size()+1);
        orders.add(order);
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
