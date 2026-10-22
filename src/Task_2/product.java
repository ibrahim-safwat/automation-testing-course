package Task_2;

public class product {

    private String name;
    private int price;
    private int quantity;
    public String category;

    public product(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getname() {
        return name;
    }

    public int getprice() {
        return price;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getquantity() {
        return quantity;
    }

    public String getcategory() {
        return category;
    }

    public void setquantity(int quantity) {
        this.quantity = correctionquantity(quantity);
    }

    public void setcategory(int price) {
        this.price = correctionprice(price);
    }

    public int gettotal(int price, int quantity) {
        int total = correctionprice(price) * correctionquantity(quantity);
        return total;
    }

    @Override
    public String toString() {
        return "the name is: " + name + ", the price is: " + price + ", the quantity is: " + quantity;
    }

    public int correctionprice(int price) {
        if (price < 0)
            throw new IllegalArgumentException("price cannot be negative");
        return price;
    }

    public int correctionquantity(int quantity) {
        if (quantity < 0)
            throw new IllegalArgumentException("quantity cannot be negative");
        return quantity;
    }


}
