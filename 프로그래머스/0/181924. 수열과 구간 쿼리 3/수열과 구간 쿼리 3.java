class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] li: queries) {
            int num = arr[li[0]];
            arr[li[0]] = arr[li[1]];
            arr[li[1]] = num;
        }
        return arr;
    }
}