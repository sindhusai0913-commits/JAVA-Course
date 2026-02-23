package Course;

public class Course {
    // variables assign
    String CourseName;
    String CourseCode;
    double PriceAmount;

    public Course ( // creating constructor
                    String name, String Code, double Amount  // intialize the values/ variables
    )
    {
        CourseName = name;
        CourseCode = Code;
        PriceAmount = Amount;
    }


    public void displayCourseDetails() {
        // print the details; format price to 2 decimal places
        System.out.println("Course Name : " + CourseName);
        System.out.println("Course Code : " + CourseCode);
        System.out.printf("Course Price: ₹%.2f%n", PriceAmount);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
//        System.out.println("Course Name : " + CourseName);
//        System.out.println("Course Code : " + CourseCode);
//        System.out.printf("Course Price: ₹%.2f%n", PriceAmount);
//        System.out.println("---------------------------");
        Course JavaCourse = new Course("JavaBasics", "J123", 999.99);
        Course BackDev    = new Course("DevBasic",   "BD123", 1999.99);

        // Call the method to print details for each course
        JavaCourse.displayCourseDetails();
        BackDev.displayCourseDetails();

    }
}
