import java.util.*;

public class PhoneLetterCombination {
    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if(digits == null || digits.isEmpty()) return result;

        Map<Character,String> phoneMap = new HashMap<>();
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");

        backtrack(result, phoneMap,digits,0,new StringBuilder());

        return result;
    }

    public static void backtrack(List<String> result, Map<Character, String> phoneMap, String digits, int index, StringBuilder current){

        if(index == digits.length()){
            result.add(current.toString());
            return;
        }
        String letters = phoneMap.get(digits.charAt(index));
        for(char c : letters.toCharArray()){
            current.append(c);
            backtrack(result,phoneMap,digits,index+1,current);
            current.deleteCharAt(current.length()-1);
        }
    }
    public static void main(String[] args) {

        String num= "23";
        System.out.println(letterCombinations(num));
    }
}
