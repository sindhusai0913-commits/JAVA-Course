package secondlargestnumber;

public class SecondLargestNumber {
    int a[] = {12, 2, 3, 4, 5, 6,7, 10};
    int MAX = a[0];
    int secondLargest = Integer.MIN_VALUE;

     public int findsecondLargestnumber(){
        for(int i = 0; i <= a.length-1; i++) {
            if (a[i] >MAX)
            {
                secondLargest = MAX;
                MAX = a[i];
            }
            else if (a[i] > secondLargest && a[i] != MAX)
            {
                secondLargest = a[i];
            }
        }
        return secondLargest;



     }

    public static void main(String[] args) {
      SecondLargestNumber Obj = new SecondLargestNumber();
      Obj.findsecondLargestnumber();
      System.out.println(Obj.findsecondLargestnumber());
    }
}
