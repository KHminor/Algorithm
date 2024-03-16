class Solution {
    public int solution(int angle) {
        int result = 0;
        if (90 > angle) result = 1;
        else if (90 == angle) result = 2;
        else if (180 > angle) result = 3;
        else result = 4;
        return result;
    }
}