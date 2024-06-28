package br.tec.gtech.rules.engine;

import javax.xml.bind.annotation.XmlElement;

public class Rule {
    private String id;
    private Condition condition;
    private Action action;

    @XmlElement
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement
    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @XmlElement
    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
