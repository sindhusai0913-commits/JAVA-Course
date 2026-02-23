package TreeSet;

public class Student implements Comparable<Student> {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.roll, o.roll);
    }

    @Override
    public String   toString() {
        return name + "  -  " + roll;
    }
}
