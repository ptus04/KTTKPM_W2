package decorator;

import model.IProduct;

public class ConsumptionTaxDecorator extends TaxDecorator {

    public ConsumptionTaxDecorator(IProduct product) {
        super(product);
    }

    @Override
    public double price() {
        return product.price() * 1.08;
    }
}
