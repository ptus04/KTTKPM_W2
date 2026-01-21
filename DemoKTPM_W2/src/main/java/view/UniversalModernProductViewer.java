package view;

import model.Product;

import java.util.List;

public class UniversalModernProductViewer implements IProductViewer {
    @Override
    public void render(List<Product> allProducts) {
        System.out.println("Product ID\t| Product Name\t| Price");
        for (Product product : allProducts) {
            System.out.println(product.getProductId() + "\t\t| " + product.getName() + "\t\t| " + product.getPrice());
        }
    }
}
