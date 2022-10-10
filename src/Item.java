import java.util.Random;

public class Item {
    String type;
    int quantity;
    double price;
    int daysUntilExpiry;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDaysUntilExpiry() {
        return daysUntilExpiry;
    }

    public void setDaysUntilExpiry(int daysUntilExpiry) {
        this.daysUntilExpiry = daysUntilExpiry;
    }

    @Override
    public String toString() {
        return ("Type: "+ this.getType() + " Quantity: "+ this.getQuantity()+" Price: "+this.getPrice()+" Days until expiry: "+this.getDaysUntilExpiry());
    }

    public static void main(String[] args) {
        Random r = new Random();
        Item[] itemArr = new Item[10];
        double sumOfItemPrices = 0;
        for (int i = 0;i< 10; i++) {
            double randomValue = 1000 * r.nextDouble();
            itemArr[i] = new Item();
            itemArr[i].setPrice(randomValue);
            sumOfItemPrices += randomValue;
        }
        System.out.printf("Sum of the prices of Item array: %.2f",sumOfItemPrices/10);
    }
}
