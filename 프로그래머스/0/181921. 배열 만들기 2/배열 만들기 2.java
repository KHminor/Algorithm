import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=l; i<=r; i++) {
            if (i%5==0 || i%10==0) {
                String s_num = String.valueOf(i);
                boolean state = true;
                for (int idx=0; idx<s_num.length(); idx++) {
                    char n = s_num.charAt(idx);
                    if (n != '0' && n != '5') {
                        state = false;
                        break;
                    }
                }

                if (state) result.add(i);
            }
        }
        return (result.isEmpty())? new int[] {-1} : result.stream().mapToInt(Integer::intValue).toArray();
    }
}