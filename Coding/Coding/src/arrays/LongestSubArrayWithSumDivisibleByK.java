package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubArrayWithSumDivisibleByK {


    public static void main(String[] args) {
        int[] nums = new int[]{-2, 2, -5, 12, -11, -1, 7};
        int k = 3;
        int sum = 0, result = 0;



        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if(remainder<0) remainder+=k;
            hm.putIfAbsent(remainder, i);
            hm.put(remainder, Math.min(hm.get(remainder), i));
            if (hm.get(remainder) != null && hm.get(remainder) != i)
                result = Math.max(result, i - hm.get(remainder));
        }

        System.out.println("Longest SubArray whose sum is divisible by " + k + " is : " + result);

    }
}
