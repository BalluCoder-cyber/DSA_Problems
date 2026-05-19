public class BinaryConvertion {
    static String intTOBinary(int n) {
        if (n == 1) return "1";
        String binary = " ";
        while (n > 0) {
            binary = (n%2) + binary;
            n = n / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println(intTOBinary(3));

    }
}
