class Solution {
    public String addBinary(String a, String b) {
        int n = Math.max(a.length(), b.length()), carry = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0'): 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append(carry % 2 );
            carry /= 2;
        }
        if (carry > 0) {
            ans.append("1");
        }
        ans.reverse();
        return ans.toString();
    }
}