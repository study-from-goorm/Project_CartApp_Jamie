package com.goorm.CartApp;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        items.merge(product, quantity, Integer::sum);
    }

    public void removeProduct(Product product, int quantity) {
        items.computeIfPresent(product, (k, v) -> (v - quantity <= 0) ? null : v - quantity);
    }

    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }
        System.out.println("장바구니에 담긴 상품:");
        items.forEach((product, quantity) -> System.out.println(product.getName() + " - 수량: " + quantity));
    }
}