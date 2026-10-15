import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class LeetCode2913 {
    public static int sumCounts(List<Integer> nums) {
        int sum =0;
        int n = nums.size();
        for(int i=0; i<n; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i; j<n; j++){
                set.add(nums.get(j));
                int count = set.size();
                sum += count*count;
            }
        }
        return sum;
    }
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(sumCounts(list));

    }
}
