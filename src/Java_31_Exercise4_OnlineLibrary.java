import java.util.Scanner;
import java.util.ArrayList;

class Library{
    ArrayList<String> storeBooks = new ArrayList<>();
    ArrayList<String> issuedBook = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    Library(){
        System.out.println("Welcome to Online Library");
        storeBooks.add("Chemistry");
        storeBooks.add("Physics");
        storeBooks.add("Mathematics");
        storeBooks.add("Biology");
    }

    void addBook(){
        System.out.println("========");
        System.out.println("Add Book");
        System.out.println("========");
        System.out.println("Write name of a book you want to add");
        String book = scanner.nextLine();
        storeBooks.add(book);
    }

    void issueBook(){
//        this.showAvailableBooks();
        System.out.println("==========");
        System.out.println("Issue Book");
        System.out.println("==========");
        System.out.println("Write Number of a Book you want to issue");
        int no = scanner.nextInt();
        if(no < 0 || no > storeBooks.size()){
            System.out.println("Write valid Book Number");
        }
        else {
            issuedBook.add(storeBooks.get(no-1));
            System.out.println("Book issued successfully!");
        }
    }

    void returnBook(){
        this.showIssuedBooks();
        System.out.println("Write Number of a Book you want to return");
        int no = scanner.nextInt();
        if(no < 0 || no > issuedBook.size()){
            System.out.println("Write valid Book Number");
        }
        else {
            issuedBook.remove(no-1);
            System.out.println("Book returned successfully!");
        }
    }

    void showAvailableBooks(){
        if(storeBooks.isEmpty()){
            System.out.println("No Books Available");
        }
        else{
            System.out.println("Available Books:");
            for(int i = 0; i < storeBooks.size(); i++){
                System.out.println((i + 1) + ". " + storeBooks.get(i));
            }
        }
    }

    void showIssuedBooks(){
        if(issuedBook.isEmpty()){
            System.out.println("No Book Issued");
        }
        else{
            System.out.println("Issued Books:");
            for(int i = 0; i < issuedBook.size(); i++){
                System.out.println((i + 1) + ". " + issuedBook.get(i));
            }
        }
    }
}

public class Java_31_Exercise4_OnlineLibrary {
    static void main(String[] args) {
        Library library = new Library();
        library.showAvailableBooks();
        library.showIssuedBooks();
        library.addBook();
        library.showAvailableBooks();
        library.issueBook();
        library.showIssuedBooks();
        library.issueBook();
        library.showIssuedBooks();
        library.returnBook();
        library.showIssuedBooks();
    }
}
