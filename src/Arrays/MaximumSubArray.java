package Arrays;


//[1,-3,2,1,-1]

public class MaximumSubArray {

    public int findSum(int nums[]){

        int curr_sum=nums[0];
        int max_sum =curr_sum;


        for (int i=1;i<nums.length;i++)
        {
           curr_sum = Math.max(curr_sum+nums[i],nums[i]);
           max_sum= Math.max(max_sum,curr_sum);




        }
        return max_sum;
    }

    public static void main(String[] args) {
        MaximumSubArray max = new MaximumSubArray();
        int[]nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max.findSum(nums));
    }
}
