package br.com.codenation.paymentmethods;

public class Cash implements  PriceStrategy {
    private static final Double DISCOUNT = 0.9;

    @Override
    public Double calculate(Double price) {
        return price * DISCOUNT;
    }
}