package Lab_Part;
import java.util.Scanner;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Add DVD");
            System.out.println("3. Add Member");
            System.out.println("4. Display All Items");
            System.out.println("5. Check Out Item");
            System.out.println("6. Check In Item");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Item ID: ");
                    int bookId = scanner.nextInt();
                    Book book = new Book(bookTitle, bookId, author);
                    library.addItem(book);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter DVD Title: ");
                    String dvdTitle = scanner.nextLine();
                    System.out.print("Enter Director: ");
                    String director = scanner.nextLine();
                    System.out.print("Enter Item ID: ");
                    int dvdId = scanner.nextInt();
                    DVD dvd = new DVD(dvdTitle, dvdId, director);
                    library.addItem(dvd);
                    System.out.println("DVD added successfully!");
                    break;

                case 3:
                    System.out.print("Enter Member Name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    Member member = new Member(memberName, memberId);
                    library.addItem(member);
                    System.out.println("Member added successfully!");
                    break;

                case 4:
                    library.displayAllItems();
                    break;

                case 5:
                    System.out.print("Enter Item ID to Check Out: ");
                    int checkOutItemId = scanner.nextInt();
                    LibraryItem itemToCheckOut = library.findItemById(checkOutItemId);
                    if (itemToCheckOut != null) {
                        itemToCheckOut.checkOut();
                        System.out.println("Item checked out successfully!");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Item ID to Check In: ");
                    int checkInItemId = scanner.nextInt();
                    LibraryItem itemToCheckIn = library.findItemById(checkInItemId);
                    if (itemToCheckIn != null) {
                        itemToCheckIn.checkIn();
                        System.out.println("Item checked in successfully!");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}