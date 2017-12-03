package com.edu.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cart implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "carts")
    private List<Product> products;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @MapsId
    private User user;

    public Cart(){}

    public Cart(List<Product> products, User user) {
        this.products = products;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
