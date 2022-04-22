package com.okno.kubki.cart;

import javax.persistence.*;

@Entity
@Table(name = "Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private static double cartTotal;

    public Cart() {}

    public Cart(double cartTotal) {
        this.cartTotal = cartTotal;
    }


    public static double getCartTotal() {
        return cartTotal;
    }

    public static void setCartTotal(double cartTotal) {
        Cart.cartTotal = cartTotal;
    }


}
