package com.ecom.productc;

import com.ecom.productc.model.category;
import com.ecom.productc.model.product;
import com.ecom.productc.repository.categoryrepository;
import com.ecom.productc.repository.productRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final productRepository productRepository;
    private final categoryrepository categoryRepository;

    public DataSeeder(categoryrepository categoryRepository, productRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    private product createProduct(String name, String description, double price, category category, String imgUrl) {
        product p = new product();
        p.setName(name);
        p.setDescription(description);
        p.setPrice(price);
        p.setCategory(category);
        p.setImgurl(imgUrl);
        return p;
    }

    @Override
    public void run(String... args) throws Exception {
        // Clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // 1. Categories
        category clothing = new category();
        clothing.setName("Clothing");

        category electronics = new category();
        electronics.setName("Electronics");

        category home = new category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(clothing, electronics, home));

        // Descriptions
        String clothDesc = "Quality clothing product for everyday use, college, work and casual occasions.";
        String elecDesc = "Reliable electronic product with modern features and practical performance.";
        String homeDesc = "Useful home and kitchen product designed for convenient everyday household use.";

        // Direct Real Product Images (Tested & Working Hotlinks)
        String imgIphone = "https://rukminim2.flixcart.com/image/1348/1348/xif0q/mobile/o/o/9/-resized-original-imahggev6y5zhbjz.jpeg?q=90";
        String imgLaptop = "https://rukminim2.flixcart.com/image/1498/1498/xif0q/computer/a/h/y/-original-imagypv6x6zqbu7t.jpeg?q=90";
        String imgHeadphones = "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?auto=format&fit=crop&w=400&q=80";
        String imgWatch = "https://images.unsplash.com/photo-1523275335684-37898b6baf30?auto=format&fit=crop&w=400&q=80";

        String imgTshirt = "https://rukminim2.flixcart.com/image/1498/1498/xif0q/t-shirt/j/e/v/m-evd-white-classic-tees-original-imahnkayr39agtnh.jpeg?q=90";
        String imgJeans = "https://images.unsplash.com/photo-1541099649105-f69ad21f3246?auto=format&fit=crop&w=400&q=80";
        String imgSneakers = "https://images.unsplash.com/photo-1542291026-7eec264c27ff?auto=format&fit=crop&w=400&q=80";

        String imgKettle = "https://rukminim2.flixcart.com/image/1498/1498/xif0q/shopsy-electric-kettle/a/6/t/1500-ekn-stainless-steel-electric-kettle-1500-watts-elegant-resized-original-imahgtg6tgftd5f3.jpeg?q=90";
        String imgCoffee = "https://images.unsplash.com/photo-1517668808822-9ebb02f2a0e6?auto=format&fit=crop&w=400&q=80";
        String imgMug = "https://images.unsplash.com/photo-1514432324607-a09d9b4aefdd?auto=format&fit=crop&w=400&q=80";

        // Save 10 Products with Exact Image Matches
        productRepository.saveAll(Arrays.asList(
                // Electronics (4 Items)
                createProduct("Apple iPhone 16 Pro", elecDesc, 79999.0, electronics, imgIphone),
                createProduct("MacBook Air M3 256GB", elecDesc, 114999.0, electronics, imgLaptop),
                createProduct("Sony WH-1000XM5 Headphones", elecDesc, 29999.0, electronics, imgHeadphones),
                createProduct("Apple Watch Series 10 GPS", elecDesc, 46999.0, electronics, imgWatch),

                // Clothing (3 Items)
                createProduct("Classic Cotton T-Shirt White", clothDesc, 799.0, clothing, imgTshirt),
                createProduct("Slim Fit Blue Jeans", clothDesc, 1499.0, clothing, imgJeans),
                createProduct("Urban Running Sneakers", clothDesc, 2299.0, clothing, imgSneakers),

                // Home & Kitchen (3 Items)
                createProduct("Electric Kettle 1.5L Auto Shut-off", homeDesc, 1299.0, home, imgKettle),
                createProduct("Automatic Drip Coffee Maker", homeDesc, 2299.0, home, imgCoffee),
                createProduct("Ceramic Coffee Mug White 350ml", homeDesc, 299.0, home, imgMug)
        ));
    }
}