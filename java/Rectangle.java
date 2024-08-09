import java.util.*;

public class Rectangle
{
    public static void main(String[] args_Strings)
    {
        float l,b;

        System.out.println("Enter height and width of rectangle: ");
        Scanner sc = new Scanner(System.in);
        l = sc.nextFloat();
        b = sc.nextFloat();
        sc.close();

        Rect r1 = new Rect(l,b);
        System.out.println("area = " + r1.calc_area() + "\nperimeter:  " + r1.calc_perimeter());
    }
}

class Rect
{
    float height, width;

    Rect(float h, float w)
    {
        this.height = h;
        this.width = w;
    }

    float calc_area()
    {
        return height * width;
    }

    float calc_perimeter()
    {
        return 2*(height + width);
    }
}
