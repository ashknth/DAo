package compact;
import java.util.List;

public interface BookDao
{
    void savebook(Books b);
    public List<Books> getAllBooks();
    Books getBookById(int isbn);
    void deleteBook(Books book);

}
