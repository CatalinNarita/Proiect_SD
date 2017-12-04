package com.edu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Item.deleteItemByProductId", query = "DELETE FROM Item i WHERE i.product.id = ?")
})
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column
    private Integer quantity;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "items", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Order> orders;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "items", cascade = CascadeType.ALL)
    private List<Cart> carts;

    public Item(){}

    public Item(Product product, Integer quantity, List<Order> orders, List<Cart> carts) {
        this.product = product;
        this.quantity = quantity;
        this.orders = orders;
        this.carts = carts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
