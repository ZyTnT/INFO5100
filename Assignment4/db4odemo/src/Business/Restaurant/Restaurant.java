/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restaurantID;
    private String name;
    private String phoneNum;
    private String address;
    private String managerName;
    ArrayList<String> menu = new ArrayList<>();
    
    public void deleteItem(String itemName){
        Iterator<String> iterator = menu.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals(itemName)) {
                iterator.remove();
            }
        }
    }

    public Restaurant(String id, String name, String phoneNum, String address, String managerName){
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.managerName = managerName;
        this.restaurantID = id;
    }

    public void addMenu(String item){
        menu.add(item);
    }

    public String getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<String> menu) {
        this.menu = menu;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    
}
