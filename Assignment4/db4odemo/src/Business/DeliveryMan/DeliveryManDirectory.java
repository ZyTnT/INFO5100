/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import Business.EcoSystem;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    ArrayList<DeliveryMan> deliveryMEN = new ArrayList<>();

    public DeliveryMan addDeliveryMan(String name, String phoneNum,String address){
        DeliveryMan deliveryMan = new DeliveryMan(("D" + (deliveryMEN.size()+1)), name, phoneNum,address);
        //deliveryMan.setDeliveryManID("D" + (deliveryMEN.size()+1));
        deliveryMEN.add(deliveryMan);
        return deliveryMan;
    }

    public void deleteDeliveryMan(String id, int index, EcoSystem system){
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName() != null) {
                if (system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)) {
                    system.getUserAccountDirectory().getUserAccountList().remove(i);
                }
            }
        }
        deliveryMEN.remove(index);
        
    }

    public DeliveryMan getDeliveryMan(String id) {
        for (DeliveryMan deliveryMan : deliveryMEN) {
            if (deliveryMan.getDeliveryManID().equalsIgnoreCase(id)) {
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
