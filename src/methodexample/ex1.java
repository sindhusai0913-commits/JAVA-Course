package methodexample;

import java.util.Scanner;

public class ex1 {
    public static void sumoftwonumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print number1 :");
        int number1 = sc.nextInt();
        System.out.println("Print number2: ");
        int number2 = sc.nextInt();
        int sum = number1+number2;
        System.out.println("   " +sum);

    }

    public static void main(String[] args) {
        sumoftwonumbers();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Print number1 :");
//        int number1 = sc.nextInt();
//        System.out.println("Print number2: ");
//        int number2 = sc.nextInt();
//        int sum = number1+number2;
//        System.out.println("   " +sum);



    }
}
