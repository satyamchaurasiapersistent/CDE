package arrays;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,5,6,7,8,0};
        int left=0,right= nums.length-1;

        while(left<=right){
            int mid=Math.abs((left+right)/2);
            if(right==0){
                System.out.println("Minimum Value Found is : "+nums[0]);
                break;
            }else if (left== nums.length-1){
                System.out.println("Minimum Value Found is : "+nums[nums.length-1]);
                break;
            }else if(nums[mid+1]>nums[mid] && nums[mid-1]>nums[mid]){
                System.out.println("Minimum Value Found is : "+nums[mid]);
                break;
            }else{
                if(nums[left]<nums[right]){
                   right=mid-1;
                }else{
                    left=mid+1;
                }
            }

        }


    }
}
