import java.util.*;

public class Shapes {
    public static void main(String[] args) {
        double r, l, b;
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.print("Which program:\n\t1. Program 1\n\t2. Program 2\nChoose option: ");
        choice = sc.nextInt();

        System.out.print("Shapes:\n\t1. Circle\n\t2. Rectangle\n\t3. Triangle\nChoose option: ");
        int choice1 = sc.nextInt();

        switch (choice) {
            case 1: 
                Shape1 shape1 = new Shape1();
                switch (choice1) {
                    case 1:
                        System.out.print("Enter radius: ");
                        r = sc.nextDouble();
                        System.out.println("Area of circle is: " + shape1.calculateArea(r));
                        break;

                    case 2:
                        System.out.print("Enter length: ");
                        l = sc.nextDouble();
                        System.out.print("Enter breadth: ");
                        b = sc.nextDouble();
                        System.out.println("Area of rectangle is: " + shape1.calculateArea(l, b));
                        break;

                    case 3:
                        System.out.print("Enter base: ");
                        l = sc.nextDouble();
                        System.out.print("Enter height: ");
                        b = sc.nextDouble();
                        System.out.println("Area of triangle is: " + shape1.calculateArea(l, b, true));
                        break;

                    default:
                        System.out.println("Enter valid number.");
                }
                break;

            case 2:
                switch (choice1) {
                    case 1:
                        Circle circle = new Circle(sc);
                        System.out.println("Area of circle is: " + circle.calculateArea());
                        break;

                    case 2:
                        Rect rectangle = new Rect(sc);
                        System.out.println("Area of rectangle is: " + rectangle.calculateArea());
                        break;

                    case 3:
                        Tri triangle = new Tri(sc);
                        System.out.println("Area of triangle is: " + triangle.calculateArea());
                        break;

                    default:
                        System.out.println("Enter valid number.");
                }
                break;

            default:
                System.out.println("Enter valid program option.");
        }
        sc.close();
    } 
}

class Shape1 {
    double calculateArea(double r) {
        return Math.PI * r * r;  // Area of circle
    }

    double calculateArea(double l, double b) {
        return l * b;  // Area of rectangle
    }

    double calculateArea(double l, double h, boolean isTri) {
        if (isTri) {
            return 0.5 * l * h;  // Area of triangle
        }
        return -1;
    }
}

class Shape2 {
    double calculateArea() {
        return 0;  
    }
}

class Rect extends Shape2 {
    double l, b;

    Rect(Scanner sc) {
        System.out.print("Enter length: ");
        this.l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        this.b = sc.nextDouble();
    }

    @Override
    double calculateArea() {
        return l * b;
    }
}

class Circle extends Shape2 {
    double r;

    Circle(Scanner sc) {
        System.out.print("Enter radius: ");
        this.r = sc.nextDouble();
    }

    @Override
    double calculateArea() {
        return Math.PI * r * r;  
    }
}

class Tri extends Shape2 {
    double l, h;

    Tri(Scanner sc) {
        System.out.print("Enter base: ");
        this.l = sc.nextDouble();
        System.out.print("Enter height: ");
        this.h = sc.nextDouble();
    }

    @Override
    double calculateArea() {
        return 0.5 * l * h; 
    }
}
