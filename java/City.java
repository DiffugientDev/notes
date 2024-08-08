public class City 
{
    public static void main(String atgs[])
    {
        City1[] cities = new City1[5];

        cities[0] = new City1("Pune" , 1000);
        cities[1] = new City1("Mumbai" , 10000);
        cities[2] = new City1("Kolkata" , 7000);
        cities[3] = new City1("Delhi" , 8000);
        cities[4] = new City1("Chennai" , 4000);

        int i;
        for(i=0;i<4;i+=1)
        {
            cities[i].display();
        }
    }

}

class City1{
    String name;
    int population;

    City1(String nm, int pop)
    {
        this.name = nm;
        this.population = pop;
    }

    void display()
    {
        System.out.println("Name: " + name + "\tPopulation: " + population);
    }
}