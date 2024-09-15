package chapter10.exercise2;

public class ShoppingCart {
    public static void main(String[] args) {
        // Create an instance of the Order class with customer type NONPROFIT
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);

        // Print the discount
        System.out.println("Discount is: " + order.getDiscount());
    }
}
