public class Maximum_Water {
    public static int maxArea(int[] height) {
        //first way with O(n^2);
       /*
        if(height.length==1)return height[0];

        int maxArea = 0;
        for(int i = 0; i<height.length-1; i++){
            for(int j =1; j<height.length; j++){
                int min = Math.min(height[i],height[j]);
                int width = (j-i);
                int area = min*width;
                maxArea = Math.max(maxArea,area);
            }
        }

        */
        // second way with O(n)
        int maxArea = 0;
        int i = height.length-1;
        int j = 0;
        while (j < i){
            int min = Math.min(height[i],height[j]);
            int width = (i-j);
            int area = min*width;
            maxArea = Math.max(maxArea,area);

            if(height[j]<height[i]){
                j++;
            }else {
                i--;
            }
        }
       return maxArea;
    }
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

    }
}
