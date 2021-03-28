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

    public String getId() {
        return deliveryManID;
    }

    public void setId(String id) {
        this.deliveryManID = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
