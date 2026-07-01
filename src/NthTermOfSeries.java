// series 1,3,6,10,15,21.....

public class NthTermOfSeries {
    public static int findNthTerm(int a){
        return a*(a+1)/2;
    }
    public static void main(String[] args) {
        System.out.println(findNthTerm(3));
    }
}
