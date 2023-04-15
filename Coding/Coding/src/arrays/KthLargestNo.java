package arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestNo {
    public static void main(String[] args) {
        int[] intgrAr = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        PriorityQueue<Integer> pr = new PriorityQueue<>();

        for (int i = 0; i < intgrAr.length; i++) {
            if (i < k) pr.add(intgrAr[i]);

            if (intgrAr[i] > pr.peek() && pr.size() >= k) {
                pr.poll();
                pr.add(intgrAr[i]);
            }
        }

        System.out.println(k + "'th largest element in present array is : " + pr.peek());

    }
}
