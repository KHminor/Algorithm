class Solution {
    public int solution(String A, String B) {
        int ln = A.length();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<ln; i++) {
            boolean state = true;
            for (int j=0; j<ln; j++) {
                sb.append(B.charAt((i+j)%ln));               
                if (!A.substring(0,j+1).contentEquals(sb)) {
                    state = false;
                    break;
                }
            }            
            if (state) return i;
            sb.delete(0,ln);
        }
        return -1;
    }
}