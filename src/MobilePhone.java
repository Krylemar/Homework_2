import java.util.Objects;

public class MobilePhone {
    private String brand;
    private String memory;
    private String weight;
    private String camera;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return
                "Brand = " + brand +
                ", Memory = " + memory +
                ", Weight = " + weight +
                ", Camera = " + camera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhone that = (MobilePhone) o;
        return Objects.equals(memory, that.memory) && Objects.equals(camera, that.camera);
    }

    public static void main(String[] args) {
        MobilePhone[] phones = new MobilePhone[10];
        for (int i = 0; i < 10; i++) {
            phones[i] = new MobilePhone();
        }
        phones[0].setBrand("Samsung"); phones[0].setMemory("6"); phones[0].setWeight("202"); phones[0].setCamera("12");
        phones[1].setBrand("Xiaomi"); phones[1].setMemory("8"); phones[1].setWeight("223"); phones[1].setCamera("128");
        phones[2].setBrand("One Plus"); phones[2].setMemory("8"); phones[2].setWeight("176"); phones[2].setCamera("64");
        phones[3].setBrand("Nothing"); phones[3].setMemory("10"); phones[3].setWeight("188"); phones[3].setCamera("32");
        phones[4].setBrand("Oppo"); phones[4].setMemory("8"); phones[4].setWeight("162"); phones[4].setCamera("12");
        phones[5].setBrand("Google"); phones[5].setMemory("12"); phones[5].setWeight("195"); phones[5].setCamera("64");
        phones[6].setBrand("Huawei"); phones[6].setMemory("6"); phones[6].setWeight("178"); phones[6].setCamera("16");
        phones[7].setBrand("Nokia"); phones[7].setMemory("4"); phones[7].setWeight("176"); phones[7].setCamera("16");
        phones[8].setBrand("Lenovo"); phones[8].setMemory("6"); phones[8].setWeight("192"); phones[8].setCamera("32");
        phones[9].setBrand("Asus"); phones[9].setMemory("16"); phones[9].setWeight("250"); phones[9].setCamera("128");

        double sumWeight = 0d;
        int indexOfBestCamera = 0;
        for (int i = 0; i < 10; i++) {
            sumWeight += Double.parseDouble(phones[i].getWeight());
            if (Integer.parseInt(phones[indexOfBestCamera].getCamera()) < Integer.parseInt(phones[i].getCamera())){
                indexOfBestCamera = i;
            }
        }
        System.out.printf("Average weight of all phones: %.1f grams\nPhone with best camera: %s",sumWeight/phones.length,phones[indexOfBestCamera].toString());
    }
}
