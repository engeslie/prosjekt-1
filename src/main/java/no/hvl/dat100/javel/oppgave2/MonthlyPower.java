package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for(double[] rad : usage){
            for( double tall : rad){
                System.out.print(tall + "kwh ");
            }
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for(double []rad: prices){
            for(double tall : rad){
                System.out.print(tall + "NOK ");
            }
        }
        // TODO

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;
        for(double [] rad : usage){
            for(double tall : rad){
                sum += tall;
            }
        }


        // TODO

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int i = 0;

        while(i < powerusage.length && exceeded == false ){
            for(double tall : powerusage[i]){
                usage += tall;
                if (usage>threshold){
                    return true;
                }

            } i++;

        }


        // TODO

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {
        double price = 0;
        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j <usage[i].length; j++) {
                price += prices[i][j] * usage[i][j];
            }


        }


        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {
        double support = 0;
        double threshold = 0.9375;
        double percentage = 0.9;
        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                if (prices[i][j] > threshold) {
                    support += (prices[i][j] - threshold)
                            * percentage * usage[i][j];

                }
            }
        }
        // TODO

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        double norgesPrice = 0.50;

        for (double[] rad : usage) {
            for (double tall : rad) {
                price += tall * norgesPrice;
            }
        }

        return price;
    }
}
