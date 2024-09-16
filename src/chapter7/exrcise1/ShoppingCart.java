package chapter7.exrcise1;

public class ShoppingCart {    public static void main (String[] args){
    String custName = "Precious Bhembe";
    String firstName;
    int spaceIdx;

    // Get the index of the space character (" ") in custName.
    spaceIdx = custName.indexOf(" ");

    // Use the substring method to parse out the first name and print it.
    firstName = custName.substring(0, spaceIdx);
    System.out.println(firstName);
}
}
