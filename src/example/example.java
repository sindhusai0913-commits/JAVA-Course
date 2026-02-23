package example;
// * it example of scope of variable8//
public class example {
    public static void main(String[] args) {
        // decalare the values with in class , so we can access any where in the program
        int a = 4;
        int b = 5;
        int Sum = a * b;
        for (int i = 0; i <= 6; i++) {
            int c = 6;
//            variables are declared inside a method, NOT inside the class.
            if (i == 0) {
                System.out.println("c : " + c);
            }
            else if (i == 1)
               System.out.println("Sum : " + Sum);
        }
        System.out.println("a : " + a);
        System.out.println("b : " + b);
//        System.out.println("c : " + c); // here we can't access  because it was out side of the class
    }
}