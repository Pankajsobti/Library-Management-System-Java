package util;
import model.Book;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {
    public static void saveBooks(List<Book> books){
        try{
           FileWriter writer = new FileWriter("books.txt");

           for(Book b : books){
               writer.write(
                       b.getId()+","+
                           b.getName()+","+
                           b.getAuthor()+","+
                           b.isIssued()+ "\n"
               );
           }writer.close();
        }catch(IOException e){
            System.out.println("Error Saving file");

        }
    }
}
