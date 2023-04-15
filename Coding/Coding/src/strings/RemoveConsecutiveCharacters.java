package strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String source = "aabaa";
        StringBuilder result=new StringBuilder();

          for(int i=0;i<source.length();i++){
            if(i<source.length()-1 && source.charAt(i)==source.charAt(i+1)){
                continue;
            }else{
                result.append(source.charAt(i));
            }
        }

        System.out.println(result.toString());

    }
}
