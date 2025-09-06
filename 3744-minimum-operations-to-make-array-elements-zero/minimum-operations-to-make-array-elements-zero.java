class Solution {
    public long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] q : queries) {
            int l = q[0], r = q[1];
            long sum = prefix(r) - prefix(l - 1);
            ans += (sum + 1) / 2;
        }
        return ans;
    }

    private long prefix(long n) {
        if (n <= 0) return 0;
        long res = 0;
        long start = 1;
        int k = 0;
        while (start <= n) {
            long end = start * 4 - 1;
            long val = k + 1;
            if (n >= end) {
                res += val * (end - start + 1);
            } else {
                res += val * (n - start + 1);
                break;
            }
            start *= 4;
            k++;
        }
        return res;
    }
}