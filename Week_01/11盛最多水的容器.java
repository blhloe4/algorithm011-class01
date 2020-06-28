class Solution {
    public int maxArea(int[] height) {
        int j = height.length - 1;
        int max = 0;
        int area = 0;
        for (int i = 0; i < j;) {
            int l = j - i;
            int high = height[i] > height[j] ? height[j--] : height[i++];
            area = l * high;
            max = max < area ? area : max;
        }
        return max;
    }
}
