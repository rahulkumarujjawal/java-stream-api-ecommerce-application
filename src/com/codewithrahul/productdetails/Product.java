package com.codewithrahul.productdetails;

public class Product {


    private int id;
    private String name;
    private String category;
    private String brand;
    private double price;
    private int quantity;
    private double rating;


    public Product(int id, String name, String category, String brand, double price, int quantity, double rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.rating = rating;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }



    @Override
    public String toString() {
        return name + " | " + brand + " | ₹" + price + " | Rating: " + rating;
    }
}
