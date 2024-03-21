/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: LegacySystem.java
 * Description: This is the legacy system class that implements the CustomerData_USB interface.
 * It provides methods to create, retrieve, and print customers using USB protocol.
 */

package edu.bu.met.cs665;

import java.util.HashMap;
import java.util.Map;

public class LegacySystem implements CustomerData_USB {
    private Map<Integer, Customer> customers = new HashMap<>();

    @Override
    public String printCustomer(int customerId) {
        if (customers.containsKey(customerId)) {
            Customer customer = customers.get(customerId);
            return "Legacy System Customer: " + customer.getName();
        } else {
            return "Customer not found in Legacy System.";
        }
    }

    @Override
    public Customer getCustomer_USB(int customerId) {
        return customers.get(customerId);
    }

    @Override
    public String createCustomer_USB(Customer customer) {
        customers.put(customer.getId(), customer);
        return "Customer created in Legacy System: " + customer.getName();
    }

    @Override
    public String updateCustomer_USB(int customerId, Customer customer) {
        if (customers.containsKey(customerId)) {
            customers.put(customerId, customer);
            return "Customer updated in Legacy System: " + customer.getName();
        } else {
            return "Customer not found in Legacy System.";
        }
    }
}