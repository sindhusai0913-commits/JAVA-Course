package BasicProgram;


//import java.util.Arrays;


public class Basic {
    public int[] Example(int x, int y)
        // here we have taken x and y as a input parameters
    {
        int[] arr = new int[5];
        arr[0] = x+y;
        arr[1] = x-y;
        arr[2] = x*y;
        arr[3] = x/y;
        arr[4] = x%y;
        return arr;
    }

    public static void main(String[] args) {
        Basic call = new Basic();
        int[] result = call.Example(10, 5); // pass the values
//        System.out.println(Arrays.toString(result));
        for (int s : result)
            System.out.println(s);
    }
}
