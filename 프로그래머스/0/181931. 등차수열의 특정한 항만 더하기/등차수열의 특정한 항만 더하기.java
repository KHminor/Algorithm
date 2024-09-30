class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int ln = included.length;
        int[] li = new int[ln+1];
        li[0] = a;
        
        int cnt = 1;
        while (cnt<ln) {
            li[cnt] = li[cnt-1]+d;
            if (included[cnt]) answer += li[cnt]; 
            cnt++;
        }
        
        if (included[0]) answer += a; 
        
        return answer;
    }
}