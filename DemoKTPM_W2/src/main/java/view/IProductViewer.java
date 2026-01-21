package view;

import model.Product;

import java.util.List;

public interface IProductViewer {
    void render(List<Product> allProducts);
}
