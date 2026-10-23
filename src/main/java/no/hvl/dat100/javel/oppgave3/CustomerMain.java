package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();
        Customer customer1 = new Customer("elias", "elias@gmail.com", 11, PowerAgreementType.SPOTPRICE);
        System.out.print(customer1.toString());
        System.out.println("\n==============");
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmail());
        System.out.println(customer1.getCustomer_id());
        System.out.println(customer1.getAgrement());
        System.out.println("==============");
        customer1.setName("Tobias");
        customer1.setEmail("tobias@gmail.com");
        customer1.setCustomer_id(12);
        customer1.setAgrement(PowerAgreementType.NORGESPRICE);
        System.out.print(customer1.toString());

        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
