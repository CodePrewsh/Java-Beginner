package chapter4.exercise2;

public class shoppingCart {
    public static void main(String[] args) {
        String custName = "Thandeka Bhembe";
        String itemDesc = "Sneakers";
        String message = custName+" wants to purchase a "+itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity, and total
        // Do not initialize total.
        double price = 29.99;
        int quantity = 5;
        double tax = 1.04;
        double total;

        // Modify message to include quantity.
        message = custName+" wants to purchase "+quantity+ " "+itemDesc;

        System.out.println(message);

        // Calculate total and then print the total cost.
        total = quantity * price * tax;

        System.out.println("Total cost with tax: "+total);
    }
}
