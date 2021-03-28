package Business.Order;

import java.util.ArrayList;

public class OrderDirectory {
    ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(String customerID, String restaurantID, String deliveryManID, String item){
        Order order = new Order(customerID, restaurantID, deliveryManID, item);
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
