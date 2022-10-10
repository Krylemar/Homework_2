import java.util.Objects;

public class SoftDrink {
    String name;
    String dateOfExpiry;
    String volume;
    String sugarPer100;

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
        return "SoftDrink{" +
                "name='" + name + '\'' +
                ", dateOfExpiry='" + dateOfExpiry + '\'' +
                ", volume='" + volume + '\'' +
                ", sugarPer100='" + sugarPer100 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoftDrink softDrink = (SoftDrink) o;
        return Objects.equals(name, softDrink.name) && Objects.equals(sugarPer100, softDrink.sugarPer100);
    }

    public static void main(String[] args) {

    }
}
