package view;

import model.Product;

import java.util.List;

public class UniversalModernProductViewer implements IProductViewer {
    @Override
    public void render(List<Product> allProducts) {
        System.out.println("Product ID\t| Product Name\t| Price");
        for (Product product : allProducts) {
            System.out.println(product.productId() + "\t\t| " + product.name() + "\t\t| " + product.price());
        }
    }
}
