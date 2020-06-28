class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> lists = new HashSet<>();
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        int j = nums.length - 1;
        for (int i = 0; i < j - 1; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int start = i + 1;
            int end = j;
            while (start < end) {
                if (nums[i] + nums[start] + nums[end] < 0) {
                    while (start < end &&nums[start]==nums[++start]){}
                } else if (nums[i] + nums[start] + nums[end] == 0) {
                    lists.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end &&nums[end]==nums[--end]){}
                    while (start < end &&nums[start]==nums[++start]){}
                } else {
                    while (start < end &&nums[end]==nums[--end]){}
                }
            }
        }
        return new ArrayList(lists);
    }
}