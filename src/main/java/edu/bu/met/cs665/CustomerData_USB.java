/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: CustomerData_USB.java
 * Description: This interface defines the operations that a legacy system can perform on customer data using USB protocol, 
 * including printing, retrieving, creating, and updating customers
 */

package edu.bu.met.cs665;

// Legacy System
public interface CustomerData_USB {
    String printCustomer(int customerId);
    Customer getCustomer_USB(int customerId);
    String createCustomer_USB(Customer customer);
    String updateCustomer_USB(int customerId, Customer customer);
}