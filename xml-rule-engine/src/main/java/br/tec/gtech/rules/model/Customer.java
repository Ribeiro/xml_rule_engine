package br.tec.gtech.rules.model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String type;
    private int purchaseAmount;
    private int discount;

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public static Customer copyOf(Customer original) {
        Customer copy = new Customer();
        copy.setType(original.getType());
        copy.setPurchaseAmount(original.getPurchaseAmount());
        copy.setDiscount(original.getDiscount());
        return copy;
    }

    public static Customer copyOf(Customer original, int discount) {
        Customer copy = new Customer();
        copy.setType(original.getType());
        copy.setPurchaseAmount(original.getPurchaseAmount());
        copy.setDiscount(discount);
        return copy;
    }
}
