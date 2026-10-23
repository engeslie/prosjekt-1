package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave4.Customers;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();
        Customers kunder = new Customers(5);
        Customer customer1 = new Customer("elias", "elias@mail", 1,PowerAgreementType.SPOTPRICE);
        Customer customer2 = new Customer("tobias", "tobias@mail", 2, PowerAgreementType.SPOTPRICE);
        Invoice faktura1 = new Invoice(customer1, "january",MonthPowerData.powerusage_month,MonthPowerData.powerprices_month);
        Invoice faktura2 = new Invoice(customer2, "january",MonthPowerData.powerusage_month,MonthPowerData.powerprices_month);
        Invoice[] fakturaer1 = {faktura1, faktura2};
        Invoices.processInvoices(fakturaer1);


        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */

    }
}
