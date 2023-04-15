package arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int start = 0, end = nums.length - 1;
        int result = Integer.MIN_VALUE;
        while (start < end) {
            int area = Math.min(nums[start], nums[end]) * (end - start);
            if (result < area) result = area;
            if (nums[start] < nums[end]) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println("Maximum Area of water is : " + result);

    }
}
