import java.util.*;

public class StudentGrade
{
    public static void main(String args[])
    {
        System.out.print("Enter marks:  ");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        sc.close();
        if(mark > 100 || mark < 0)
            System.out.println("Invalid marks");
        else if(mark >= 80)
            System.out.println("Honors");
        else if(mark >= 65)
            System.out.println("First");
        else if(mark >= 55)
            System.out.println("Second");
        else
            System.out.println("Failed");
    }

}
