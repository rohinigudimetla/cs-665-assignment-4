/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: NewSystem.java
 * Description: This class represents a new system that implements the CustomerData_HTTPS interface. 
 * It provides methods to create, retrieve, and update customers using HTTPS protocol.
 */

package edu.bu.met.cs665;

import java.util.HashMap;
import java.util.Map;

public class NewSystem implements CustomerData_HTTPS {
    private Map<Integer, Customer> customers = new HashMap<>();

    @Override
    public String printCustomer(int customerId) {
        if (customers.containsKey(customerId)) {
            Customer customer = customers.get(customerId);
            return "New System Customer: " + customer.getName();
        } else {
            return "Customer not found in New System.";
        }
    }

    @Override
    public Customer getCustomer_HTTPS(int customerId) {
        return customers.get(customerId);
    }

    @Override
    public String createCustomer_HTTPS(Customer customer) {
        customers.put(customer.getId(), customer);
        return "Customer created in New System: " + customer.getName();
    }

    @Override
    public String updateCustomer_HTTPS(int customerId, Customer customer) {
        if (customers.containsKey(customerId)) {
            customers.put(customerId, customer);
            return "Customer updated in New System: " + customer.getName();
        } else {
            return "Customer not found in New System.";
        }
    }
}
