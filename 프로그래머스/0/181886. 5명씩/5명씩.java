class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length%5!=0?names.length/5+1:names.length/5];
        int idx = 0;
        for (int i=0; i<names.length; i+=5) {
            answer[idx] = names[i];
            idx++;
        }
        return answer;
    }
}