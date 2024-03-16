import java.util.Arrays;
import java.util.HashMap;

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
