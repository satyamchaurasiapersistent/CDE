package arrays;

public class MergeOperationToMakeArrayPallindrome {
    public static void main(String[] args) {
        int arr[] = new int[]{11, 14, 15, 99};

        int result=0,left=0,right= arr.length-1;

        while(left<right){
            if(arr[left]==arr[right]){
                left++;
                right--;
            }else if(arr[left]>arr[right]){
                right--;
                arr[right]+=arr[right+1];
                result++;
            }else{
                left++;
                arr[left]+=arr[left-1];
                result++;
            }
        }

        System.out.println("Total Number of Merge Operations required is : "+result);



    }
}
