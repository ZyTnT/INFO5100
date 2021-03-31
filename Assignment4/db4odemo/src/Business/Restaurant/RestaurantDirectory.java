/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    ArrayList<Restaurant> restaurants = new ArrayList<>();

    public Restaurant addRestaurant(String name, String phoneNum, String address,String managerName){
        Restaurant restaurant = new Restaurant(("R" + (restaurants.size()+1)), name,phoneNum,address,managerName);
        //restaurant.setRestaurantID("R" + (restaurants.size()+1));
        restaurants.add(restaurant);
        return restaurant;
    }

    public void deleteRestaurant(String id, int index, EcoSystem system){
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName() != null) {

                if (system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)) {
                    system.getUserAccountDirectory().getUserAccountList().remove(i);
                }
            }
        }
        restaurants.remove(index);
    }

    public boolean isPhoneUnique(String phone){
        for(Restaurant restaurant: this.restaurants){
            if(restaurant.getPhoneNum().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
