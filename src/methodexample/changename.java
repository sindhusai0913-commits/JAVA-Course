package methodexample;

import java.util.Arrays;
import java.util.HashMap;

public class changename {
    public static void change(int[] nums){

          nums[0] = 30;
    }
    public static void main(String[] args) {
        HashMap sc = new HashMap();

        int arr[] = {2, 32, 43, 24, 35, 35, 76};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }


// here



}
