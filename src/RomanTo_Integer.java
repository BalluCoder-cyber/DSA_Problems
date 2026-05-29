import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanTo_Integer {
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        Map<Integer, String> roman = new LinkedHashMap<>();
        roman.put(1000, "M");
        roman.put(900, "CM");
        roman.put(500, "D");
        roman.put(400, "CD");
        roman.put(100, "C");
        roman.put(90, "XC");
        roman.put(50, "L");
        roman.put(40, "XL");
        roman.put(10, "X");
        roman.put(9, "IX");
        roman.put(5, "V");
        roman.put(4, "IV");
        roman.put(1, "I");


            for (Map.Entry<Integer, String> entry : roman.entrySet()) {
                while (num >= entry.getKey()) {
                    result.append(entry.getValue());
                    num -= entry.getKey();

                }


            }


        return result.toString();
    }

    public static void main(String[] args) {
        int num = 3749;
        System.out.println(intToRoman(num));
    }
}
