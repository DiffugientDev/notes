/*
 write a java app for shopping cart class  -- that handles various aspects of user's shopping experience
 write methods
    1. add 1 item to cart
    2. add multiple items with specific qty to cart
    3. add items with quantity
    4. add items with qty and price

    calculate bill

 */

import java.util.*;

public class ShoppingCartApp 
{
    ArrayList <Items> cart = new ArrayList<>();
    
    void addItems(String name, double price, int qty)
    {
        Items thing = new Items(name, price, qty);
        cart.add(thing);
    }
    
    
}

class Items
{
    String name;
    int quantity;
    double price;

    Items(String nm, double p, int q,)
    {
        this.name = nm;
        this.quantity = q;
        this.price = p;
    }
}


/*
import java.util.ArrayList;
import java.util.Scanner;

class ShoppingCart
{
    private class Item
    {
        String name;
        int quantity;
        double price;

        Item(String name,
             int quantity,
             double price)
        {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    }

    private ArrayList<Item> cart;

    // Constructor
    public ShoppingCart()
    {
        cart = new ArrayList<>();
    }

    // Method to add one item to the cart
    public void addItem(String itemName,
                        double price)
    {
        addItem(itemName, price, 1);
    }

    // Method to add multiple items with specific quantity to the cart
    public void addMultipleItems(String itemName,
                                 double price,
                                 int quantity)
    {
        addItem(itemName, price, quantity);
    }

    // Method to add items with quantity
    private void addItem(String itemName,
                         double price,
                         int quantity)
    {
        for (Item item : cart)
        {
            if (item.name.equals(itemName))
            {
                item.quantity += quantity; // Update existing item quantity
                return;
            }
        }
        // If item is not found, add a new item
        cart.add(new Item(itemName, quantity, price));
    }

    // Method to calculate the total bill
    public double calculateBill()
    {
        double total = 0;
        for (Item item : cart)
        {
            total += item.quantity * item.price;
        }
        return total;
    }

    // Method to display cart items
    public void displayCart()
    {
        System.out.println("Items in your cart:");
        for (Item item : cart)
        {
            System.out.printf("Item: %s, Quantity: %d, Price: $%.2f%n", item.name, item.quantity, item.price);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        String choice;

        System.out.println("Welcome to the Shopping Cart!");

        // User interaction loop
        while (true)
        {
            System.out.println("Enter command (add, bill, display, exit):");
            choice = scanner.nextLine().trim().toLowerCase();

            switch (choice)
            {
                case "add":
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    cart.addMultipleItems(itemName, price, quantity);
                    break;
                case "bill":
                    double totalBill = cart.calculateBill();
                    System.out.printf("Total Bill:", totalBill);
                    break;
                case "display":
                    cart.displayCart();
                    break;
                case "exit":
                    System.out.println("Exiting the shopping cart. Thank you!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }

    }
}
*/
