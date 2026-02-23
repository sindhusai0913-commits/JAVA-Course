package BasicProgram;

import java.util.Scanner;

public class primenumber {

    public static boolean isPrimeorNot(int n){
        if(n <= 1)
        {
           return false;
        }
        for( int i = 2; i*i <= n; i++){
            if(n % i == 0)
            {
                return false;
            }


        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrimeorNot(i))
                count++;

        }

        System.out.println("Total primes from 1 to " + n + " = " + count);

    }

}
