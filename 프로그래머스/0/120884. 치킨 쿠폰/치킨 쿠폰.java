class Solution {
    public int solution(int chicken) {
        int result = 0;
        while (chicken >= 10) {
            int dack = chicken/10;
            result += dack;
            chicken = chicken%10+dack;
        }
        return result;
    }
}