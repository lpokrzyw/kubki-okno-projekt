package com.okno.kubki.cart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Double> {
    Cart findMugById (int id);
}
