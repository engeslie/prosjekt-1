package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month


    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c ;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;



    }

    public void computeAmount() {

        if(c.getAgrement() == PowerAgreementType.SPOTPRICE){
            amount = MonthlyPower.computeSpotPrice(usage, prices);
        }
        if(c.getAgrement() == PowerAgreementType.NORGESPRICE){
            amount = MonthlyPower.computeNorgesPrice(usage);
        }
        if(c.getAgrement() == PowerAgreementType.POWERSUPPORT){
            amount = MonthlyPower.computeSpotPrice(usage, prices) -
            MonthlyPower.computePowerSupport(usage, prices);
        }


    }

    public void printInvoice() {
        System.out.print("\nid "+ c.getCustomer_id());
        System.out.print("\nname "+ c.getName());
        System.out.print("\nemail " + c.getEmail());
        System.out.print("\nagrement " + c.getAgrement());
        System.out.print("\n\nmonth "+ month);
        System.out.print("\nusage "+ MonthlyPower.computePowerUsage(usage));
        System.out.printf("\nprice %.2f NOK%n", amount);



    }

}
