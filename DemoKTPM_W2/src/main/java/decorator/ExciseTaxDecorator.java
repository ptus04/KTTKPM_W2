package decorator;

import model.IProduct;

public class ExciseTaxDecorator extends TaxDecorator {

    public ExciseTaxDecorator(IProduct product) {
        super(product);
    }

    @Override
    public double price() {
        return product.price() * 1.25;
    }
}
