package compact;

public class Books {
   private int isbn;
   private String bookname;

    Books(){}

    Books(int isbn, String bookname)
    {
        this.isbn=isbn;
        this.bookname=bookname;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }



}
