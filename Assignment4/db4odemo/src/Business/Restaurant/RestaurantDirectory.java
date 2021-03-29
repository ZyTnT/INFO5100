/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    ArrayList<Restaurant> restaurants = new ArrayList<>();

    public void addRestaurant(String name, String phoneNum, String address,String managerName){
        Restaurant restaurant = new Restaurant(name,phoneNum,address,managerName);
        restaurant.setRestaurantID("R" + restaurants.size()+1);
        restaurants.add(restaurant);
    }

    public void deleteRestaurant(String id){
        for(Restaurant restaurant: restaurants){
            if(restaurant.getRestaurantID().equalsIgnoreCase(id)){
                restaurants.remove(restaurant);
            }
        }
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
