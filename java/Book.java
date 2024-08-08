public class Book 
{
    public static void main(String args[])
    {
        Library collection = new Library();
        collection.insert("Aa" , "ZZ" , 100);
        collection.insert("Bb" , "XX" , 102);
        collection.insert("Cc" , "YY" , 104);
        collection.insert("Dd" , "WW" , 106);
        collection.insert("Ee" , "QQ" , 108);

        collection.display();

        collection.delete(106);
        
        collection.display();
    }
}

class Book1
{
    public String title;
    public String authour;
    public int isbmNum;

    Book1()
    {
        title = null;
        authour = null;
        isbmNum = -1;
    }
}


class Library
{
    Book1[] books = new Book1[N];
    static final int N = 5;

    Library()
    {
        for(int i = 0; i< N ; i++)
        {
            books[i] = new Book1();
        }
    }

    public void insert(String title, String auth, int num)
    {
        int i;
        for(i=0; i<N ; i++)
        {
            if(books[i].isbmNum == -1)
            {
                books[i].title = title;
                books[i].authour = auth;
                books[i].isbmNum = num;

                System.out.println("Book " + title + " added successfully");
                break;
            }
        }
        
        if(i == N)
        {
            System.out.println("Collection is full");
        }

    }

    public void delete(int num)
    {
        int i;
        int index = search(num);    

        if(index == -1)
        {
            System.out.println("book not found");   
            return;
        }

        String btitle = books[index].title;
        for(i=index ; i< N-1 ; i++)
        {
            books[i] = books[i+1];
        }

        books[N-1] = new Book1();
        
        System.out.println("\nBook " + btitle + " deleted successfully\n");
    }

    private int search(int num)
    {
        int i;
        for(i = 0; i<N ; i++)
        {
            if(books[i].isbmNum == num)
            {
                return i;
            }
        }
        return -1;
    }

    
    
    
    public void display()
    {
        for(int i = 0; i < N; i++)
        {
            System.out.print(books[i].title + "\t" + books[i].authour + "\t" + books[i].isbmNum + "\n");
        }
    }

}
