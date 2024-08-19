package inheritance;

public class Box 
{
    public static void main(String[] args)
    {
        System.out.println("\n");
        InheritBox box1 = new InheritBox(1,2,3,4);
        InheritBox box2 = new InheritBox(7,8,9,10);
        InheritBox box3 = new InheritBox();
        InheritBox mycube = new InheritBox(3,2);
        InheritBox myclone = new InheritBox(box1);

        int vol;

        vol = box1.volume();
        display("box1",vol);
        vol = box2.volume();
        display("box2",vol);
        vol = box3.volume();
        display("box3",vol);
        vol = mycube.volume();
        display("mycube",vol);
        vol = myclone.volume();
        display("myclone",vol);
    }

    //static functions can only call static methods.
    static void display(String nm, int vol)
    {
        System.out.println(nm+" volume is "+vol);
    }
    
}

class Box1
{
    int height;
    int width;
    int length;

    Box1(Box1 b)
    {
        this.height = b.height;
        this.width = b.width;
        this.length = b.length;
    }

    Box1()
    {
        height = -1;
        width = -1;
        length = -1;
    }

    Box1(int h, int w, int l)
    {
        this.height = h;
        this.width = w;
        this.length = l;
    }

    //for cube
    Box1(int len)
    {
        this.height = this.width = this.length = len;
    }

    int volume()
    {
        return height*length*width;
    }
}

class InheritBox extends Box1
{
    int weight;
    InheritBox(InheritBox ib)
    {
        //directly initialize att of superclass
        super(ib.height, ib.width, ib.length);
        this.weight = ib.weight;

    }

    InheritBox(int h, int w, int l, int wt)
    {
        super(h,w,l);
        this.weight = wt;
    }

    InheritBox()
    {
        super();
        this.weight = -1;
    }

    InheritBox(int len, int wt)
    {
        super(len);
        this.weight = wt;
    }
    
}
