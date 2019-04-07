package compact;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    //Creation of databse here..
    private List<Books> books;
    BookDaoImpl()
    {
        books=new ArrayList<>();
        books.add(new Books(1,"Java"));
        books.add(new Books(2,"Php"));
        books.add(new Books(3,"Python"));
        books.add(new Books(4,"Graphics"));
    }

    @Override
    public void savebook(Books b)
    {
      books.add(b);
    }

    @Override
    public List<Books> getAllBooks()
    {
        return books;
    }

    @Override
    public Books getBookById(int isbn)
    {
        Books book=books.get(isbn);
        return book;
    }

    @Override
    public void deleteBook(Books book)
    {
           books.remove(book);
    }

}
