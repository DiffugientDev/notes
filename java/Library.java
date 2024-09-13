import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Library1 lib1 = new Library1();

        
        while(true)
        {
            System.out.println("Operations:\n\t1. Add book\n\t2. Delete Book\n\t3. Search Book\n\t4. Display Books\n\t5. Exit\nChoose option.");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    lib1.insert(sc);
                    break;

                case 2:
                    lib1.remove(sc);
                    break;

                case 3:
                    int n = lib1.search(sc);
                    if(n >= 0)
                        System.out.println("Book Exists in library");
                    else
                         System.out.println("Book does not exist in library");
                    break;
                    

                case 4:
                    System.out.println("Name\tAuthor\tEdition");
                    for(int i=0 ; i<lib1.books.size() ; i++)
                    {
                        System.out.println(lib1.books.get(i).bookName + "\t" + lib1.books.get(i).authName + "\t" + lib1.books.get(i).edition);
                    }
                    break;


                case 5:
                    sc.close();
                    System.out.println("Exiting");
                    return;
                
                default:
                    System.out.println("Enter valid option.");
                    break;
            }
        }

        
    }
}

class Book
{
    String bookName;
    String authName;
    int edition;
    String bookID;
    double bookPrice;
    int copies; 
    Book(Scanner sc)
    {
        System.out.println("Enter Book name: ");
        this.bookName = sc.nextLine();
        System.out.println("Enter Author name: ");
        this.authName = sc.nextLine();
        System.out.println("Enter Edition Number: ");
        this.edition = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book ID: ");
        this.bookID = sc.nextLine();
        System.out.println("Enter Book price: ");
        this.bookPrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Book copies: ");
        this.copies = sc.nextInt();
        sc.nextLine();
    }
}
class Library1
{
    ArrayList<Book> books;

    Library1()
    {
        books = new ArrayList<Book>();
    }

    void insert(Scanner sc)
    {
        Book b  = new Book(sc);
        this.books.add(b);
        System.out.println("Book has been added successfully.");
    }

    void remove(Scanner sc)
    {
        System.out.print("Which book do you want to remove?");
        int n = search(sc);
    
        if(n >= 0)
        {
            this.books.remove(n);
            System.out.println("Book has been deleted successfully.");
        }

        else
            System.out.println("Enter valid name.");
    }


    int search(Scanner sc)
    {
        System.out.println("Enter name: ");
        String nm = sc.nextLine();
        System.out.println("Enter author: ");
        String auth = sc.nextLine();
        System.out.println("Enter edition: ");
        int ed = sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i<books.size(); i++)
        {
            if(books.get(i).bookName.equals(nm) && books.get(i).authName.equals(auth) && books.get(i).edition == ed && books.get(i).copies > 0)
            {
                return i;
            }
        }
        return -1;
        
    }

}
