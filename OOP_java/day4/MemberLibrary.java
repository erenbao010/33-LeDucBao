package OOP_java.day4;

import java.util.List;

public class MemberLibrary implements Member{

        private String name;
        private Library library;

        public MemberLibrary(String name, Library library) {
            this.name = name;
            this.library = library;
        }

        public String getName() {
            return name;
        }

    public void borrowBook(Book book) {
        System.out.println(name + " đã mượn cuốn sách " + book.getName());
        book.setQuantity(book.getQuantity() - 1);
    }

    public void returnBook(Book book) {
        System.out.println(name + " đã trả cuốn " + book.getName());
        book.setQuantity(book.getQuantity() + 1);
    }
    }

