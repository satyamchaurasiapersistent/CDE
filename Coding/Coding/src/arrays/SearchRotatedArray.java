package arrays;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println("Index of given key in array is : " + findIndexofKey(nums, 5));
    }

    public static int findIndexofKey(int[] ar, int key) {

        int left = 0, right = ar.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (ar[mid] == key) {
                return mid;
            }

            if (ar[left] < ar[mid]) {
                if (key<ar[mid] && key >= ar[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (key> ar[mid] && key<=ar[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }


        }
        return -1;
    }
}
