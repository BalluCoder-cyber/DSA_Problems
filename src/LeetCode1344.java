public class LeetCode1344 {
    public static double angleClock(int hour, int minutes) {

        double hourDeg = (double) (hour * 60) /2;
        double hourDisplacement =(double) minutes/2;
        double finalHour = hourDeg+hourDisplacement;
        double minDeg = (double) minutes*6;
        double degDiff = Math.abs(finalHour- minDeg);

        return Math.min (degDiff,360-degDiff);
    }
    public static void main(String[] args) {
        System.out.println(angleClock(12,30));
    }
}
