package com.okno.kubki.beer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Mugs")
public class Mug {

    @Id
    private int id;
    @Column(name = "PRICE", nullable = false)
    private double price;

    public Mug() {
    }

    public Mug(int id, double price) {
        super();
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
