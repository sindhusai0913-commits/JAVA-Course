package problem1;

public class TotalSalary {


    public int  sumsalary(int[] a)
    {
        int sum = 0;

        for(int i = 0; i < a.length; i++)
        {
             sum = sum+a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        TotalSalary obj = new TotalSalary();
        int[] a = {12, 23, 13, 14};
        System.out.println(" total Salary: " +(obj.sumsalary(a)));


    }
}
