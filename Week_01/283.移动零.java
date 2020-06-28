class Solution {
    public void moveZeroes(int[] nums) {
        int j = nums.length - 1;
        int a = 0;
        int b = Integer.MAX_VALUE;
        for (int i = 0; i <= j; i++) {
            if(nums[i]==0&&b>j){
                b=i;
            }
            if (nums[i]!=0&&i>b){
                nums[b]=nums[i];
                nums[i]=0;
                b++;
            }
        }

    }
}