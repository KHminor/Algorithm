import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> li = new LinkedList<>() {{
            add(new int[]{x,0});
        }};
        Set<Integer> visit = new HashSet<>() {{
            add(x);
        }};
        while (!li.isEmpty()) {
            int[] now = li.poll();
            if (now[0] == y) return now[1];
            for (int num: new int[]{now[0]+n,now[0]*2,now[0]*3}) {
                if (num<=y && !visit.contains(num)) {
                    visit.add(num);
                    li.add(new int[]{num,now[1]+1});
                }
            }
        }
        return -1;
    }
}