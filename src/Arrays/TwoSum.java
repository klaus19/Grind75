package Arrays;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//Time complexity is O(n)

public class TwoSum {

    public int []twoSum(int[]nums,int target,int[]output){
       Map<Integer,Integer>values = new HashMap<>();
        output = new int[2];

       for (int i=0;i<nums.length;i++){
           if (!values.containsKey(target-nums[i])){
               values.put(nums[i],i);
           }else {
               output[0] = values.get(target-nums[i]);
               output[1] = i;
           }
       }
       return output;
    }


}
