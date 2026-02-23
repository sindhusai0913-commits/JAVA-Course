package arrayproblems.problem2;

public class FindSecondlargest
{

    public static   int findsecondnumber(int a[])
    {
        if(a.length<2) {
            return -1;
        }
        int smax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++)
        {
            if (a[i] > max) {
                smax = max;
                max = a[i];
            } else if (a[i] > smax && a[i] != max) {
                smax = a[i];

            }

        }
        return smax;
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 5, 7, 8};
        int result = findsecondnumber(a);
        System.out.println("The Second largest number is " +result);
    }


}

