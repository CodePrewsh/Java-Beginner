package chapter10.exercise2;

public class Order {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }

    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    public void calcDiscount() {
        discount = 0.0;

        if (custType == PRIVATE) {
            discount = 5.0;
        } else if (custType == NONPROFIT) {
            discount = 10.0;
        } else if (custType == CORP) {
            discount = 8.0;
        }

        if (total > 1000) {
            discount += 2.0;
        }
    }
}
