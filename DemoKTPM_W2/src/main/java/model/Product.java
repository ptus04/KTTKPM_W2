package model;

public record Product(String productId, String name, double price) implements IProduct {
}
