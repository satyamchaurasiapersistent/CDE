package strings;

import java.util.HashMap;

public class SentenceToNumeric {
    public static void main(String[] args) {
        HashMap<Character,String> mapper = new HashMap<>();
        mapper.put('A',"2");
        mapper.put('B',"22");
        mapper.put('C',"222");
        mapper.put('D',"3");
        mapper.put('E',"33");
        mapper.put('F',"333");
        mapper.put('G',"4");
        mapper.put('H',"44");
        mapper.put('I',"444");
        mapper.put('J',"5");
        mapper.put('K',"55");
        mapper.put('L',"555");
        mapper.put('M',"6");
        mapper.put('N',"66");
        mapper.put('O',"666");
        mapper.put('P',"7");
        mapper.put('Q',"77");
        mapper.put('R',"777");
        mapper.put('S',"7777");
        mapper.put('T',"8");
        mapper.put('U',"88");
        mapper.put('V',"888");
        mapper.put('W',"9");
        mapper.put('X',"99");
        mapper.put('Y',"999");
        mapper.put('Z',"9999");
        mapper.put(' ',"0");

        StringBuilder result= new StringBuilder();
        String inputStr = "HELLO WORLD";

        for(Character c : inputStr.toCharArray()){
            result.append(mapper.get(c));
        }

        System.out.println("Converted String will be : "+result.toString());


    }
}
