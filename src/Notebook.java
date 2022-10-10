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

    }
}
