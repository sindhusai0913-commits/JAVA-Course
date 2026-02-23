package methodexample.functionscopeexample;

public class swap {

    public void  swapping(int num1, int num2){
        /// here we can't access the num1, num2 in main method, because it is known as function scope
        // he changes will be valid in the method only
        // the memory is used is stack

        int temp = num1;
      num1 = num2;
      num2 = temp;
        System.out.println("Swapping of number1: " +num1);
        System.out.println("Swapping of number2: " +num2);

    }

    public static void main(String[] args) {
        swap sc = new swap();
        sc.swapping(30, 80);
        int a = 17;
        int b = 12;

        {
             a = 13;
             // if it was already intialized, we cannot use same data type but we can change the value
             int c = 19;
            System.out.println(c);
            System.out.println(a);
        // values intialized in this block , will remain unchanged , we can't print outside of block
        }
        System.out.println(b);
       // scope for loops
//      any thing intailized in for loop.
        {
             //  will remain unchanged , we can't use outside of block(i.j)
        }
    }

}
