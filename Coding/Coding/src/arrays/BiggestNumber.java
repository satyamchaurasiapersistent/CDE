package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 34, 3, 98, 9, 76, 45, 4};
        String[] strNumsAr= new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNumsAr[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(strNumsAr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String fstNum= o1+o2;
                String sndNum= o2+o1;
                return sndNum.compareTo(fstNum);
            }
        });

        System.out.println(Arrays.toString(strNumsAr));

    }
}
