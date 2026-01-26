package decorator;

import model.IProduct;

public class ValueAddedTaxDecorator extends TaxDecorator {

    public ValueAddedTaxDecorator(IProduct product) {
        super(product);
    }

    @Override
    public double price() {
        return product.price() * 1.10;
    }
}
