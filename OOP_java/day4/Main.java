package OOP_java.day4;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Ronaldo is the best", "Ronaldo", 5);
        Library library = new Library();

        library.addBook(book1);
        String nameBook = book1.getName();
        String author = book1.getAuthor();
        int quantity = book1.getQuantity();
        System.out.println("thong tin cuon sach:" + nameBook +"\n"+"Tác giả: "+ author +"\n"+ "Số lượng:" + quantity);

        Member member1 = new MemberLibrary("Bao",library);

        member1.borrowBook(book1);

        System.out.println("Số sách có tên " + book1.getName()+" tác giả"+ book1.getAuthor() + " còn lại: " + book1.getQuantity());

        member1.returnBook(book1);
        System.out.println("Số sách còn lai " + book1.getName() + " hiện có: " + book1.getQuantity());
    }
}