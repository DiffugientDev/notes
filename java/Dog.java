import java.util.*;

public class Dog 
{
    public static void main(String args[])
    {
        Dog1[] dogs = new Dog1[2];

        dogs[0] = new Dog1("Race", "Husky");
        dogs[1] = new Dog1("Tim", "Pomerian");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and breed of dog:  ");
        String nm = sc.nextLine();
        String br = sc.nextLine();
        dogs[1].setter(nm, br);

        System.out.println("Name\tBreed");
        int i;
        for(i=0;i<2;i++)
        {
            dogs[i].display();
        }

    }
}

class Dog1
{
    String name;
    String breed;

    Dog1(String nm, String breed)
    {
        this.name = nm;
        this.breed = breed;
    }

    void setter(String nm, String br)
    {
        name = nm;
        breed = br;
    }

    void display()
    {
        System.out.println(name + "\t" + breed);
    }
}
