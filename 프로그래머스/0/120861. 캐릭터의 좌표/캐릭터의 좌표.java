class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] mx = new int[]{board[0]/2,board[1]/2};
        int[] answer = new int[]{0,0};

        for (String key: keyinput) {
            if (key.equals("right") && mx[0] >= answer[0]+1) answer[0] += 1;
            else if (key.equals("left") && mx[0] >= Math.abs(answer[0]-1)) answer[0] -= 1;
            else if (key.equals("up") && mx[1] >= answer[1]+1) answer[1] += 1;
            else if (key.equals("down") && mx[1] >= Math.abs(answer[1]-1)) answer[1] -= 1;
        }
        return answer;
    }
}