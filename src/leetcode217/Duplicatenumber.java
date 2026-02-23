package leetcode217;
//[1,2,1,1,1] - print true if element in the array is repeat twice or print false if not repeated
// sol - i am using hashset here because it finds duplicates easily and time complexity will o(n)

import java.util.HashSet;

public class Duplicatenumber {

    public boolean findrepeatednumber(int[] number)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int nums: number)
        {
            if(set.contains(nums))
            {
                return true;
            }
            set.add(nums);

        }
        return false;
    }
    public static void main(String[] args) {
        int[] number = {1,2,3,2,4};
        Duplicatenumber obj = new Duplicatenumber();
        boolean result = obj.findrepeatednumber(number);
        System.out.println("Duplicate number is : " +result);


    }



}
