/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: SystemAdapter.java
 * Description: This class serves as an adapter between the LegacySystem and the NewSystem. 
 * It implements the CustomerData_USB interface and delegates the method calls to the NewSystem, 
 * allowing the LegacySystem to interact with the NewSystem.
 */

package edu.bu.met.cs665;

// Adapter
public class SystemAdapter implements CustomerData_USB {
    private CustomerData_HTTPS newSystem;

    public SystemAdapter(CustomerData_HTTPS newSystem) {
        this.newSystem = newSystem;
    }

    @Override
    public String printCustomer(int customerId) {
        return newSystem.printCustomer(customerId);
    }

    @Override
    public Customer getCustomer_USB(int customerId) {
        return newSystem.getCustomer_HTTPS(customerId);
    }

    @Override
    public String createCustomer_USB(Customer customer) {
        return newSystem.createCustomer_HTTPS(customer);
    }

    @Override
    public String updateCustomer_USB(int customerId, Customer customer) {
        return newSystem.updateCustomer_HTTPS(customerId, customer);
    }
}