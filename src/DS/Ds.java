package DS;

// prgm to read an integer and string

import java.io.DataInputStream;
import java.io.IOException;

public class Ds {
    public static void main(String[] args) throws IOException {

                DataInputStream d = new DataInputStream(System.in);
                System.out.println( "Enter a number: ");
                int i = Integer.parseInt(d.readLine());
                System.out.println("Enter a number "  +i);

                String s = d.readLine();
        System.out.println( "Enter a name: ");

         System.out.println("Enter a name "  +s);



    }

}
