public class RemoveDuplicateArr {
    static int duplicateInArr(int[]arr){
        int i=1;
           for(int j =1; j< arr.length; j++){
               if(arr[j-1]!=arr[j]){
                   arr[i] = arr[j];
                   i++;
               }

           }

        return i;
    }
    public static void main(String[] args) {
        int[] arrays = {1,1,2,2,3};

        int k = duplicateInArr(arrays);

        System.out.println("Unique count: " + k);

        for(int i = 0; i < k; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
