package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "ABDEFGABEF";

        int result=Integer.MIN_VALUE;
        int startPtr=0,endPtr=0;
        Set<Character> chsrset = new HashSet<>();

        while(endPtr<s.length()){
            if(!chsrset.contains(s.charAt(endPtr))){
                chsrset.add(s.charAt(endPtr));
                result=Math.max(result,endPtr-startPtr+1);
                endPtr++;
            }else{
                chsrset.remove(s.charAt(startPtr));
                startPtr++;
            }
        }

        System.out.println("The length of the longest non-repeating character substring is : "+result);

    }
}
