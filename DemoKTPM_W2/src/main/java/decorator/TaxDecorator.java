package decorator;

import model.IProduct;

public abstract class TaxDecorator implements IProduct {
    protected IProduct product;

    protected TaxDecorator(IProduct product) {
        this.product = product;
    }
}
