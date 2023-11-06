import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i= 0; i < nums.length; i++)
        {
            if (map.containsKey(target-nums[i])) {
                output[0] = map.get(target-nums[i]);
                output[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] item = twoSum(nums, 9);
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }

    }
}