package view;

import model.Product;

import java.util.List;

public class UniversalTextProductViewer implements IProductViewer{

    @Override
    public void render(List<Product> allProducts) {
        allProducts.forEach(System.out::println);
    }
}
