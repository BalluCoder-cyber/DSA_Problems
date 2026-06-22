public class LeetCode1189 {
    public static int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = o;

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b':
                    b++;
                    break;
                case 'a':
                    a++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;
            }
        }

        return Math.min(b, Math.min(a, Math.min(n, Math.min(l / 2, o / 2))));
    }
    public static void main(String[] args) {
        String text = "ballownoonballownbalod";
        System.out.println(maxNumberOfBalloons(text));
    }
}
