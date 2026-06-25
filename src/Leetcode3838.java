import java.util.HashMap;
import java.util.Map;

public class Leetcode3838 {
    public  static String mapWordWeights(String[] words, int[] weights) {
        String newWord = "";
        int worL = 0;
        int sum =0;
        int modulo;
        Map<Integer,Character> alphabet = new HashMap<>();
        alphabet.put(25,'a');
        alphabet.put(24,'b');
        alphabet.put(23,'c');
        alphabet.put(22,'d');
        alphabet.put(21,'e');
        alphabet.put(20,'f');
        alphabet.put(19,'g');
        alphabet.put(18,'h');
        alphabet.put(17,'i');
        alphabet.put(16,'j');
        alphabet.put(15,'k');
        alphabet.put(14,'l');
        alphabet.put(13,'m');
        alphabet.put(12,'n');
        alphabet.put(11,'o');
        alphabet.put(10,'p');
        alphabet.put(9,'q');
        alphabet.put(8,'r');
        alphabet.put(7,'s');
        alphabet.put(6,'t');
        alphabet.put(5,'u');
        alphabet.put(4,'v');
        alphabet.put(3,'w');
        alphabet.put(2,'x');
        alphabet.put(1,'y');
        alphabet.put(0,'z');


        while (worL < words.length){
            for(int i = 0; i<words[worL].length(); i++){
                char letter = words[worL].charAt(i);
                int letterIdx = letter -'a'+ 1;
                sum += weights[letterIdx-1];
            }
            modulo = sum%26;
            newWord += String.valueOf(alphabet.get(modulo));
            sum=0;
            worL++;

        }
        return newWord;
    }
    public static void main(String[] args) {
      String[]  words = {"abcd","def","xyz"};
      int[]  weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words,weights));
    }
}
