package Arrays.TwoSum.example;

public class TwosumExample {
 int[] arr = {2,7,11,15};
     int target = 9;

     public int[] getTarget ()
     {
         for(int i=0; i<arr.length; i++)
         {
             for(int j=0; j<arr.length; j++)
             {
                 if(target == arr [i]+ arr [j])
                 {
                     return new int[]{i,j};
                 }

             }

         }
         return new int[] {-1,-1};
     }

    public static void main(String[] args)
    {
        TwosumExample obj = new TwosumExample();
         int[] result = obj.getTarget();
         System.out.println("Sum of two indexes =  " + result[0] + "  " + result[1]);
         System.out.println("Sum of two Values: =  " + obj.arr[result[0]]+ "  " + obj.arr[result[1]]);

    }

}
