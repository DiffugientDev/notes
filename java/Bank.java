//low balance == 500

import java.util.*;

public class Bank {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Bank1[] cust = new Bank1[n];

        for (int i = 0; i < cust.length; i++) 
        {
            System.out.println("Customer " + (i + 1));
            cust[i] = new Bank1(sc);
        }

        while(true) 
        {
            System.out.print("Enter account number: ");
            String acnum = sc.nextLine();
            int index = search(cust, acnum);

            if (index == -1) 
            {
                System.out.println("Invalid account number");
                continue;
            }

            System.out.print("Operations:\n\t1. Display\n\t2. Deposit\n\t3. Withdraw\n\t4. Number of customers with low balance\n\t5. Exit\nEnter serial number: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) 
            {
                case 1:
                    cust[index].display(sc);
                    break;
                case 2:
                    cust[index].deposit(sc);
                    break;
                case 3:
                    cust[index].withdraw(sc);
                    break;
                case 4:
                    System.out.println("Number of customer with low balance: " + lowBalNum(cust));
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Enter a valid number.");
            }
        }
    }

    static int search(Bank1[] b, String acnum) 
    {
        
        for (int i = 0; i < b.length; i++) 
        {
            if (acnum.equals(b[i].getAcc()))
            {
                return i;
            }
        }
        return -1;
    }

    static int lowBalNum(Bank1[] b)
    {
        int count=0;
        for(int i=0 ; i< b.length ; i++)
        {
            if(b[i].lowBalance())
                count++;
        }
        return count;
    }
}

class Bank1 
{
    private String name, acc_type;
    final private String acc_num;
    private double balance;

    // Constructor with Scanner passed as parameter
    Bank1(Scanner sc) 
    {
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Account Type: ");
        this.acc_type = sc.nextLine();
        System.out.print("Enter Account number: ");
        this.acc_num = sc.nextLine();
        System.out.print("Enter Balance: ");
        this.balance = sc.nextDouble();
        sc.nextLine(); // Consume newline
    }

    void display(Scanner sc) 
    {
        System.out.print("What would you like to be displayed?\n\t1. Name\n\t2. Account Type\n\t3. Account Number\n\t4. Balance\n\t5. Type of Customer\nEnter serial number: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice)
        {
            case 1:
                System.out.println("Name: " + this.name);
                break;
            case 2:
                System.out.println("Account Type: " + this.acc_type);
                break;
            case 3:
                System.out.println("Account number: " + this.acc_num);
                break;
            case 4:
                System.out.println("Balance: " + this.balance);
                break;
            case 5: 
                System.out.println(typeofCustomer());
            default:
                System.out.println("Enter valid choice: ");
        }
    }

    void deposit(Scanner sc) 
    {
        System.out.print("Enter Amount to be deposited: ");
        double amt = sc.nextDouble();
        sc.nextLine(); // Consume newline

        this.balance += amt;
        System.out.println(amt + " deposited successfully");
    }

    void withdraw(Scanner sc) 
    {
        System.out.print("Enter Amount to be withdrawn: ");
        double amt = sc.nextDouble();
        sc.nextLine(); // Consume newline

        if (balance-amt < 500) 
            System.out.println("Low balance");
        else 
        {
            balance -= amt;
            System.out.println(amt + " withdrawn successfully");
        }
    }

    String getAcc()
    {
        return acc_num;
    }

    boolean lowBalance()
    {
        if(this.balance > 500)
            return true;
        return false;
    }

    String typeofCustomer()
    {
        if(balance > 5000000)
            return "Diamond Customer";
        else if(balance > 1000000)
            return "Gold Customer";
        else if(balance > 50000)
            return "Silver Customer";
        else
            return "Regular Customer";        
    }
}
