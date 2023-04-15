package arrays;

public class RepeatAndMissing {
    public static void main(String[] args) {
        int[] numsAr = new int[]{2,4,1,2,5};
        int repeat = 0,missingnumber =-1;

        for(int i=0;i<numsAr.length;i++){
            if(numsAr[Math.abs(numsAr[i])-1]>0){
                numsAr[Math.abs(numsAr[i])-1]=-1*numsAr[Math.abs(numsAr[i])-1];
            }else{
                repeat=Math.abs(numsAr[i]);

            }
        }

        for(int i=0;i< numsAr.length;i++){
            if(numsAr[i]>0){
                missingnumber=i+1;
            }
        }

        System.out.println("Missing Number is : "+missingnumber+" and Repeated number is : "+repeat);

    }
}
