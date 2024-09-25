class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int cnt = 0;
        for (int i=k; i<=n; i+=k) {
            answer[cnt] = i;
            cnt++;
        }
        return answer;
    }
}