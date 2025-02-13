package entities;

public class currencyConverter {

    public static double totalconv(double priceDollar, double howManyDollars) {
        return (priceDollar * howManyDollars) + (priceDollar * howManyDollars * 0.06) ;
    }
}
