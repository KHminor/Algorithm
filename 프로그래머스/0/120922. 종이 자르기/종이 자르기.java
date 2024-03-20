class Solution {
    public int solution(int M, int N) {
        int mx = Math.max(M,N);
        int mn = Math.min(M,N);
        return (mx-1)*mn+mn-1;
    }
}