package com.codewithrahul.orderdetails;

import com.codewithrahul.productdetails.Product;

import java.util.List;

public class Order {

    private int orderId;
    private String customerName;
    private String status;
    private double amount;
    private List<Product> products;

    public Order(int orderId, String customerName, String status, double amount, List<Product> products) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.status = status;
        this.amount = amount;
        this.products = products;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }



    @Override
    public String toString() {
        return orderId + " | " + customerName + " | " + status + " | ₹" + amount;
    }
}
