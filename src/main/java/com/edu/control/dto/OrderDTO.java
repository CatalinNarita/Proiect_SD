package com.edu.control.dto;

import com.edu.entity.Product;
import com.edu.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.List;

public class OrderDTO {

    private Long id;

    private String address;

    private Timestamp orderDate;

    private Double totalPrice;

    private List<Product> products;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;

    public OrderDTO(){}

    public OrderDTO(Long id, String address, Timestamp orderDate, Double totalPrice, List<Product> products, User user) {
        this.id = id;
        this.address = address;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.products = products;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
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
