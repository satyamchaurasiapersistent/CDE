package arrays;

public class PossibleCombinationOfRElements {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int r=3;

           findCombinations(arr, new int[arr.length],r,0, arr.length-1,0);

    }

    private static void findCombinations(int[] arr,int[] data, int r,int startIndx,int len,int index) {
        if(index==r){
            for(int i= 0;i<r;i++){
                System.out.print(data[i]+" ");
            }
            System.out.println(" ");
            return;
        }

        for(int i= startIndx;i<=len && len-i+1>=r-index;i++){
            data[index]=arr[i];
            findCombinations(arr,data,r,i+1,len,index+1);
        }


    }
}
