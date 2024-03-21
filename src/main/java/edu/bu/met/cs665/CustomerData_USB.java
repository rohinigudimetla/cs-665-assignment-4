/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

// Legacy System
public interface CustomerData_USB {
    String printCustomer(int customerId);
    Customer getCustomer_USB(int customerId);
    String createCustomer_USB(Customer customer);
    void updateCustomer_USB(int customerId, Customer customer);
}