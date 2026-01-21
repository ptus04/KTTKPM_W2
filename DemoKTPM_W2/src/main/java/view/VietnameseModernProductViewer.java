package view;

import model.Product;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class VietnameseModernProductViewer implements IProductViewer {
    @Override
    public void render(List<Product> allProducts) {
        System.out.println("Product ID\t| Product Name\t| Price");
        for (Product product : allProducts) {
            var price = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("vi-VN")).format(product.getPrice());
            System.out.println(product.getProductId() + "\t\t| " + product.getName() + "\t\t| " + price);
        }
    }
}
