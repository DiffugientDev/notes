import java.util.*;

public class Marks 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter 'honors', 'first' , 'second'");
        String inp = sc.nextLine();

        inp = inp.toLowerCase();
        sc.close();

        switch(inp)
        {
            case "honors":
                System.out.print("Marks are greater than 80%");
                break;
            
            case "first":
                System.out.print("Marks are between 65% and 80%");
                break;
            
            case "second":
                System.out.print("Marks are between 55% an 65%");
                break;

            default:
                System.out.print("Invalid input");
        }
    }

}
