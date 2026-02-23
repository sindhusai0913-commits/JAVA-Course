package PrimeNumber;

public class PrimeNumber {

    public static boolean PrimeNumberIsnot( int n)
    {
        if(n <= 0)
            return false;
        for(int i = 2; i*i <= n; i++)
        {
            if (n%i == 0)
                return false;

        }
        return true;

    }
    public static void main(String[] args) {
        int n = 0;
     System.out.println(PrimeNumberIsnot(n));
    }
}
