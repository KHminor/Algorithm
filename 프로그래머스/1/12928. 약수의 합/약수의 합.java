class Solution {
    public int solution(int n) {
        int result = 0;
        for (int i=1; i<= (int) Math.floor(Math.sqrt(n)); i++) {
            if (n%i==0) {
                int x = n/i;
                if (x!=i) result += x;
                result += i;
            }
        }
        return result;
    }
}