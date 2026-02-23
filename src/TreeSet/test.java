package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class test {

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        System.out.println( "We have sorted the roll number by using compareTo operator" );
        students.add(new Student("Kanha", 2222));
        students.add(new Student("Radha" ,2000) );
        students.add(new Student("Kridha",1520) );
        students.add(new Student("Vrindha",2100) );
        for(Student S : students)
        System.out.println(S);

        TreeSet<Student> set2 = new TreeSet<>(new NameComparator());
        System.out.println( "We have sorted the name by using comparator operator" );

        set2.add(new Student("sai", 5));
        set2.add(new Student("teja", 2));
        set2.add(new Student("sweety", 1));
        set2.add(new Student("Yusen", 4));
        set2.add(new Student("sindhu", 3));
        for(Student S2 : set2)
        System.out.println(S2);

        TreeSet<Student> set3 = new TreeSet<>(new RollComparator());
//        TreeSet<Student> set3 = new TreeSet<>(Comparator.comparing((Student s) -> s.name).thenComparingInt(s -> s.roll));
        System.out.println( "We have sorted the Roll numbers by using comparator operator" );
        set3.add(new Student("Yusen",12));
        set3.add(new Student("Lin",13));
        set3.add(new Student("Sang",10));
        set3.add(new Student("Zhi Zhi",9));
        set3.add(new Student("Nie",11));
        for(Student S3: set3)
            System.out.println(S3);



    }



}
