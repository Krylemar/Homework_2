public class Car {
    String brand;
    String registration;
    String mileage;

    public Car(String brand, String registration, String mileage) {
        this.brand = brand;
        this.registration = registration;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public String getRegistration() {
        return registration;
    }

    public String getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car { " +
                "brand = '" + brand + '\'' +
                ", registration = '" + registration + '\'' +
                ", mileage = '" + mileage + '\'' +
                " } ";
    }

    public static void main(String[] args) {
        Car[] cars = new Car[10];
        int indexOfLowestMileage = 0;
        cars[0] = new Car("BMW","B 2340 TX","242535");
        cars[1] = new Car("Mercedes","PP 4400 AP","2289");
        cars[2] = new Car("WV","CA 8734 MT","563410");
        cars[3] = new Car("Mitsubishi","BT 6969 MC","96287");
        cars[4] = new Car("Ferrari","Y 4529 EB","316284");
        cars[5] = new Car("Renault","CT 3981 AP", "140986");
        cars[6] = new Car("Mitsubishi","BT 4173 BB","64578");
        cars[7] = new Car("Peugeot","CC 5477 PT","140489");
        cars[8] = new Car("Daihatsu","EB 4444 OP","307556");
        cars[9] = new Car("Toyota","CO 4664 CK","451980");
        for (int i = 0; i < 10; i++) {
            if (Integer.parseInt(cars[indexOfLowestMileage].getMileage()) > Integer.parseInt(cars[i].getMileage())) {
                indexOfLowestMileage = i;
            }
        }
        System.out.println(cars[indexOfLowestMileage].toString());
    }
}
