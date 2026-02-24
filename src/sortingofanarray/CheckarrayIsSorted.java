package sortingofanarray;

import java.util.Arrays;

public class CheckarrayIsSorted {
    int a[] = {2, 3, 5, 6, 1, 7};
//    public boolean arrayIssortedorNot(){
//        for(int i = 1; i< a.length; i++){
//            if(a[i] < a[i-1]){
//                return  false;
//
//
//            }
//        }
//        return true;
//    }
    public int[] returnSortedarray(){
        Arrays.sort(a);
        return a;
    }


    public static void main(String[] args) {
        CheckarrayIsSorted obj = new CheckarrayIsSorted();
//        System.out.println(obj.arrayIssortedorNot());
        System.out.println(Arrays.toString(obj.returnSortedarray()));
    }

}
