class Employee
{
    public static void main(String[] args)
    {
        Employee1 e1 = new Employee1("Anu","CEO");
        Employee1 e2 = new Employee1("Sarah","Employee");
        Employee1 e3 = new Employee1("Mira","Employee");
        Employee1 e4 = new Employee1("Zoe","Director");
        Employee1 e5 = new Employee1("Anne","Manager");
        Employee1 e6 = new Employee1("Aria","Employee");

        System.out.println("Employee details: ");
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
        e6.display();


        e3.updateSal("Manager");
    }

}

class Employee1
{
    String name, jobTitle;
    int salary;

    Employee1(String n, String j)
    {
        this.name = n;
        this.jobTitle = j;
        salary = calculateSal(jobTitle);
    }

    int calculateSal(String jobTitle)
    {
        if(jobTitle.equals("CEO"))
            salary = 10000000;

        else if(jobTitle.equals("Vice President"))
            salary = 8000000;

        else if(jobTitle.equals("Director"))
            salary = 4000000;

        else if(jobTitle.equals("Manager"))
            salary = 2000000;

        else
            salary = 1000000;

        return salary;
    }

    public void updateSal(String newJobTitle)
    {
        jobTitle = newJobTitle;
        salary = calculateSal(newJobTitle);
    }

    public void display()
    {
        System.out.println(name+" " + jobTitle + " " + salary + "\n");
    }

}
