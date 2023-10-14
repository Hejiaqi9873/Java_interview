import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i= 0; i < nums.length; i++)
        {
            map.put(nums[i], nums[i]);
        }
        
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(twoSum(nums, 9));
    }
}