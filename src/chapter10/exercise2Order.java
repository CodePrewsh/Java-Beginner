package chapter10;

public class exercise2Order {
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public exercise2Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }

    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
        // Initialize discount to 0
        discount = 0.0;

        // Check customer type and apply base discount
        if (custType == PRIVATE) {
            discount = 5.0; // Private customers get a 5% discount
        } else if (custType == NONPROFIT) {
            discount = 10.0; // Non-profit customers get a 10% discount
        }

        // Additional discount if total is greater than 1000
        if (total > 1000) {
            discount += 2.0; // Extra 2% discount for orders over $1000
        }
    }
}
