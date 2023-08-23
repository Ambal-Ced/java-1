package library;//location cannot be access by those file not on same location
import java.util.Scanner; //for the compiler to read that user can input a data

public class Main {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);//Format for scanner

        System.out.print("Enter book title: ");/* didn't use println to avoid the
        user input to be put on next line */
        String title = scanner.nextLine();/* String can be combined and not the next line
        indicates that it will read all the text until the user press enter */

        System.out.print("Enter author's name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter author's nationality: ");
        String nationality = scanner.nextLine();

        System.out.print("Enter publication year: ");
        int year = scanner.nextInt();

        scanner.close();//indicates the end of using scanner to avoid memory leak
        //separate it so it won't be confusing
        Author author = new Author(authorName, nationality);//this will connect to other java file
        Book book = new Book(title, author, year);

        System.out.println("\nBook details:");//println so that it's not gonna conjoint with the next line
        System.out.println(book);
    }
}
