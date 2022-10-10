import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Item[] items = new Item[10];
        double avg = 0f;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< items.length;i++) {
            var io = scanner.nextLine();
            items[i].setType(io);
            items[i].setQuantity(scanner.nextInt());
            items[i].setPrice(scanner.nextDouble());
            avg += items[i].price;
            items[i].setDaysUntilExpiry(scanner.nextInt());
            System.out.println(items[i].toString());
        }
        avg /= items.length;
        System.out.println(avg);
    }
}