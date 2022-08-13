package Arrays;



public class BinarySearch {

    public int search(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }


        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // This statement is to prevent Integer overflow in case of larger values.
            // Otherwise mid =(start+end)/2 is also correct.

            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target)
                start = mid + 1;

            else
                end = mid - 1;
        }

        return -1;
    }
}
