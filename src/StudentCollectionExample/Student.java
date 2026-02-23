package StudentCollectionExample;

public class Student{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
 /// wrote the 2 methods
    public int getRollno()
    {
        return rollno;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
