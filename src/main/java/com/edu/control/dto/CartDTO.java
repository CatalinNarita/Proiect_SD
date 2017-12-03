package com.edu.control.dto;

import com.edu.entity.Product;
import com.edu.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CartDTO {

    private Long id;

    private List<Product> products;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;

    public CartDTO(){}

    public CartDTO(Long id, List<Product> products, User user) {
        this.id = id;
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
