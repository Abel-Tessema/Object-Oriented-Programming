public class Product {
    Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public double calcCost() {
        double totalPrice = price * qty;
        return totalPrice + calcTax(totalPrice);
    }
    private double calcTax(double totalPrice) {
        return totalPrice * 0.15;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    private final String name;
    private final double price;
    private final int qty;

}
