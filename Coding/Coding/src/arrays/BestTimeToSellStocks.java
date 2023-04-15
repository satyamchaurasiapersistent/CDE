package arrays;

public class BestTimeToSellStocks {
    public static void main(String[] args) {
        int[] stockPrcAr = new int[]{3, 1, 4, 8, 7, 2, 5};

        int minPriceSoFar = stockPrcAr[0], profit = 0;
        for (int i = 1; i < stockPrcAr.length; i++) {
            if (stockPrcAr[i] < minPriceSoFar) {
                minPriceSoFar = stockPrcAr[i];
            }
            if (stockPrcAr[i] - minPriceSoFar > profit) {
                profit = stockPrcAr[i] - minPriceSoFar;
            }
        }

        System.out.println("Maximum Profit By Selling share is : " + profit);


    }
}
