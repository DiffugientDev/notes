import java.util.*;

public class Library
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of books in library are: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Book[] b = new Book[n];
        //insert book
        for(int i=0; i<b.length; i++)
        {
            b[i] = new Book(sc);
        }

        //issue book



        sc.close();
    }

    static int search(Book[] b, Scanner sc)
    {
        String bName = sc.nextLine();
        String aName = sc.nextLine();
        String ed = sc.nextLine();
        for(int i=0; i<b.length ;i++)
        {
            if((b[i].bookName).equals(bName) && (b[i].authName).equals(aName) && (b[i].bookEd).equals(ed))
                return i;
        }
        return -1;
    }

    static void issue(Book[] b, Scanner sc)
    {
        int i = search(b,sc);
        if( i > -1)
            b[i].copies --;
        else
            System.out.print("no book found");
    }
}

class Book
{
    public String bookName;
    public String authName;
    public String bookID;
    public String bookEd;
    private double price;
    public int copies;

    Book(Scanner sc)
    {
        System.out.print("Book Name: ");
        this.bookName = sc.nextLine();

        System.out.print("Author Name: ");
        this.authName = sc.nextLine();

        System.out.print("Book ID: ");
        this.bookID = sc.nextLine();

        System.out.print("Edition Number: ");
        this.bookEd = sc.nextLine();

        System.out.print("Number of copies: ");
        this.copies = sc.nextInt();

        System.out.print("Price: ");
        this.price = sc.nextDouble();
    }

}
