/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(String name, String phoneNum, String address){
        Customer customer = new Customer(name, phoneNum, address);
        customer.setCustomerID("C" + (customers.size()+1));
        customers.add(customer);
    }

    public void deleteCustomer(String customerID, EcoSystem system){
        for(Customer customer: this.customers){
            if(customer.getCustomerID().equals(customerID)){
                this.customers.remove(customer);
            }
        }
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(customerID)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
    }

    public boolean isPhoneUnique(String phone){
        for(Customer customer: this.customers){
            if(customer.getPhoneNum().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }

    public Customer getCustomer(String id){
        for(Customer customer: customers){
            if(customer.getCustomerID().equalsIgnoreCase(id)){
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
