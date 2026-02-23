package leetcode53;

public class subarray {


    int Start = 0;
    int end = 0;
    int temp = 0;


    public int Sum(int[] a){
        int Currentsum = a[0];
        int max = a[0];
        for(int i =0; i<a.length; i++)
        {
            if (a[i] > Currentsum + a[i])
            {
                Currentsum = a[i];
                temp = i;
            } else
            {
                Currentsum = Currentsum + a[i];
            }
            if (Currentsum > max) {
                max = Currentsum;
                Start = temp;
                end = i;

            }

        }
        return max;
    }

    public static void main(String[] args) {
        subarray obj = new subarray();
        int[] a = {12, 23, 34, 56, 90};
        System.out.println("SumofSubArray : " +obj.Sum(a));
    }

}
