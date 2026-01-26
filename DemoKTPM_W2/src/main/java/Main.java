import decorator.ExciseTaxDecorator;
import decorator.ValueAddedTaxDecorator;
import model.IProduct;
import model.Order;
import model.Product;
import service.ProductService;
import view.IProductViewer;
import view.IProductViewerFactory;
import view.ProductViewerFactory;

import java.text.DecimalFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Singleton
        var allProducts = ProductService.getInstance().getAllProducts();

        // Abstract Factory
        IProductViewerFactory universal = ProductViewerFactory.createUniversalProductViewerFactory();
        IProductViewerFactory vietnamese = ProductViewerFactory.createVietnameseProductViewerFactory();

        // Method Factory
        IProductViewer viewer = universal.createTextProductViewer();
        IProductViewer viewer2 = universal.createModernProductViewer();
        IProductViewer viewer3 = vietnamese.createTextProductViewer();
        IProductViewer viewer4 = vietnamese.createModernProductViewer();

        viewer.render(allProducts);
        viewer2.render(allProducts);
        viewer3.render(allProducts);
        viewer4.render(allProducts);

        // State
        try {
            var order = new Order();
            System.out.println(order.getState());
            order.proceed();
//        order.cancel();
            System.out.println(order.getState());
            order.ship();
            System.out.println(order.getState());
            order.cancel();
            System.out.println(order.getState());
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }

        // Decorator
        IProduct product =
                new ExciseTaxDecorator(
                        new ValueAddedTaxDecorator(
                                new Product("PD001", "Laptop", 25_000_000)
                        )
                );
        System.out.println("Product price: " + DecimalFormat.getCurrencyInstance(Locale.forLanguageTag("vi-VN")).format(product.price()));
    }
}
