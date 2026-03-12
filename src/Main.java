import model.Book;
import service.LibraryService;
import threads.ReminderThread;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        LibraryService library = new LibraryService();

        ReminderThread thread = new ReminderThread();

        thread.start();

        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("\n======== Library Menu ========");

            System.out.println("1 Add Book");
            System.out.println("2 view Books");
            System.out.println("3 Issue Book");
            System.out.println("4 Return Book");
            System.out.println("5 Save and Exit ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter ID: ");
                    int id= sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter book name");
                    String name= sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author= sc.nextLine();

                    library.addBook(new Book(id, name, author));

                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    library.issueBook(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter book ID: ");
                    library.returnBook(sc.nextInt());
                    break;
                case 5:
                    library.saveData();
                    System.out.println("Data Saved. Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
