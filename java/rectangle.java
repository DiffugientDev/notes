import java.util.*;

public class rectangle
{
    public static void main(String[] args_Strings)
    {
        float l,b;
        
        Scanner sc = new Scanner(System.in);
        l = sc.nextFloat();
        b = sc.nextFloat();
        
        rect r1 = new rect(l,b);
        System.out.println("area = " + r1.calc_area() + "\nperimeter:  " + r1.calc_perimeter());
    }
}

class rect
{
    float height, width; 

    rect(float h, float w)
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