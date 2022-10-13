public class Notebook {
    int pageCount;
    double price;
    boolean isHardCover;

    public Notebook(int pageCount, double price, boolean isHardCover) {
        this.pageCount = pageCount;
        this.price = price;
        this.isHardCover = isHardCover;
    }

    public int getPageCount() {
        return pageCount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "pageCount=" + pageCount +
                ", price=" + price +
                ", isHardCover=" + isHardCover +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return pageCount == notebook.pageCount && Double.compare(notebook.price, price) == 0 && isHardCover == notebook.isHardCover;
    }

    public static void main(String[] args) {
        Notebook[] notebooks = new Notebook[10];
        notebooks[0] = new Notebook(80,2.90d, true);
        notebooks[1] = new Notebook(40,1.70d, false);
        notebooks[2] = new Notebook(80,2.10d, false);
        notebooks[3] = new Notebook(40,2.40d, true);
        notebooks[4] = new Notebook(50,10.0d, true);
        notebooks[5] = new Notebook(100,4.0d, false);
        notebooks[6] = new Notebook(60,5.0d, true);
        notebooks[7] = new Notebook(20,1.50d, false);
        notebooks[8] = new Notebook(15,2.90d, true);
        notebooks[9] = new Notebook(70,7.50d, true);

        int softCoverCount = 0;
        double sumOfPrice = 0d;
        for (int i = 0; i < 10; i++) {
            if (!notebooks[i].isHardCover) {
                softCoverCount++;
            }
            sumOfPrice += notebooks[i].price;
        }
        System.out.printf("Number of soft cover notebooks: %s\nAverage price of all notebooks: %.2f",softCoverCount,sumOfPrice/notebooks.length);
    }
}
