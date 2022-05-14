import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        int[] result = new int[2];
        int first;
        for(int i=0; i<nums.length; i++) {
            if(hm.containsKey(target - nums[i])) {
                first = hm.get(target - nums[i]);
                result[0] = first;
                result[1] = i;
                break;
            }
            hm.put(nums[i], i);
        }
        return result;
    }
}