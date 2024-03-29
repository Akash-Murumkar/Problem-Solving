
/*
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

https://leetcode.com/problems/palindrome-number/


 */

import java.util.Scanner;

/**
 * isPalindrom
 */

class Solution
{
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;

  
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }

        return true;

        
    }

}
public class isPalindrom {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc =new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println("isPalindrom: "+Solution.isPalindrome(input) );
    }
    
}