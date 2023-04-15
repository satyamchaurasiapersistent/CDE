package strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[] {
                "dog","racecar","car"
        };
        Arrays.sort(strs);
        StringBuilder result=new StringBuilder();

        String primary=strs[0];
        String secondary=strs[strs.length-1];
        for(int i=0;i<(primary.length()<secondary.length()?primary.length():secondary.length());i++){
            if(primary.charAt(i)==secondary.charAt(i)){
                result.append(primary.charAt(i));
            }else{
                break;
            }
        }
        System.out.println("Longest Common prefix in given array is : "+result.toString());
    }
}
