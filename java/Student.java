import java.util.*;

public class Student 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student1[] student = new Student1[3];

        student[0] = new Student1("Ann", "Pune");
        student[1] = new Student1("John" , "Mumbai");
        student[2] = new Student1("Sarah" , "Pune");

        System.out.println("Enter address: ");
        String add = sc.nextLine();
        
        int i;
        
        for(i = 0 ; i < 3 ; i++)
        {
            if(add.equals(student[i].address))
            {
                System.out.println(student[i].name);
            }
        }

    }    
}

class Student1
{
    public String name;
    public String address;

    Student1(String n, String a)
    {
        this.name = n;
        this.address = a;
    }

}
