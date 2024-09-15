class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n%2==1)?n/2+1:n/2];
        int idx = 0;
        for (int i=1; i<=n; i+=2) {
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}