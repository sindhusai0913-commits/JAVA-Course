package Library;

public class Book {

    private String bookname;
    private int bookId;
    private double bookprice;

    public Book(String bookname, int bookId, double bookprice) {
        this.bookname = bookname;
        this.bookId = bookId;
        this.bookprice = bookprice;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public double getBookprice() {
        return bookprice;
    }

    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", bookId=" + bookId +
                ", bookprice=" + bookprice +
                '}';
    }
}
