public class maxandmin{
    int max;
    int min;

    public void findMaxandMin(int[] marks)
    {
        max = marks[0];
        min = marks[0];
        for(int i = 1; i < marks.length; i++)
        {
            if(marks[i]>max)
            {
                max = marks[i];
            }
            if(marks[i]<min)
            {
                min = marks[i];
            }
        }
        System.out.println("Max Number : " +max);
        System.out.println("Min Number : " +min);

    }

    public static void main(String[] args) {
        int[] marks = {21, 12, 54, 45, 76, 67, 56};
        maxandmin obj = new maxandmin();
        obj.findMaxandMin(marks);
    }

}
