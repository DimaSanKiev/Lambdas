public class Book {
    private String mTitle;
    private String mAuthor;
    private int mPublicationYear;

    public Book(String title, String author, int publicationYear) {
        mTitle = title;
        mAuthor = author;
        mPublicationYear = publicationYear;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public int getPublicationYear() {
        return mPublicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "mTitle='" + mTitle + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mPublicationYear=" + mPublicationYear +
                '}';
    }
}
