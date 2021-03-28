/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    ArrayList<DeliveryMan> deliveryMEN = new ArrayList<>();

    public void addDeliveryMan(String name, String phoneNum){
        DeliveryMan deliveryMan = new DeliveryMan(name, phoneNum);
        deliveryMan.setId("D" + deliveryMEN.size()+1);
        deliveryMEN.add(deliveryMan);
    }

    public void deleteDeliveryMan(String id){
        for(DeliveryMan deliveryMan: deliveryMEN){
            if(deliveryMan.getId().equalsIgnoreCase(id)){
                deliveryMEN.remove(deliveryMan);
            }
        }
    }

    public DeliveryMan getDeliveryMan(String id) {
        for (DeliveryMan deliveryMan : deliveryMEN) {
            if (deliveryMan.getId().equalsIgnoreCase(id)) {
                return deliveryMan;
            }
        }
        return null;
    }

    public boolean isPhoneUnique(String phone){
        for(DeliveryMan deliveryMan: this.deliveryMEN){
            if(deliveryMan.getPhoneNum().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }

    public ArrayList<DeliveryMan> getDeliveryMEN() {
        return deliveryMEN;
    }

    public void setDeliveryMEN(ArrayList<DeliveryMan> deliveryMEN) {
        this.deliveryMEN = deliveryMEN;
    }
}
