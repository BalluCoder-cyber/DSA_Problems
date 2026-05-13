/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
        For example:
        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28
 */
import java.util.Scanner;
public class Excel_Title {
    public static String convertToTitle(int columnNumber) {
      if(columnNumber <= 0) return "";
      String result = "";
      while (columnNumber>0){
          columnNumber--;
          int rem = columnNumber % 26;
          char letter = (char)('A'+ rem);
          result = letter+result;
          columnNumber = columnNumber/26;
      }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to convert into Alphabet: ");
        int inp = sc.nextInt();
        System.out.println(convertToTitle(inp));

    }
}
