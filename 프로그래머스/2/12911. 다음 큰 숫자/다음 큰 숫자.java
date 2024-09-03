class Solution {
    public int solution(int n) {
        int n_cnt = find(n);
        int result = 0;
        for (int i=n+1; i<=1000000; i++) {
            if (n_cnt == find(i)) {
                result = i;
                break;
            };
        }
        
        return result;
    }
    public static int find(int n) {
        String b_n = Integer.toBinaryString(n);
        int cnt = b_n.length() - b_n.replace("1","").length();
        return cnt;
    }
}