package AddandSubtract;

//import java.util.Arrays;

public class AddandSubtract {
   public int[] add(int x, int y)
   {
       int[] sum = new int[2];
       sum[0] = x+y;
       sum[1] = x-y;
        return sum;

   }

    public static void main(String[] args) {
        // create object
        AddandSubtract res = new AddandSubtract();
        // we will call method and we need to store the vale in a variable
        int[] result = res.add(40, 30);
//        System.out.println(Arrays.toString(result));
        // we can use for loop without array
        for (int r : result)
            System.out.println(r);
    }

}
