/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/21/2024
 * File Name: Main.java
 * Description: This is the main class and it shows an example of a customer Lightening McQueen
 *  being created in the new system using the adapter pattern.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.LegacySystem;
import edu.bu.met.cs665.SystemAdapter;
import edu.bu.met.cs665.Customer;
import edu.bu.met.cs665.NewSystem;

// import edu.bu.met.cs665.example1.Person;

public class Main {
  public static void main(String[] args) {
    // create a NewSystem and a SystemAdapter
    NewSystem newSystem = new NewSystem();
    SystemAdapter adapter = new SystemAdapter(newSystem);

    // create a Customer
    Customer customer = new Customer(1, "Lightning McQueen", "mcqueen@pixar.com");

    // use the adapter to create the customer in the new system
    String createMessage = adapter.createCustomer_USB(customer);
    System.out.println(createMessage);  // this should print "Customer created in New System: Lightning McQueen"

    // use the adapter to print the customer
    String printMessage = adapter.printCustomer(customer.getId());
    System.out.println(printMessage);  // this should print "New System Customer: Lightning McQueen"

    // update the customer's email
    customer.setEmail("lightningmcqueen@pixar.com");
    String updateMessage = adapter.updateCustomer_USB(customer.getId(), customer);
    System.out.println(updateMessage);  // this should print "Customer updated in New System: Lightning McQueen"

    // print more details about the customer
    System.out.println("Customer ID: " + customer.getId());
    System.out.println("Customer Name: " + customer.getName());
    System.out.println("Customer Email: " + customer.getEmail());
  }
}