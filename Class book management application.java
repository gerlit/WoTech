import java.util.Scanner;

public class Main {
    
    public static BookManager bookManager = new BookManager();
    
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nWrite 1 to add a book");
            System.out.println("Write 2 to show all books");
            System.out.println("Write 3 to remove a book");
            var userInput = scanner.nextLine();
            if(userInput.equals("1")){
                addBook();
            } else if(userInput.equals("2")){
                showBooks();
            } else if(userInput.equals("3")){
                showBooks();
                System.out.println("\nWrite the title of the book you would like to remove");
                var bookTitle = scanner.nextLine();
                bookManager.removeBook(bookTitle);
            } else {
                scanner.close();
                break;
            }
        }
    }

    public static void addBook(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nWrite the book title: ");
        var title  = scanner.nextLine();

        System.out.println("Write the book author: ");
        var author  = scanner.nextLine();

        var book = new Book(title, author);
        bookManager.addBook(book);
    }

    public static void showBooks(){
        var books = bookManager.getBooks();
        for(var book : books){
            System.out.print("\nTitle: ");
            System.out.println(book.title);
            System.out.print("Author: ");
            System.out.println(book.author);
        }
    } 
}

public class Book{
  public String title;
  public String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }
}

import java.util.ArrayList;

public class BookManager {
  private ArrayList<Book> books = new ArrayList<Book>();

  public void addBook(Book book) {
    books.add(book);
  }

  public ArrayList<Book> getBooks() {
    return books;
  }

  public void removeBook(String bookTitle) {
    books.removeIf(book -> book.title.equals(bookTitle));
  }
}
