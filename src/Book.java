public class Book {
    private final String authName;
    private final String authLName;
    private final String title;
    private final int releaseYear;
    private final int pageCount;

    public Book(String authName, String authLName, String title, int releaseYear, int pageCount) {
        this.authName = authName;
        this.authLName = authLName;
        this.title = title;
        this.releaseYear = releaseYear;
        this.pageCount = pageCount;
    }

    public String getAuthName() {
        return authName;
    }

    public String getAuthLName() {
        return authLName;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book { " +
                "authName = '" + authName + '\'' +
                ", authLName = '" + authLName + '\'' +
                ", title = '" + title + '\'' +
                ", releaseYear = " + releaseYear +
                ", pageCount = " + pageCount +
                " } ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return authName.equals(book.authName) && authLName.equals(book.authLName) && title.equals(book.title);
    }

    public static void main(String[] args) {
        Book[] books = new Book[10];
        int releaseYear = 1850;
        books[0] = new Book("Abul","Fazl","Akbarnama",1605,2673);
        books[1] = new Book("Lewis","Carol","Alice in Wonderland",1865,52);
        books[2] = new Book("Karl","Marx","Communist Manifesto",1848,23);
        books[3] = new Book("Ernest","Hemingway","For Whom the Bell Tolls",1940,416);
        books[4] = new Book("Isaac","Newton","Principia",1687,495);
        books[5] = new Book("Alexander","Dumas","The Three Musketeers",1844,700);
        books[6] = new Book("Daniel","Defoe","Robinson Crusoe",1719,304);
        books[7] = new Book("Albert","Einstein","Theory of Relativity",1916,86);
        books[8] = new Book("Khushwant","Singh","The Company of Women",1999,294);
        books[9] = new Book("Salman","Rushdie","Satanic Verses",1988,546);
        for (int i = 0; i < 10; i++) {
            if (books[i].releaseYear > releaseYear)
            {
                System.out.println(books[i].toString());
            }
        }
    }
}
