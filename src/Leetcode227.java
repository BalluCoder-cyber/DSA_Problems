public class Leetcode227 {
    public static void computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int areaOfA;
        int areaOfB;
        int areaOfOver;
        int areaOfRec=0;

        if(ax1 < 0 || ax2 < 0 || ay1 < 0 || ay2 < 0 || bx1 < 0 || bx2 < 0 || by1 < 0 || by2 < 0 ){
            ax1 = Math.abs(ax1);
            ax2 = Math.abs(ax2);
            ay1 = Math.abs(ay1);
            ay2 = Math.abs(ay2);
            bx1 = Math.abs(bx1);
            bx2 = Math.abs(bx2);
            by1 = Math.abs(by1);
            by2 = Math.abs(by2);
        }

        int widthA = Math.abs(ax1+ax2);
        int heightA = Math.abs(ay1+ay2);
        areaOfA = widthA*heightA;

        int widthB = Math.abs(bx1+bx2);
        int heightB = Math.abs(by1+by2);
        areaOfB = widthB*heightB;

        int zx1 = Math.min (ax1,bx1);
        int zy1 = Math.min (ay1,by1);
        int zx2 = Math.min(ax2,bx2);
        int zy2 = Math.min (ay2,by2);

        int widthZ = Math.abs (zx1+zx2);
        int heightZ = Math.abs (zy1+zy2);

        areaOfOver = widthZ*heightZ;

        areaOfRec = (areaOfA+areaOfB) - areaOfOver;

        System.out.println(areaOfRec);
    }
    public static void main(String[] args) {
       int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
       computeArea(ax1,ax2,ay1,ay2,bx1,bx2,by1,by2);
    }
}
