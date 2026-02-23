package inheritanceexample;

public class parent {

    public void empSalary()
    {
       System.out.println("Employee name: Lin Yu Sen");
    }


    public static void main(String[] args) {
        System.out.println("It is a Parent Method");
        parent p = new parent();
        p.empSalary();


    }

}
