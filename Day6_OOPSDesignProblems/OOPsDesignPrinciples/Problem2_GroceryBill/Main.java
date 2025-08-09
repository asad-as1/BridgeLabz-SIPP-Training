public class Main {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice");
        alice.addProduct(new Product("Apples", 2.0, 3.0));
        alice.addProduct(new Product("Milk", 1.0, 2.0));

        System.out.println(BillGenerator.generateBill(alice));
    }
}
