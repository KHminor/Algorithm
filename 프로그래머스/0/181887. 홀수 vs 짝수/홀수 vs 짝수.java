class Solution {
    public int solution(int[] num_list) {
        int[] answer = {0,0};
        for (int i=0; i<num_list.length; i++) {
            if (i%2!=0) answer[1]+=num_list[i];
            else answer[0]+=num_list[i];
        }
        return Math.max(answer[0],answer[1]);
    }
}