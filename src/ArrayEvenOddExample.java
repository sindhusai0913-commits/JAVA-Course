public class ArrayEvenOddExample{
    public static void main(String[] args)
    {
      int a[] = {21, 13, 25, 18, 19, 20, 23, 24, 32, 16};
      int even = 0; // counter
      int odd = 0; // counter
      for(int i = 0; i<a.length; i++) //0<10// for(intilzation, condition, incerment)
      {
          if(a[i]%2==0) // 21
              // it is even it will get into block, or it is odd, go to else block
          {
              even++;
          }
          else //21
          {
              odd++;

          }
      }
      System.out.println("even number = " +even);
      System.out.println("odd number = " +odd);

    }

}
