package br.com.codenation;

import br.com.codenation.paymentmethods.PaymentMethod;

public class Order {

    private final Double price;
    private final PaymentMethod paymentMethod;

    public Order(Double price, PaymentMethod paymentMethod) {
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    public Double getPrice() {
        return price;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public Double calculate() {
        return paymentMethod.getPaymentStrategy().calculate(price);
    }

}
