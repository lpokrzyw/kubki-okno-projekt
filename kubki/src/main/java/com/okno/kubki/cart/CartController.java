package com.okno.kubki.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping(path = "/cart")
@SessionAttributes("order")
public class CartController {
    private final int CART_ID = 1; // hard coded for now

    @Autowired
    private CartRepository cartRepository;

    @GetMapping
    public String showCartPage(Model model) {
        model.addAttribute("cartTotal",
                String.format("%.2f", cartRepository.findCartById(CART_ID).getCartTotal()));
        return "cart";
    }

    @PostMapping
    public String processOrder(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
