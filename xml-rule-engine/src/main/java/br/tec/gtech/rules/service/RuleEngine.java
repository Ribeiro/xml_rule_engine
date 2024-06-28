package br.tec.gtech.rules.service;

import org.springframework.stereotype.Service;
import br.tec.gtech.rules.engine.Condition;
import br.tec.gtech.rules.engine.Rule;
import br.tec.gtech.rules.engine.RuleParser;
import br.tec.gtech.rules.engine.Rules;
import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class RuleEngine {

    private List<Rule> rules;

    @PostConstruct
    public void init() {
        Rules ruleSet = RuleParser.parseRules("rules.xml");
        this.rules = ruleSet.getRules();
    }

    public int evaluate(String customerType, int purchaseAmount) {
        for (Rule rule : rules) {
            Condition condition = rule.getCondition();
            if (condition.getCustomerType().equals(customerType) && purchaseAmount >= condition.getMinPurchase()) {
                return rule.getAction().getDiscount();
            }
        }
        return 0; // No discount if no rule matches
    }
}
