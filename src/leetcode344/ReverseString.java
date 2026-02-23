package leetcode344;
  /* Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
   */

import java.util.Arrays;

public class ReverseString {
    // here we reverse a string "heelo" by using two pointers
    char[] s = {'h', 'e', 'l', 'l', 'o'};


    public void reversedstring(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;

        }

    }
    public static void main(String[] args) {
        ReverseString reverse = new ReverseString();
        reverse.reversedstring(reverse.s);
        System.out.println(Arrays.toString(reverse.s));
    }
}
