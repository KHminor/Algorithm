import java.util.List;
import java.util.stream.*;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> li = new ArrayList<>(Arrays.asList(n));
        int now = n;
        while (now!=1) {
            if (now%2==0) now/=2;
            else now = now*3+1;
            li.add(now);
        }
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}