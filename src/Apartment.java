import java.util.Objects;
import java.util.Random;

public class Apartment {
    int floor;
    int area;
    int roomCount;
    enum Direction {
        North, East,South,West
    }
    Direction facingDirection;

    public Apartment(int floor, int area, int roomCount, Direction facingDirection) {
        this.floor = floor;
        this.area = area;
        this.roomCount = roomCount;
        this.facingDirection = facingDirection;
    }

    public int getFloor() {
        return floor;
    }

    public double getArea() {
        return area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public Direction getFacingDirection() {
        return facingDirection;
    }

    @Override
    public String toString() {
        return "Apartment {" +
                "floor = " + floor +
                ", area = " + area +
                ", roomCount = " + roomCount +
                ", facingDirection = " + facingDirection +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return area == apartment.area;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, area, roomCount, facingDirection);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Apartment[] apartments = new Apartment[10];
        int biggestApartmentIndex = 0;
        for (int i = 0; i < 10; i++) {
            int roomFloor = random.nextInt(15)+1; //etaj
            int roomArea = random.nextInt(190)+10; //plosht
            int roomCount = random.nextInt(9)+1; //broi stai
            Apartment.Direction direction = Direction.values()[random.nextInt(Direction.values().length)];
            apartments[i] = new Apartment(roomFloor,roomArea,roomCount,direction);
            if (apartments[biggestApartmentIndex].area < apartments[i].area){
                biggestApartmentIndex = i;
            }
        }
        System.out.println("Biggest apartment:\n"+ apartments[biggestApartmentIndex].toString());
    }
}
