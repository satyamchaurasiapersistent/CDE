package arrays;

public class FindPairSumInRotatedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{11, 15, 26, 38, 9, 10};
        int sum = 350000;
        for (int i = 0; i < nums.length; i++) {
            int result = findPairSum(nums, sum - nums[i]);
            if (result != -1) {
                System.out.println("Pair Found and is : (" + nums[i] + "," + nums[result] + ").");
                break;
            }
        }
    }

    public static int findPairSum(int[] nums, int key) {

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = Math.abs((left + right) / 2);

            if (nums[mid] == key) {
                return mid;
            } else {
                if (nums[right] > nums[mid]) {
                    if (key > nums[mid] && key <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    if (key >= nums[left] && key < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }


        }

        return -1;
    }


}
