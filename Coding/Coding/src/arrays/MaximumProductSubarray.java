package arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, -2, -4};
        int max = nums[0], min = nums[0];
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                max = max + min;
                min = max - min;
                max = max - min;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            result = Math.max(result, max);
        }
        System.out.println("Maximum Product Sub-Array is : " + result);
    }
}
