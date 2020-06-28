class Solution {
    public int climbStairs(int n) {
        int[] arrs = new int[n + 1];
        int i = climbStairsArr(n, arrs);
        return i;
    }

    private int climbStairsArr(int n, int[] arrs) {
        if (n <= 2) {
            return n;
        }
        if(arrs[n]>0){
            return arrs[n];
        }
        arrs[n] = climbStairsArr(n - 1, arrs) + climbStairsArr(n - 2, arrs);
        return arrs[n];
    }
}