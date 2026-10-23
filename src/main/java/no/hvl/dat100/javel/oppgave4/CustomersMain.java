package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();
        Customers kunder = new Customers(5);
        Customer customer1 = new Customer("elias", "elias@mail", 1,PowerAgreementType.SPOTPRICE);
        Customer customer2 = new Customer("tobias", "tobias@mail", 2, PowerAgreementType.SPOTPRICE);

        kunder.addCustomer(customer1);
        kunder.addCustomer(customer2);
        System.out.println(kunder.countNonNull());
        System.out.println(kunder.getCustomer(1));
        System.out.println(kunder.removeCustomer(1));
        Customer[] alleKunder = kunder.getCustomers();
        for (Customer c : alleKunder) {
            System.out.println(c);
        }
        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

    }
}
