package br.tec.gtech.rules.engine;

import javax.xml.bind.annotation.XmlElement;

public class Condition {
    private String customerType;
    private int minPurchase;

    @XmlElement
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @XmlElement
    public int getMinPurchase() {
        return minPurchase;
    }

    public void setMinPurchase(int minPurchase) {
        this.minPurchase = minPurchase;
    }
}
