package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    
    public static double dollarFinal(double dollarDay, double dollarQuantity){
        return dollarDay * dollarQuantity * (1.0 + IOF);
    }
}

