package arrayproblems.problem1;

public class FindLargestElement {
    int [] a = {1, 2, 3, 5, 7, 8};
    // here we are using  single approach as optimal method
    // intialize  index 0 as  largest number


    public int largestnumber(){
        int Largest = a[0];
        for(int i = 1; i< a.length; i++)
        {
            if(a[i] > Largest)
            {
                Largest = a[i];
            }
        }
        return Largest;
    }

    public static void main(String[] args) {
        FindLargestElement arr = new FindLargestElement();
        int n = arr.largestnumber();
        System.out.println(n);
    }



}
