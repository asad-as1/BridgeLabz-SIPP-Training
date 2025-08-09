public class Product {
    private String name;
    private double quantity;
    private double unitPrice;

    public Product(String name, double quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getName() { return name; }
    public double getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }
    public double getTotalPrice() { return quantity * unitPrice; }

    @Override
    public String toString() {
        return name + " x" + quantity + " @ " + unitPrice + " => " + getTotalPrice();
    }
}
