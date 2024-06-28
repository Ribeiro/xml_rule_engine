package br.tec.gtech.rules.dto;

import java.io.Serializable;
import br.tec.gtech.rules.model.Customer;

public class DiscountResponse implements Serializable{
    private String customerType;
    private int purchaseAmount;
    private int discount;

    public DiscountResponse(Customer customer) {
        this.customerType = customer.getType();
        this.purchaseAmount = customer.getPurchaseAmount();
        this.discount = customer.getDiscount();
    }

    public String getCustomerType() {
        return customerType;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public int getDiscount() {
        return discount;
    }
}