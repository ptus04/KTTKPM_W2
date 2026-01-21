package view;

public class ProductViewerFactory {
    public static IProductViewerFactory createUniversalProductViewerFactory() {
        return new UniversalProductViewerFactory();
    }

    public static IProductViewerFactory createVietnameseProductViewerFactory() {
        return new VietnameseProductViewerFactory();
    }
}
