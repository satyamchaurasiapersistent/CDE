package arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = new int[]{4,2,0,3,2,5};

        int[] maxHeightLeft = new int[height.length];
        maxHeightLeft[0] = height[0];


        int[] maxHeightright = new int[height.length];
        for(int i=1 ;i< height.length;i++){
            maxHeightLeft[i]=Math.max(maxHeightLeft[i-1],height[i]);
        }
        maxHeightright[height.length - 1] = height[height.length - 1];
        for(int i=height.length-2 ;i>=0;i--){
            maxHeightright[i]=Math.max(maxHeightright[i+1],height[i]);
        }

        int volume=0;
        for(int i=0;i< height.length;i++){
            volume+=(Math.min(maxHeightLeft[i],maxHeightright[i])*1)-height[i];
        }

        System.out.println("Total Volume trapped in city of water is : "+volume);

    }
}
