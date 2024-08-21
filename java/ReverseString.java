//write a program to take strings from user and reverse their poitions in the array.also reverse each string

import java.util.*;


//Using string methods
/*

public class ReverseString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        String arr[] = s1.split(" ");
        String s2 = "";
        String s3 = "";
        sc.close();


        for(int i=arr.length-1;i>=0 ; i--)
        {
            //add string to s2 in reverse order
            s2 = s2 + arr[i] + " ";


            //reverse the word
            String rev ="";
            for(int j=0 ; j<(arr[i]).length() ; j++)
            {
                char ch = arr[i].charAt(j);
                rev = ch + rev;
            }
            s3 = s3 + rev + " ";
        }

        System.out.println(s2);
        System.out.println(s3);
        
    }
}



*/




public class ReverseString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of strings:  ");
        int n = sc.nextInt();

        String[] arr  = new String[n];
        String[] revArr = new String[n];
        String[] revArrElement = new String[n];

        //enter strings
        for(int i=0; i<n ; i++)
        {
            System.out.println("Enter String"+ (i+1));
            arr[i] = sc.next();
        }

        //reversed array
        for(int i=0; i<n ; i++)
        {
            revArr[n-i-1] = arr[i];


            //reversed word
            String rev ="";
            for(int j=0 ; j<(arr[i]).length() ; j++)
            {
                char ch = arr[i].charAt(j);
                rev = ch + rev;
            }

            revArrElement[n-i-1] = rev;
        }

        System.out.print ("Reversed Array: ");
        printArr(revArr);

        System.out.print ("\nReversed Array and Elements: ");
        printArr(revArrElement);
        
        sc.close();
    }

    static void printArr(String[] arr)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print (arr[i] + " ");
        }
    }
}
