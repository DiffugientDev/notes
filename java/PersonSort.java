/*
  create a class person with 2 var name and age
 write a prog to 
    1. display details
    2. find oldest person
    3. sort persons by age
 */

import java.util.*;

public class PersonSort
{
   public static void main(String args[])
   {
      final int n = 2;
      Scanner sc = new Scanner(System.in);
      Person[] p = new Person[n];
      
      for(int i=0; i<n ;i++)
      {
         String nm  = sc.nextLine();
         int a = sc.nextInt();
         p[i] = new Person(nm, a);
      }

      System.out.println("Oldest in the group is " + p[oldest(p)]);




      sc.close();
   }

   static int oldest(Person[] p)
   {
      int old = p[0].age;
      int ind = 0;
      for(int i = 1 ; i <= p.length ; i++)
      {
         if(p[i].age > old)
            old = p[i].age;
            ind = i;
      }
      return ind;
   }

   static void sort(Person[] p)
   {
      Person t = new Person();
      for(int i=0;i<p.length-1; i++)
      {
         if(p[i].age > p[i+1].age)
         {
            t = p[i];
            p[i] = p[i+1];
            p[i+1] = t;
         }
      }
   }


}

class Person
{
   String name;
   public int age;

   Person()
   {

   }
   Person(String n, int a)
   {
      this.name = n;
      this.age = a;
   }

   void display()
   {
      System.out.println("Name: "  + this.name);
      System.out.println("Age: " + this.age);
   }
}
