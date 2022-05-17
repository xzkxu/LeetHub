class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (right > left) {
            int pivot = left + ((right - left)/2);
            if(nums[pivot] == target) { 
                return pivot;
            }
            if(nums[pivot] < target) {
                left = pivot+1;
            }
            if(nums[pivot] > target) {
                right = pivot;
            }
        }
        return -1;
    }
}