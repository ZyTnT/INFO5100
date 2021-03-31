/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String name;
    private String deliveryManID;
    private String phoneNum;
    private String address;

    
    public DeliveryMan(String id, String name, String phoneNum, String address){
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.deliveryManID = id;
    }
    
    public String getDeliveryManID() {
        return deliveryManID;
    }

    public void setDeliveryManID(String deliveryManID) {
        this.deliveryManID = deliveryManID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public DeliveryMan(String name, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
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
    
}
