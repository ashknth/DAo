package compact;

public class AccessBook {
    public static void main(String[] args) {
        BookDao b = new BookDaoImpl();
        for (Books bb:b.getAllBooks()) {
            System.out.println(bb.getIsbn()+")"+bb.getBookname());
        }

        Books bb=b.getAllBooks().get(1);  //select query
        bb.setBookname("JQuery");
        bb.setIsbn(789);
       // System.out.println(bb.getIsbn()+")"+bb.getBookname());

        Books b1=new Books();
        b1.setBookname("Html");
        b1.setIsbn(999);
        b.savebook(b1);
        System.out.println("After update");
        for (Books bb1:b.getAllBooks()) {
            System.out.println(bb1.getIsbn()+")"+bb1.getBookname());
        }

    }
}
