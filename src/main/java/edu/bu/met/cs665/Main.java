/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.LegacySystem;
import edu.bu.met.cs665.SystemAdapter;
import edu.bu.met.cs665.Customer;
import edu.bu.met.cs665.NewSystem;

//import edu.bu.met.cs665.example1.Person;

/**
 * This is the Main class.
 */


public class Main {
  public static void main(String[] args) {
    // Create a NewSystem and a SystemAdapter
    NewSystem newSystem = new NewSystem();
    SystemAdapter adapter = new SystemAdapter(newSystem);

    // Create a Customer
    Customer customer = new Customer(1, "Lightning McQueen", "mcqueen@pixar.com");

    // Use the adapter to create the customer in the new system
    String createMessage = adapter.createCustomer_USB(customer);
    System.out.println(createMessage);  // Should print "Customer created in New System: John Doe"

    // Use the adapter to print the customer
    String printMessage = adapter.printCustomer(customer.getId());
    System.out.println(printMessage);  // Should print "New System Customer: John Doe"

    // Update the customer's email
    customer.setEmail("lightningmcqueen@pixar.com");
    String updateMessage = adapter.updateCustomer_USB(customer.getId(), customer);
    System.out.println(updateMessage);  // Should print "Customer updated in New System: John Doe"

    // Print more details about the customer
    System.out.println("Customer ID: " + customer.getId());
    System.out.println("Customer Name: " + customer.getName());
    System.out.println("Customer Email: " + customer.getEmail());
  }
}