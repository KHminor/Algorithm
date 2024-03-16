class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] result = new int[num2-num1+1];
        int cnt = 0;
        for (int i=num1; i <= num2; i++) {
            result[cnt] = numbers[i];
            cnt++;
        } 
        return result;
    }
}