package service;

import model.Product;

import java.util.List;

public final class ProductService {
    private static final List<Product> products = List.of(
            new Product("PD001", "Product 1", 10000),
            new Product("PD002", "Product 2", 15000),
            new Product("PD003", "Product 4", 20000),
            new Product("PD004", "Product 7", 19000)
    );

    private static final ProductService instance = new ProductService();

    private ProductService() {
    }

    public static ProductService getInstance() {
        return instance;
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
