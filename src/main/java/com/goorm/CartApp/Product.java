package com.goorm.CartApp;

import java.util.Objects;

public class Product {

    private Long key;
    private String name;
    private int price;

    public Product(Long key, String name, int price) {
        this.key = key;
        this.name = name;
        this.price = price;
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return key == product.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
