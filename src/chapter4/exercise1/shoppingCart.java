package chapter4.exercise1;

public class shoppingCart {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.

String customerName = "Precious Bhembe";
String customerName2 = "Thandeka Bhembe";
String itemDesc = "Shirt";
String itemDesc2 = "Sneakers";

// Declare the message variable
String message;

// Assign the message variable
message = customerName + " wants to purchase a " + itemDesc;
        System.out.println(message); // Print first message

message = customerName2 + " needs to purchase " + itemDesc2;
        System.out.println(message); // Print second message
    }
            }