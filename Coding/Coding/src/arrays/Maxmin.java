package arrays;

public class Maxmin {
    static class Pair {
        int min, max;
    }

    public static void main(String[] args) {

        //With total number of comparisons 2n
        {

//            int[] numAr = new int[]{22, 14, 8, 17, 35, 3};
//
//            int min = Integer.MAX_VALUE;
//            int max = Integer.MIN_VALUE;
//
//            for (int i = 0; i < numAr.length; i++) {
//                if (numAr[i] < min) {
//                    min = numAr[i];
//                }
//                if (numAr[i] > max) {
//                    max = numAr[i];
//                }
//            }
//
//            System.out.println("Min Value is : " + min + " and Maximum value is : " + max);
        }

        int[] numAr = new int[]{22, 14, 8, 17, 35, 3};
        Pair numpairs = findMinMax(numAr, 0, numAr.length - 1);
        System.out.println("Min Value is : " + numpairs.min + " and Maximum value is : " + numpairs.max);


    }

    public static Pair findMinMax(int[] ar, int low, int high) {

        Pair minMax = new Pair();

        if (low == high) {
            minMax.min = ar[low];
            minMax.max = ar[low];
            return minMax;
        }
        if (low + 1 == high) {
            if (ar[low] < ar[high]) {
                minMax.min = ar[low];
                minMax.max = ar[high];
            } else {
                minMax.min = ar[high];
                minMax.max = ar[low];

            }

            return minMax;
        }

        int midIndx= (high+low)/2;
        Pair leftPair=findMinMax(ar,low,midIndx);
        Pair rightPair=findMinMax(ar,midIndx+1,high);

        if(leftPair.min<rightPair.min){
            minMax.min=leftPair.min;
        }else{
            minMax.min=rightPair.min;
        }

        if(leftPair.max>rightPair.max){
            minMax.max=leftPair.max;
        }else{
            minMax.max=rightPair.max;
        }

        return minMax;

    }


}
