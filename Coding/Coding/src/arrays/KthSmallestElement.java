package arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] nums = new int[]{7,10,4,20,15};
        int k = 4;

        PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());


        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                pr.add(nums[i]);
            }else{
                if (pr.peek() > nums[i]) {
                    pr.poll();
                    pr.add(nums[i]);
                }
            }
        }

        System.out.println(k + "'th smallest element is : " + pr.peek());

    }
}
