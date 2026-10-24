import java.util.HashMap;
import java.util.Map;

public class LeetCode2409 {
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       String[] aliceArriveDate = arriveAlice.split("-");
       int aliceArrivalMonth = Integer.parseInt(aliceArriveDate[0]);
       int aliceArriveDay = Integer.parseInt(aliceArriveDate[1]);

        String[] aliceLeaveDate = leaveAlice.split("-");
        int aliceLeaveMonth = Integer.parseInt(aliceLeaveDate[0]);
        int aliceLeaveDay = Integer.parseInt(aliceLeaveDate[1]);

        String[] bobArriveDate = arriveBob.split("-");
        int bobArrivalMonth = Integer.parseInt(bobArriveDate[0]);
        int bobArriveDay = Integer.parseInt(bobArriveDate[1]);

        String[] bobLeaveDate = leaveBob.split("-");
        int bobLeaveMonth = Integer.parseInt(bobLeaveDate[0]);
        int bobLeaveDay = Integer.parseInt(bobLeaveDate[1]);

        int aliceDays = aliceArriveDay;
        int bobDays = bobArriveDay;
        int aliceLeaveDays = aliceLeaveDay;
        int bobLeaveDays = bobLeaveDay;
        for(int i =0; i < aliceArrivalMonth-1; i++){
            aliceDays += month[i];
        }
        for(int i =0; i < bobArrivalMonth-1; i++){
            bobDays += month[i];
        }
        for(int i =0; i < bobLeaveMonth-1; i++){
            bobLeaveDays += month[i];
        }
        for(int i =0; i < aliceLeaveMonth-1; i++){
            aliceLeaveDays += month[i];
        }
        return Math.max(0,Math.min(aliceLeaveDays,bobLeaveDays)-Math.max(aliceDays,bobDays)+1);
    }

    public static void main(String[] args) {
       String arriveAlice = "08-15";
       String leaveAlice = "08-18";
       String arriveBob = "08-16";
       String leaveBob = "08-19";
       System.out.println(countDaysTogether(arriveAlice,leaveAlice,arriveBob,leaveBob));
    }
}
