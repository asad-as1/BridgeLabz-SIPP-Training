public class BillGenerator {

    public static double computeTotal(Customer c) {
        return c.getProducts().stream()
                .mapToDouble(Product::getTotalPrice)
                .sum();
    }

    public static String generateBill(Customer c) {
        StringBuilder sb = new StringBuilder();
        sb.append("Bill for ").append(c.getName()).append("\n");
        sb.append("--------------------------\n");
        c.getProducts().forEach(p -> sb.append(p.toString()).append("\n"));
        sb.append("--------------------------\n");
        sb.append(String.format("TOTAL: $%.2f\n", computeTotal(c)));
        return sb.toString();
    }
}
