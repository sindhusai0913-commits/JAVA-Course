package Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Geek {
    public static void main(String[] args) throws IOException {
        // here we use IOExecption becoz , readLine throws an execption while compileing so, we can try and catch

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();

//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        float b = scan.nextFloat();
//        scan.nextLine();
//        String c = scan.nextLine();
//        System.out.println(c);
//        System.out.println(b);
        System.out.println(s);

    }
}
