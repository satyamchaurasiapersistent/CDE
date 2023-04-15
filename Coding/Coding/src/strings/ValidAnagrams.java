package strings;

import java.util.HashMap;

public class ValidAnagrams {
    public static void main(String[] args) {
        String source="anagram";
        String target="nagaram";
        boolean flagIndicator= true;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<source.length();i++){
            hm.putIfAbsent(source.charAt(i),0);
            hm.put(source.charAt(i),hm.get(source.charAt(i))+1);
        }

        for(int i=0;i<target.length();i++){
            if(hm.get(target.charAt(i))==null){
                System.out.println("Source and Target Strings are not Anagram.");
                flagIndicator=false;
                break;
            }

            if(hm.get(target.charAt(i))>0){
                hm.put(target.charAt(i),hm.get(target.charAt(i))-1);
                if(hm.get(target.charAt(i))==0)
                    hm.remove(target.charAt(i));
            }else{
                hm.remove(target.charAt(i));
            }
        }

        if(hm.size()==0 && flagIndicator)
        System.out.println("Source and Target Strings are Anagram.");
    }
}
