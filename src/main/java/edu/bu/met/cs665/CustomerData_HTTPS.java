/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

// New System
public interface CustomerData_HTTPS {
    String printCustomer(int customerId);
    Customer getCustomer_HTTPS(int customerId);
    String createCustomer_HTTPS(Customer customer);
    void updateCustomer_HTTPS(int customerId, Customer customer);
}