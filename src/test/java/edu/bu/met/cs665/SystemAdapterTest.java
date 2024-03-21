/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: SystemAdapterTest.java
 * Description: This class contains unit tests for the SystemAdapter class. 
 * It tests the functionality of retrieving and printing customer data through the adapter.
 */

package edu.bu.met.cs665;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SystemAdapterTest {
    private SystemAdapter adapter;
    private Customer customer;

    @Before
    public void setUp() {
        NewSystem newSystem = new NewSystem();
        adapter = new SystemAdapter(newSystem);
        customer = new Customer(1, "John Doe", "john.doe@example.com");
        adapter.createCustomer_USB(customer);
    }

    @Test
    public void testGetCustomer_USB() {
        Customer retrievedCustomer = adapter.getCustomer_USB(customer.getId());
        assertEquals(customer.getName(), retrievedCustomer.getName());
    }

    @Test
    public void testPrintCustomer() {
        String message = adapter.printCustomer(customer.getId());
        assertEquals("New System Customer: " + customer.getName(), message);
    }

    @Test
    public void testUpdateCustomer_USB() {
        customer.setEmail("jdoe@example.com");
        String message = adapter.updateCustomer_USB(customer.getId(), customer);
        assertEquals("Customer updated in New System: " + customer.getName(), message);
    }
}