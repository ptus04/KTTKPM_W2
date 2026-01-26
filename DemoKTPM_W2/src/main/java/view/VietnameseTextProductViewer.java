package view;

import model.Product;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class VietnameseTextProductViewer implements IProductViewer {

    @Override
    public void render(List<Product> allProducts) {
        for (Product product : allProducts) {
            var price = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("vi-VN")).format(product.price());
            System.out.println("Product{productId='" + product.productId() + "', name='" + product.name() + "', price=" + price + "}");
        }
    }
}
