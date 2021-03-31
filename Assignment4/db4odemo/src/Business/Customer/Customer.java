/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author harold
 */
public class Customer {
    private String name;
    private String phoneNum;
    private String address;
    private String customerID;

    public Customer(String name, String phoneNum, String address){
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
    }
    public Customer(String id, String name, String phoneNum, String address,CustomerDirectory customerDirectory){
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.customerID = id;
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

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
