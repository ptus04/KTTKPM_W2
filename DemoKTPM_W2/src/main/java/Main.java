import model.Order;
import service.ProductService;
import state.CancelledState;
import state.DeliveredState;
import state.PendingState;
import view.IProductViewer;
import view.IProductViewerFactory;
import view.ProductViewerFactory;

import java.time.LocalDate;

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


        /*var order = new Order("OD001", "CS002", LocalDate.now(), 100000);
        System.out.println(order);
        order.setStatus(new PendingState());
        order.setStatus(new CancelledState());
        System.out.println(order);
        order.setStatus(new DeliveredState());
        System.out.println(order);
        order.setStatus(new CancelledState());
        System.out.println(order);*/
    }
}
