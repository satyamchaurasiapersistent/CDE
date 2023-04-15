package arrays;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 0};
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            int findsum = nums[i] * -1;
            int start = i + 1, end = nums.length - 1;

            while (start < end) {
                if (nums[start] + nums[end] == findsum) {
                    System.out.println("The three pairs is : " + nums[i] + "," + nums[start] + "," + nums[end]);
                    break;
                } else if (nums[start] + nums[end] > findsum) {
                    end--;
                } else {
                    start++;
                }
            }

        }
    }
}
