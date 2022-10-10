public class Book {
    String authName;
    String authLName;
    String title;
    int releaseYear;
    int pageCount;

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

    }
}
