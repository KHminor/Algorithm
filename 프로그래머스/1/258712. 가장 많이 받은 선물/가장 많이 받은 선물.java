import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        StringTokenizer st;
        int ln = friends.length;
        
        // map으로 멤버 넘버링
        Map<String,Integer> dic = new HashMap<>();
        int idx = 0;
        for (String f: friends) {
            dic.put(f,idx); 
            idx++;
        }
        
        // i,j 같은 크기의 2차원 배열
        int[][] mtx = new int[ln][ln];
        // 선물 지수
        int[] ji_li = new int[ln];
        // 결과
        int[] result = new int[ln];
        
        // 선물 교환
        for (String gift: gifts) {
            st = new StringTokenizer(gift);
            String a = st.nextToken();
            String b = st.nextToken();
            mtx[dic.get(b)][dic.get(a)]+=1;
            ji_li[dic.get(a)]+=1;
            ji_li[dic.get(b)]-=1;
        }
        
        for (int i=0; i<ln; i++) {
            for (int j=0; j<ln; j++) {
                if (i!=j) {
                    if (mtx[j][i] > mtx[i][j] || (mtx[j][i] == mtx[i][j] && ji_li[i]>ji_li[j])) result[i]++;
                }
            }
        }
        
        return Arrays.stream(result).max().orElse(0);
    }
}