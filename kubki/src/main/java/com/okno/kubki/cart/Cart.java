package com.okno.kubki.cart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARTS")
public class Cart {

    @Id
    private int id;
    @Column(name = "CART_TOTAL", nullable = false)
    public double cartTotal;

    public double getCartTotal() {
        return cartTotal;
    }

    public Cart() {
    }

    public Cart(int id, double cartTotal) {
        super();
        this.id = id;
        this.cartTotal = cartTotal;
    }

}
