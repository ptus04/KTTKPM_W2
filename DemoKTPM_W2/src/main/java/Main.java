import model.Order;
import service.ProductService;
import view.IProductViewer;
import view.IProductViewerFactory;
import view.ProductViewerFactory;

public class Main {
    public static void main(String[] args) {
        var allProducts = ProductService.getInstance().getAllProducts();

        IProductViewerFactory universal = ProductViewerFactory.createUniversalProductViewerFactory();

        IProductViewer viewer = universal.createTextProductViewer();
        IProductViewer viewer2 = universal.createModernProductViewer();

        viewer.render(allProducts);
        viewer2.render(allProducts);

        IProductViewerFactory vietnamese = ProductViewerFactory.createVietnameseProductViewerFactory();

        IProductViewer viewer3 = vietnamese.createTextProductViewer();
        IProductViewer viewer4 = vietnamese.createModernProductViewer();

        viewer3.render(allProducts);
        viewer4.render(allProducts);


        var order = new Order();
        System.out.println(order.getState());
        order.proceed();
//        order.cancel();
        System.out.println(order.getState());
        order.ship();
        System.out.println(order.getState());
        order.cancel();
        System.out.println(order.getState());
    }
}
