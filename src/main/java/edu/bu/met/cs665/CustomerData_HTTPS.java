/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: CustomerData_HTTPS.java
 * Description: This interface defines the operations that a new system can perform on customer data using HTTPS protocol, 
 * including printing, retrieving, creating, and updating customers.
 */

package edu.bu.met.cs665;

// New System
public interface CustomerData_HTTPS {
    String printCustomer(int customerId);
    Customer getCustomer_HTTPS(int customerId);
    String createCustomer_HTTPS(Customer customer);
    String updateCustomer_HTTPS(int customerId, Customer customer);
}