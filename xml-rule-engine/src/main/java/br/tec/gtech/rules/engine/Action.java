package br.tec.gtech.rules.engine;

import javax.xml.bind.annotation.XmlElement;

public class Action {
    private int discount;

    @XmlElement
    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
