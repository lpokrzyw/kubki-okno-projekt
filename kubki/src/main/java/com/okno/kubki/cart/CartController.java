package com.okno.kubki.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping(path = "/cart")
@SessionAttributes("order")
public class CartController {

    double cartTotal = 0;

    @GetMapping
    public String showCartPage(Model model) {
        model.addAttribute("cartTotal", cartTotal);

        return "cart";
    }

    @PostMapping
    public String processOrder(Errors errors, SessionStatus sessionStatus) {
        if (errors.hasErrors()) {
            return "cart";
        }

        sessionStatus.setComplete();

        return "redirect:/";
    }
}
