import java.util.Random;

public class Item {
    private String type;
    private int quantity;
    private double price;
    private int daysUntilExpiry;

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
        Item[] itemArr = new Item[10];
        for (int i = 0; i < 10; i++) {
            itemArr[i] = new Item();
        }
        itemArr[0].setType("Burger"); itemArr[0].setQuantity(55); itemArr[0].setPrice(6.0d); itemArr[0].setDaysUntilExpiry(2);
        itemArr[1].setType("Cheese"); itemArr[1].setQuantity(20); itemArr[1].setPrice(5.3d); itemArr[1].setDaysUntilExpiry(60);
        itemArr[2].setType("Apples"); itemArr[2].setQuantity(60); itemArr[2].setPrice(0.5d); itemArr[2].setDaysUntilExpiry(10);
        itemArr[3].setType("Bread"); itemArr[3].setQuantity(23); itemArr[3].setPrice(1.5d); itemArr[3].setDaysUntilExpiry(5);
        itemArr[4].setType("Coffee jar"); itemArr[4].setQuantity(18); itemArr[4].setPrice(12.0d); itemArr[4].setDaysUntilExpiry(160);
        itemArr[5].setType("Sausages"); itemArr[5].setQuantity(50); itemArr[5].setPrice(3d); itemArr[5].setDaysUntilExpiry(4);
        itemArr[6].setType("Beer"); itemArr[6].setQuantity(44); itemArr[6].setPrice(2d); itemArr[6].setDaysUntilExpiry(90);
        itemArr[7].setType("Chips"); itemArr[7].setQuantity(30); itemArr[7].setPrice(3.4d); itemArr[7].setDaysUntilExpiry(120);
        itemArr[8].setType("Bananas"); itemArr[8].setQuantity(36); itemArr[8].setPrice(0.8d); itemArr[8].setDaysUntilExpiry(7);
        itemArr[9].setType("Cookies"); itemArr[9].setQuantity(55); itemArr[9].setPrice(4.0d); itemArr[9].setDaysUntilExpiry(90);

        double sumOfItemPrices = 0;
        for (int i = 0; i < 10; i++) {
            sumOfItemPrices += itemArr[i].getPrice();
        }
        System.out.printf("Average of the prices of Item array: %.2f",sumOfItemPrices/10);
    }
}
