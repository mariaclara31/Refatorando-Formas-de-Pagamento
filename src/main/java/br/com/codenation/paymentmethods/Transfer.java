package br.com.codenation.paymentmethods;

public class Transfer implements PriceStrategy {
    private final double DESCONTO = 0.92;

    @Override
    public Double calculate(Double price) {
        return price * DESCONTO;
    }
}