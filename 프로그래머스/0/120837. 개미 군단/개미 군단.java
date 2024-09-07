class Solution {
    public int solution(int hp) {
        int answer = 0;
        for (int num: new int[] {5,3,1}) {
            answer += hp/num;
            hp %= num;
        }
        return answer;
    }
}