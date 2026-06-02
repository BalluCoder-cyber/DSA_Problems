public class EarlyRideFinish {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int minFinish = Integer.MAX_VALUE;

        for(int i=0; i<landStartTime.length;i++){
            int landFinish = landStartTime[i]+landDuration[i];
            for(int j=0; j<waterStartTime.length; j++){
                int startWater = Math.max(landFinish,waterStartTime[j]);
                int finishWater = startWater+waterDuration[j];
                minFinish = Math.min(minFinish,finishWater);
            }
        }

        for(int j = 0; j<waterStartTime.length; j++){
            int waterFinish = waterStartTime[j]+waterDuration[j];
            for(int i=0; i<landStartTime.length;i++){
                int startLand = Math.max(waterFinish,landStartTime[i]);
                int finishLand = startLand+landDuration[i];
                minFinish= Math.min(minFinish,finishLand);
            }
        }


        return minFinish;
    }
    public static void main(String[] args) {

    }
}
