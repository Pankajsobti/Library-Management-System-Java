package service;
import exception.BookNotFoundException;
import model.Book;
import util.FileManager;
import java.util.ArrayList;
import java.util.List;



public class LibraryService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added Successfully.");

    }
    public void viewBooks(){
        if(books.isEmpty()){
            System.out.println("No books available");
            return;
        }
        for(Book b: books){
            System.out.println(b);
        }
    }
    public Book searchBook(int id) throws BookNotFoundException{
        for(Book b: books){
            if(b.getId()==id){
                return b;
            }
        }
        throw new BookNotFoundException("Book not found with ID " + id);
    }

    public void issueBook(int id){
        try{
            Book b= searchBook(id);
            if(b.isIssued()){
                System.out.println("Book already issued.");
            }else{
                b.issueBook();

                System.out.println("Book issued successfully");
            }
        }catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void returnBook(int id){
        try{
            Book b= searchBook(id);

            if(!b.isIssued()){
                System.out.println("Book was not issued");
            }else{
                b.returnBook();
                System.out.println("Book returned successfully.");
            }
        }catch (BookNotFoundException e){
            System.out.println(e.getMessage());

        }
    }
    public void saveData(){
        FileManager.saveBooks(books);
    }
}
