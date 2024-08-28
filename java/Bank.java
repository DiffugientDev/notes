import java.util.*;

public class Bank 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String nm = sc.nextLine();
        System.out.println("Enter Account Type: ");
        String actype = sc.nextLine();
        System.out.println("Enter Account number: ");
        int acnum = sc.nextInt();
        System.out.println("Enter Balance: ");
        double bal = sc.nextDouble();
        sc.close();

        Bank1 cust1 = new Bank1(nm, actype,acnum,bal);
        cust1.display();
        cust1.withdraw(700);
        cust1.display();
        cust1.deposit(100.6);
        cust1.display();
    }
}

class Bank1
{
    String name, acc_type;
    private int acc_num;
    private double balance;

    Bank1(String nm, String acc_t, int acnum, double bal)
    {
        this.name = nm;
        this.acc_type = acc_t;
        this.acc_num = acnum;
        this.balance = bal;
    }

    void display()
    {
        System.out.println("\nAccount information of " + this.acc_num + ":\nName: " + this.name + "\nAccount Type: "+  this.acc_type + "\nAcount number: " + this.acc_num+ "\nBalance: " + this.balance + "\n");
    }

    void deposit(double amt)
    {
        this.balance += amt;
        System.out.println(amt + " deposited successfully");
    }

    void withdraw(double amt)
    {
        if(balance < amt )
            System.out.println("Balance is low");
        else
        {
            balance -= amt;
            System.out.println(amt + " withdrawn successfully");
            
        }
    }
}
