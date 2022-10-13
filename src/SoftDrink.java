import java.util.Date;
import java.util.Objects;

public class SoftDrink {
    private String name;
    private String dateOfExpiry;
    private String volume;
    private String sugarPer100;

    public SoftDrink(String name, String dateOfExpiry, String volume, String sugarPer100) {
        this.name = name;
        this.dateOfExpiry = dateOfExpiry;
        this.volume = volume;
        this.sugarPer100 = sugarPer100;
    }

    public String getName() {
        return name;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public String getVolume() {
        return volume;
    }

    public String getSugarPer100() {
        return sugarPer100;
    }

    @Override
    public String toString() {
        return "SoftDrink { " +
                name + ", "+
                dateOfExpiry +", "+
                volume +", "+
                sugarPer100 +
                " } ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoftDrink softDrink = (SoftDrink) o;
        return Objects.equals(name, softDrink.name) && Objects.equals(sugarPer100, softDrink.sugarPer100);
    }

    public static void main(String[] args) {
        SoftDrink[] drinks = new SoftDrink[10]; //name,doe,volume,sugar
        drinks[0] = new SoftDrink("Coca Cola","10-12-2022","0.5","10.6");
        drinks[1] = new SoftDrink("Sprite","25-02-2023","1","9.5");
        drinks[2] = new SoftDrink("Green Cola","03-03-2023","0.33","0");
        drinks[3] = new SoftDrink("Fanta","10-06-2023","0.5","10.9");
        drinks[4] = new SoftDrink("Hell Energy","12-09-2023","0.33","11");
        drinks[5] = new SoftDrink("Monster Classic","20-04-2023","0.5","11");
        drinks[6] = new SoftDrink("Dr. Pepper","05-05-2024","0.5","4.9");
        drinks[7] = new SoftDrink("Mountain Dew","","","13");
        drinks[8] = new SoftDrink("Pepsi","01-01-2023","2","11");
        drinks[9] = new SoftDrink("Derby Cola","10-10-2022","3","10");

        double sumSugar = 0d;
        for (int i = 0; i < 10; i++) {
            sumSugar += Double.parseDouble(drinks[i].getSugarPer100());
            System.out.println(drinks[i]);
        }
        System.out.printf("Average sugar in all drinks: %.2f",sumSugar/drinks.length);
    }
}
