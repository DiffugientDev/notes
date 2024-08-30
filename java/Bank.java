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

            System.out.print("Operations:\n\t1. Display\n\t2. Deposit\n\t3. Withdraw\n\t4. Exit\nEnter serial number: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) 
            {
                case 1:
                    cust[index].display();
                    break;
                case 2:
                    cust[index].deposit(sc);
                    break;
                case 3:
                    cust[index].withdraw(sc);
                    break;
                case 4:
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
            if (acnum.equals(b[i].acc_num)) 
            {
                return i;
            }
        }
        return -1;
    }
}

class Bank1 
{
    private String name, acc_type;
    public String acc_num;
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

    void display() 
    {
        System.out.println("\nAccount information of " + this.acc_num + ":\nName: " + this.name +
                "\nAccount Type: " + this.acc_type + "\nAccount number: " + this.acc_num +
                "\nBalance: " + this.balance + "\n");
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

        if (balance < amt) 
        {
            System.out.println("Insufficient balance");
        } else {
            balance -= amt;
            System.out.println(amt + " withdrawn successfully");
        }
    }
}
