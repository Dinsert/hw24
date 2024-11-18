package org.skypro.skyshop;

import org.skypro.skyshop.model.Article;
import org.skypro.skyshop.model.DiscountedProduct;
import org.skypro.skyshop.model.FixPriceProduct;
import org.skypro.skyshop.model.Searchable;
import org.skypro.skyshop.model.SimpleProduct;
import org.skypro.skyshop.service.SearchEngine;

public class App {

    public static void main(String[] args) {

//        Product[] products = {
//                new SimpleProduct("Course Java", 200_000),
//                new DiscountedProduct("Course C++", 250_000, 50),
//                new SimpleProduct("Course Python", 100_000),
//                new DiscountedProduct("Course Kotlin", 95_000, 95),
//                new FixPriceProduct("Course С#"),
//                new SimpleProduct("Course JavaScript", 400_000)
//        };
//
//        ProductBasket productBasket = new ProductBasket();
//
//        for (Product product : products) {
//            productBasket.addProduct(product);
//        }
//
//        productBasket.printBasketContents();
//        System.out.println();
//        System.out.println(productBasket.removeProductByBasket("Course C++"));
//        System.out.println();
//        productBasket.printBasketContents();
//        System.out.println(productBasket.removeProductByBasket("Course C+++"));
//        System.out.println(productBasket.getTotalBasketValue());
//        System.out.println(productBasket.checkProductContainsInBasket("Course Java"));
//        System.out.println(productBasket.checkProductContainsInBasket("Course С"));
//        productBasket.clearBasket();
//        productBasket.printBasketContents();
//        System.out.println(productBasket.getTotalBasketValue());
//        System.out.println(productBasket.checkProductContainsInBasket("Course Python"));

        Searchable[] searchables = {
                new SimpleProduct("03", 200_000),
                new DiscountedProduct("04", 250_000, 50),
                new SimpleProduct("01", 100_000),
                new DiscountedProduct("012", 95_000, 95),
                new FixPriceProduct("0123"),
                new SimpleProduct("012345", 400_000),
                new Article("Statya0", "Method printf()"),
                new Article("Statya0", "Method printf()"),
                new Article("Statya01", "Method printf()"),
                new Article("Statya012", "Method printf()"),
                new Article("Statya0123", "General rules language"),
                new Article("Statya012345", "Base knowledge")
        };

        SearchEngine searchEngine = new SearchEngine();

        for (Searchable searchable : searchables) {
            searchEngine.add(searchable);
        }

        System.out.println(searchEngine.search("0"));
        System.out.println(searchEngine.search("rules"));
        System.out.println(searchEngine.search("Course C++"));

//        try {
//            SimpleProduct simpleProduct = new SimpleProduct("Course Java", 0);
//            DiscountedProduct discountedProduct = new DiscountedProduct("Course C++", 250_000, 101);
//            FixPriceProduct fixPriceProduct = new FixPriceProduct(" ");
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            System.out.println(searchEngine.findMostSuitableBySearchString("Cou"));
//            searchEngine.findMostSuitableBySearchString("Ucg");
//        } catch (BestResultNotFound e) {
//            System.out.println(e.getMessage());
//        }

    }

}
