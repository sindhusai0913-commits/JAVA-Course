package BasicProgram;

import java.util.Arrays;

public class EvenorOddCheck {
    int a;
    int b;

    public EvenorOddCheck(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int[] EvenorAdd(int a, int b)
    {
        int [] even = new int[2];
        even[0] = (a%2 == 0) ? 1 : 0;
        even[1] = (b%2 == 0) ? 1 : 0;
        return even;

    }

    public static void main(String[] args) {
        EvenorOddCheck obj = new EvenorOddCheck(24, 10);
        int[] odd = obj.EvenorAdd(25, 10);
//        System.out.println(odd[0]);
//        System.out.println(odd[1]);
        System.out.println(Arrays.toString(odd));

    }

}
