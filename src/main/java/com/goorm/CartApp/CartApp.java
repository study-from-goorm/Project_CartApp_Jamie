package com.goorm.CartApp;

import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {

        Product milk = new Product(1L, "우유", 2000);
        Product bread =  new Product(2L, "빵", 1500);
        Product cheese = new Product(3L, "치즈", 3000);

        // 상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        productSet.add(milk);
        productSet.add(bread);
        productSet.add(cheese);

        System.out.println("고유한 상품 목록:");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        // 장바구니 생성 및 상품 추가
        Cart myCart = new Cart();
        myCart.addProduct(milk, 2); // 우유 2개 담기
        myCart.addProduct(bread, 1); // 빵 1개 담기
        myCart.addProduct(cheese, 1); // 치즈 1개 담기

        // 장바구니 상품 목록 출력
        myCart.showItems();

        // 상품 제거
        myCart.removeProduct(milk, 1); // 우유 1개 빼기

        // 상품 목록 다시 출력
        myCart.showItems();
    }
}
