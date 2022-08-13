package Arrays;


//[1,-3,2,1,-1]

public class MaximumSubArray {

    static int findSum(int nums[]){
        int curr_sum = 0;
        int max_sum=Integer.MIN_VALUE;

        for (int i=0;i<nums.length;i++)
        {
            curr_sum +=nums[i];
            if (max_sum<curr_sum){
                max_sum=curr_sum;
                if (curr_sum<0){
                    curr_sum=0;
                }
            }


        }
        return max_sum;
    }

    public static void main(String[] args) {
        MaximumSubArray max = new MaximumSubArray();
        int[]nums = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(max.findSum(nums));
    }
}
