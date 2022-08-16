package Arrays;

import java.util.HashMap;
import java.util.Map;



public class MajorityElement {

    public int countMajority(int[]nums){

        Map<Integer,Integer>map = new HashMap<>();
        int count =0;

        for (int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                return map.get(count);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MajorityElement met = new MajorityElement();
        int[]ans = new int[]{3,2,3};
        System.out.println(met.countMajority(ans));
    }
}
