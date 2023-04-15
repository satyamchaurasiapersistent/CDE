package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {
        Integer[] ar = new Integer[]{3, 2, 1 };

        //Find Drop index
        int dropIndx = -1;
        for (int i = ar.length - 1; i > 0; i--) {
            if (ar[i - 1] < ar[i]) {
                dropIndx = i - 1;
                break;
            }
        }
        System.out.println("The Drop Indx is : " + dropIndx);

        if (dropIndx == -1) {
            Collections.reverse(Arrays.asList(ar));
        } else {

            for (int j = ar.length - 1; j > dropIndx; j--) {
                if (ar[j] > ar[dropIndx]) {
                    int temp = ar[dropIndx];
                    ar[dropIndx] = ar[j];
                    ar[j] = temp;
                    break;
                }
            }

            Integer[] arr1 = Arrays.copyOfRange(ar, dropIndx+1, ar.length);
            Collections.reverse(Arrays.asList(arr1));
            System.arraycopy(arr1, 0, ar, dropIndx+1, arr1.length);


        }


        System.out.println("The Next Permutation is : ");
        for (int i : ar) {
            System.out.print(i + ",");
        }

    }
}
