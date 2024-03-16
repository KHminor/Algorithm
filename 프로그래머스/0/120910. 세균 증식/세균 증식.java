class Solution {
    public int solution(int n, int t) {
        int result = n;
        int cnt = 0;
        while (cnt != t) {
            cnt++;
            result*=2;
        }
        return result;
    }
}