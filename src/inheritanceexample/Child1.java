package inheritanceexample;

public class Child1 extends parent {

    @Override
    public void empSalary() {
        System.out.println("Child name is Jaixu");
    }


    public static void main(String[] args) {
        System.out.println("It is a Child Method");
        Child1 c = new Child1();
        c.empSalary();

    }
}
