import ProductClass.Product;

public class Shop {
    private Product[] products;

    public Shop(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}