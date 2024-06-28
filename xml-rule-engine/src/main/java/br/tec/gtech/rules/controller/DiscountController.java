package br.tec.gtech.rules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.tec.gtech.rules.dto.DiscountResponse;
import br.tec.gtech.rules.model.Customer;
import br.tec.gtech.rules.service.RuleEngine;

@RestController
@RequestMapping("/discount")
public class DiscountController {

    private final RuleEngine ruleEngine;

    @Autowired
    public DiscountController(RuleEngine ruleEngine) {
        this.ruleEngine = ruleEngine;
    }

    @PostMapping
    public DiscountResponse applyDiscount(@RequestBody Customer customer) {
        return new DiscountResponse(Customer.copyOf(customer, ruleEngine.evaluate(customer.getType(), customer.getPurchaseAmount())));
    }

    @GetMapping
    public String healthCheck() {
        return "Healthy!";
    }
}
