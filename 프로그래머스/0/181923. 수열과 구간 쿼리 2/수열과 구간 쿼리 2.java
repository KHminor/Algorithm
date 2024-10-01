class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        for (int[] li: queries) {
            int num = 1000001;
            for (int i=li[0]; i<=li[1]; i++) {
                if (arr[i]>li[2] && num>arr[i]) num = arr[i];
            }
            answer[idx] = num==1000001?-1:num;
            idx++;
        }
        return answer;
    }
}