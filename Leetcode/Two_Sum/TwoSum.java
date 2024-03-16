import java.util.Arrays;
import java.util.HashMap;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */

class Solution{
    public static int[] twoSum(int[] nums, int target){
        /*int[] ans={-1,-1};
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1;j<nums.length; j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;

        Time complexity of this code is n2;
        
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        
        return new int[] { -1, -1 };

    }

}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Example array
        int target = 9; // Example target

        Solution solution = new Solution();
        int[] indices = solution.twoSum(nums, target);

        // Output the result
        if (indices[0] != -1 && indices[1] != -1) {
            System.out.println("Indices of the two numbers: " + Arrays.toString(indices));
            System.out.println("The two numbers are: " + nums[indices[0]] + " and " + nums[indices[1]]);
        } else {
            System.out.println("No solution found.");
        }
        
    }
    
}
