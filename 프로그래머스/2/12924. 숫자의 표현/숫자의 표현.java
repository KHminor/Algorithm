class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            int num = 0;
            for (int j=i; j<=n; j++) {
                if (num+j>=n) {
                    if (num+j == n) answer++;
                    break;
                }
                else num+=j;
            }
        }
        return answer;
    }
}