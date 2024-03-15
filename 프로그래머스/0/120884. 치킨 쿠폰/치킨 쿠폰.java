class Solution {
    public int solution(int chicken) {
        int result = chicken/9;
        if (chicken%9==0) result--;
        return (result < 0) ? 0:result;
    }
}