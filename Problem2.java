/*moves all the zeroes to the end of the array while retaining the order of the non-zero elements*/
public class Problem2 {
    public int[] moveZero(int[] nums){
        int left=0;
        for (int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                if(left!=right) {
                    int temp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;
                }
                left++;
            }

        }
        return nums;
    }
}
