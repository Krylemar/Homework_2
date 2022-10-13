import java.util.Objects;
import java.util.Random;

public class Apartment {
    private final int floor;
    private final int area;
    private final int roomCount;
    private enum Direction {
        North, East,South,West
    }
    private final Direction facingDirection;

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
        Apartment[] apartments = new Apartment[10];
        apartments[0] = new Apartment(13,45,4,Direction.East);
        apartments[1] = new Apartment(8,55,5,Direction.West);
        apartments[2] = new Apartment(4,45,3,Direction.North);
        apartments[3] = new Apartment(7,50,4,Direction.South);
        apartments[4] = new Apartment(6,60,5,Direction.West);
        apartments[5] = new Apartment(2,40,4,Direction.South);
        apartments[6] = new Apartment(3,65,5,Direction.North);
        apartments[7] = new Apartment(14,60,4,Direction.South);
        apartments[8] = new Apartment(11,45,6,Direction.East);
        apartments[9] = new Apartment(15,40,3,Direction.West);
        int biggestApartmentIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (apartments[biggestApartmentIndex].area < apartments[i].area){
                biggestApartmentIndex = i;
            }
        }
                System.out.println("Biggest apartment:\n"+ apartments[biggestApartmentIndex].toString());
    }
}
