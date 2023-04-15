package arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] numAr = new int[]{5,4,-1,7,8};
        int meh = 0, mso = Integer.MIN_VALUE;
        for (int i : numAr) {
            meh = meh + i;
            if (mso < meh) {
                mso = meh;
            }
            if (meh < 0) {
                meh = 0;
            }
        }

        System.out.println("Maximum sum of SubArray is : " + mso);
    }
}
