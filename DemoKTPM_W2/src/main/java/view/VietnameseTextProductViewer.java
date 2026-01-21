package view;

import model.Product;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class VietnameseTextProductViewer implements IProductViewer {

    @Override
    public void render(List<Product> allProducts) {
        for (Product product : allProducts) {
            var price = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("vi-VN")).format(product.getPrice());
            System.out.println("Product{productId='" + product.getProductId() + "', name='" + product.getName() + "', price=" + price + "}");
        }
    }
}
