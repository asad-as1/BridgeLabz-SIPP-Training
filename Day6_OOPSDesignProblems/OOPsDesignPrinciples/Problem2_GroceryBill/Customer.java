import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void addProduct(Product p) { products.add(p); }
    public List<Product> getProducts() { return products; }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', products=" + products + "}";
    }
}
