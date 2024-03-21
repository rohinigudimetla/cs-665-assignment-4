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

    // Rest of the code...
}