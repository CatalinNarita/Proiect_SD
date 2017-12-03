package com.edu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private ProductCategoryEnum category;

    @Column
    private Double price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_spec_id")
    private ProductSpec productSpec;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name = "order_product",
            joinColumns = {@JoinColumn(name = "id_order", nullable = false) },
            inverseJoinColumns = {@JoinColumn(name = "id_product", nullable = false)}
    )
    @JsonBackReference(value = "order_ref")
    private List<Order> orders;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(name = "cart_product",
            joinColumns = {@JoinColumn(name = "id_cart", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "id_product", nullable = false)}
    )
    @JsonBackReference(value = "cart_ref")
    private List<Cart> carts;

    public Product() {
    }

    public Product(String name, ProductCategoryEnum category, Double price, ProductSpec productSpec, List<Order> orders, List<Cart> carts) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.productSpec = productSpec;
        this.orders = orders;
        this.carts = carts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(ProductCategoryEnum category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductSpec getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(ProductSpec productSpec) {
        this.productSpec = productSpec;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }
}
