package com.okno.kubki.cart;

import com.okno.kubki.beer.Mug;
import com.okno.kubki.beer.MugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes("order")
public class AddToCartService {
    private final static int CART_ID = 1; // hard coded for now

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private MugRepository mugRepository;

    public Mug retrieveMug(int id) {
        return mugRepository.findMugById(id);
    }

    public Cart retrieveCart(int id) {
        return cartRepository.findCartById(id);
    }

    public void updateCartTotal(double cartTotal) {
        Cart myCart = retrieveCart(CART_ID);
        myCart.cartTotal = cartTotal;
        cartRepository.save(myCart);
    }

    @RequestMapping(path = "/cart/addToCart")
    public String addToCart(HttpServletRequest request, Model model,
                            @RequestParam(value = "code", defaultValue = "") String code) {

        model.addAttribute("productCode", code);
        double mugPrice = retrieveMug(Integer.valueOf(code)).getPrice();
        updateCartTotal(retrieveCart(CART_ID).getCartTotal() + mugPrice);

        return "redirect:/mugs";
    }
}


