class employeeProg 
{
    public static void main(String[] args)
    {
        employee e1 = new employee("Anu","CEO");
        employee e2 = new employee("Sarah","Employee");
        employee e3 = new employee("Mira","Employee");
        employee e4 = new employee("Zoe","Director");
        employee e5 = new employee("Anne","Manager");
        employee e6 = new employee("Aria","Employee");

        System.out.println("Employee details: ");
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
        e6.display();


        e3.updateSal("Manager");

        System.out.println("\n\nAfter updating\nEmployee details: ");
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
        e6.display();
    }

}

class employee
{
    String name, jobTitle;
    int salary;

    employee(String n, String j)
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

        else if(jobTitle.equals("Drector"))
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
        System.out.println(name+" " + jobTitle + " " + salary);
    }

}