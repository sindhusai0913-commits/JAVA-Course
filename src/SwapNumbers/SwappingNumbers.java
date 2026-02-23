package SwapNumbers;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        // swapping of number a and b
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println( a+ "      " +b);
    }

}
