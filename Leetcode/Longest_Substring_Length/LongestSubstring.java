
/*
 * Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


link : 
https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

import java.util.Scanner;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0)
            return 0;

        int ans = 0;
        int[] lastIndex = new int[256]; // Assuming ASCII characters

        for (int i = 0, j = 0; j < n; j++) {
            i = Math.max(lastIndex[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            lastIndex[s.charAt(j)] = j + 1;
        }

        return ans;
    }

}

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution sl = new Solution();
        System.out.println("Length of longest String:" + sl.lengthOfLongestSubstring(s));
    }
}
